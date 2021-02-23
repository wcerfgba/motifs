(ns utils
  (:require [alda.core :as alda]
            [clojure.string :as string]))

(def stop alda/stop!)

(defn play
  [& strs]
  (stop)
  (alda/alda "play" "-c" (string/join " " strs)))


(def events alda/parse-events!)

(def ^:private integer->degree
  {0 "1"
   1 "b2"
   2 "2"
   3 "b3"
   4 "3"
   5 "4"
   6 "b5"
   7 "5"
   8 "b6"
   9 "6"
   10 "b7"
   11 "7"})

(def ^:private notes-integers
  [["C" 0]
   ["C#" 1]
   ["Db" 1]
   ["D" 2]
   ["D#" 3]
   ["Eb" 3]
   ["E" 4]
   ["F" 5]
   ["F#" 6]
   ["Gb" 6]
   ["G" 7]
   ["G#" 8]
   ["Ab" 8]
   ["A" 9]
   ["A#" 10]
   ["Bb" 10]
   ["B" 11]])

(def ^:private note->integer (into {} notes-integers))

(defn- interpret-note-in-key
  [key note]
  (let [{{:keys [accidentals letter]} :pitch} note
        accidental-shift (reduce (fn [acc accidental]
                                   (+ acc (if (= :sharp accidental)
                                            1
                                            -1)))
                                 0
                                 accidentals)
        key-shift (- (note->integer key))
        note-value (note->integer letter)
        degree (integer->degree (mod (+ note-value accidental-shift key-shift)
                                     12))]
    (-> note
        (assoc-in [:duration :components] '())
        (assoc-in [:pitch :accidentals] '())
        (assoc-in [:pitch :letter] degree))))

(defn- interpret-chord-in-key
  [key chord]
  (alda/map->Chord {:events (map (partial interpret-note-in-key key) (:events chord))}))

(defn- interpret-events-in-key
  [key events]
  (reduce (fn [events event]
            (cond (= alda.core.Note (type event))
                  (conj events (interpret-note-in-key key event))

                  (= alda.core.Chord (type event))
                  (conj events (interpret-chord-in-key key event))

                  (= alda.core.Rest (type event))
                  (conj events (assoc-in event [:duration :components] '()))

                  :else
                  (conj events event)))
          []
          events))

(defn- format-note-degree
  [event]
  (cond (= alda.core.Note (type event))
        (update-in event [:pitch :letter] #(format "%2s" %))

        (= alda.core.Chord (type event))
        (alda/map->Chord {:events (map format-note-degree (:events event))})

        :else
        event))

(defn key-interpretations
  [code]
  (let [events (events code)]
    (map (fn [key]
           (format "%-2s   %s" key (->> (interpret-events-in-key key events)
                                       (filter #(#{alda.core.Note
                                                   alda.core.Chord
                                                   alda.core.Barline
                                                   alda.core.Rest} (type %)))
                                       (map format-note-degree)
                                       (alda/->str))))
         (map first notes-integers))))

(comment (key-interpretations "piano: c/e/g"))
