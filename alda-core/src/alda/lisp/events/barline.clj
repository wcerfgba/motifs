(ns alda.lisp.events.barline
  (:require [alda.lisp.model.event :refer (update-score* add-events)]
            [alda.lisp.score.util     :refer (get-current-instruments)]
            [alda.lisp.model.records :refer [->AbsoluteOffset]]))

(defmethod update-score* :barline
  [{:keys [current-voice] :as score} _]
  "Barlines, at least currently, do nothing when evaluated in alda.lisp."
  (add-events score (map (fn [{:keys [current-offset id]}]
                           {:offset       (->AbsoluteOffset (- (:offset current-offset) 0.1))
                            :instrument   id
                            :volume       0
                            :track-volume 0
                            :panning      0
                            :midi-note    0
                            :pitch        0
                            :duration     0
                            :voice        current-voice
                            :type :barline})
                         (get-current-instruments score))))

