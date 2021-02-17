(ns motifs
  (:require [utils :refer [play key-interpretations]]))

(def m-1
  "piano: o3
   a4 >c+ e f+ | e g f+ e | c+ <a b >c+ |
   e g f+ r | d f e r | c+ e d e")

(comment
  (play m-1)
  (key-interpretations m-1)
  ;; => ("A     1  3  5  6 |  5 b7  6  5 |  3  1  2  3 |  5 b7  6 r |  4 b6  5 r |  3  5  4  5"
  ;;     "A#    7 b3 b5 b6 | b5  6 b6 b5 | b3  7 b2 b3 | b5  6 b6 r |  3  5 b5 r | b3 b5  3 b5"
  ;;     "Ab   b2  4 b6 b7 | b6  7 b7 b6 |  4 b2 b3  4 | b6  7 b7 r | b5  6 b6 r |  4 b6 b5 b6"
  ;;     "B    b7  2  4  5 |  4 b6  5  4 |  2 b7  1  2 |  4 b6  5 r | b3 b5  4 r |  2  4 b3  4"
  ;;     "Bb    7 b3 b5 b6 | b5  6 b6 b5 | b3  7 b2 b3 | b5  6 b6 r |  3  5 b5 r | b3 b5  3 b5"
  ;;     "C     6 b2  3 b5 |  3  5 b5  3 | b2  6  7 b2 |  3  5 b5 r |  2  4  3 r | b2  3  2  3"
  ;;     "C#   b6  1 b3  4 | b3 b5  4 b3 |  1 b6 b7  1 | b3 b5  4 r | b2  3 b3 r |  1 b3 b2 b3"
  ;;     "D     5  7  2  3 |  2  4  3  2 |  7  5  6  7 |  2  4  3 r |  1 b3  2 r |  7  2  1  2"
  ;;     "D#   b5 b7 b2 b3 | b2  3 b3 b2 | b7 b5 b6 b7 | b2  3 b3 r |  7  2 b2 r | b7 b2  7 b2"
  ;;     "Db   b6  1 b3  4 | b3 b5  4 b3 |  1 b6 b7  1 | b3 b5  4 r | b2  3 b3 r |  1 b3 b2 b3"
  ;;     "E     4  6  1  2 |  1 b3  2  1 |  6  4  5  6 |  1 b3  2 r | b7 b2  1 r |  6  1 b7  1"
  ;;     "Eb   b5 b7 b2 b3 | b2  3 b3 b2 | b7 b5 b6 b7 | b2  3 b3 r |  7  2 b2 r | b7 b2  7 b2"
  ;;     "F     3 b6  7 b2 |  7  2 b2  7 | b6  3 b5 b6 |  7  2 b2 r |  6  1  7 r | b6  7  6  7"
  ;;     "F#   b3  5 b7  1 | b7 b2  1 b7 |  5 b3  4  5 | b7 b2  1 r | b6  7 b7 r |  5 b7 b6 b7"
  ;;     "G     2 b5  6  7 |  6  1  7  6 | b5  2  3 b5 |  6  1  7 r |  5 b7  6 r | b5  6  5  6"
  ;;     "G#   b2  4 b6 b7 | b6  7 b7 b6 |  4 b2 b3  4 | b6  7 b7 r | b5  6 b6 r |  4 b6 b5 b6"
  ;;     "Gb   b3  5 b7  1 | b7 b2  1 b7 |  5 b3  4  5 | b7 b2  1 r | b6  7 b7 r |  5 b7 b6 b7")
)
