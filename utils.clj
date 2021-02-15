(ns utils
  (:require [alda.sound]
            [alda.parser]
            [clojure.string :as string]))

(defn play
  [notes-str]
  (->> notes-str
       (alda.parser/parse-input)
       (alda.sound/play!)))

(def intervals
  {0 :C
   1 :Db
   2 :D
   3 :Eb
   4 :E
   5 :F
   6 :Gb
   7 :G
   8 :Ab
   9 :A
   10 :Bb
   11 :B})

(defn midi-note->letter
  "Given a letter and an octave, returns the MIDI note number.
   e.g. :c, 4  =>  60"
  [midi-note]
  (intervals (mod midi-note 12)))

(defn notes-str
  [score]
  (->> score
       (alda.parser/parse-input)
       (:events)
       (sort-by :offset)
       (map #(select-keys % [:midi-note
                             :beats
                             :type]))
       (map #(assoc % :note (when (= (:type %) :note) (midi-note->letter (:midi-note %)))))
       (reduce (fn [notes-str {:keys [note type]}]
                 (str notes-str " " (format "%-2s"
                                            (cond (= :note type)
                                                  (name note)

                                                  (= :barline type)
                                                  "|"

                                                  (= :rest type)
                                                  "."))))
               "")
       (string/trim)))

(defn transpose-events
  [semitones events]
  (map #(update % :midi-note (partial + semitones)) events))

(comment
  (notes-str "piano: o3
              a4 >c+ e f+ |
              e g f+ e |
              c+ <a b >c+ |
              e g f+ r |
              d f e r |
              c+ e d e"))

