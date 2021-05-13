(ns motifs
  (:require [utils :refer [play stop key-interpretations]]))

(comment (stop))

(def m1
  "piano: V1: o4 a4 >c+ e f+ | e g f+ e | c+ <a b >c+ | e g f+ r | d f e r | c+ e d e")

(comment
  (play m1)
  (key-interpretations m1)
  ;; => ("C     6 b2  3 b5 |  3  5 b5  3 | b2  6  7 b2 |  3  5 b5 r |  2  4  3 r | b2  3  2  3"
  ;;     "C#   b6  1 b3  4 | b3 b5  4 b3 |  1 b6 b7  1 | b3 b5  4 r | b2  3 b3 r |  1 b3 b2 b3"
  ;;     "Db   b6  1 b3  4 | b3 b5  4 b3 |  1 b6 b7  1 | b3 b5  4 r | b2  3 b3 r |  1 b3 b2 b3"
  ;;     "D     5  7  2  3 |  2  4  3  2 |  7  5  6  7 |  2  4  3 r |  1 b3  2 r |  7  2  1  2"
  ;;     "D#   b5 b7 b2 b3 | b2  3 b3 b2 | b7 b5 b6 b7 | b2  3 b3 r |  7  2 b2 r | b7 b2  7 b2"
  ;;     "Eb   b5 b7 b2 b3 | b2  3 b3 b2 | b7 b5 b6 b7 | b2  3 b3 r |  7  2 b2 r | b7 b2  7 b2"
  ;;     "E     4  6  1  2 |  1 b3  2  1 |  6  4  5  6 |  1 b3  2 r | b7 b2  1 r |  6  1 b7  1"
  ;;     "F     3 b6  7 b2 |  7  2 b2  7 | b6  3 b5 b6 |  7  2 b2 r |  6  1  7 r | b6  7  6  7"
  ;;     "F#   b3  5 b7  1 | b7 b2  1 b7 |  5 b3  4  5 | b7 b2  1 r | b6  7 b7 r |  5 b7 b6 b7"
  ;;     "Gb   b3  5 b7  1 | b7 b2  1 b7 |  5 b3  4  5 | b7 b2  1 r | b6  7 b7 r |  5 b7 b6 b7"
  ;;     "G     2 b5  6  7 |  6  1  7  6 | b5  2  3 b5 |  6  1  7 r |  5 b7  6 r | b5  6  5  6"
  ;;     "G#   b2  4 b6 b7 | b6  7 b7 b6 |  4 b2 b3  4 | b6  7 b7 r | b5  6 b6 r |  4 b6 b5 b6"
  ;;     "Ab   b2  4 b6 b7 | b6  7 b7 b6 |  4 b2 b3  4 | b6  7 b7 r | b5  6 b6 r |  4 b6 b5 b6"
  ;;     "A     1  3  5  6 |  5 b7  6  5 |  3  1  2  3 |  5 b7  6 r |  4 b6  5 r |  3  5  4  5"
  ;;     "A#    7 b3 b5 b6 | b5  6 b6 b5 | b3  7 b2 b3 | b5  6 b6 r |  3  5 b5 r | b3 b5  3 b5"
  ;;     "Bb    7 b3 b5 b6 | b5  6 b6 b5 | b3  7 b2 b3 | b5  6 b6 r |  3  5 b5 r | b3 b5  3 b5"
  ;;     "B    b7  2  4  5 |  4 b6  5  4 |  2 b7  1  2 |  4 b6  5 r | b3 b5  4 r |  2  4 b3  4")

)

(def m1c1
  "V2: o3 <a1/>c+/e/g | <a1/>c+/e/g | <a1/>c+/e/g | <a1/>c+/e/g | <e1/g/b/>d | <d1/f+/a/>c+")

(comment
  (play "piano: o3 <a1/>c+/e/g") ;; A7
  (play "piano: o3 <e1/g/b/>d") ;; Emin7
  (play "piano: o3 <d1/f+/a/>c+") ;; DMaj7
  (play m1 m1c1))



(def ii-v-i-g
  "piano: V1: o3 <a1/>c/e/g | <d/f+/a/>c | <g/>b/d/f+")

(def ii-v-i-g-us-1
  "Melody composed of upper structure chord tones. All US are minor. Use chord 
   tone from underlying chord to get to 8 notes and smooth contour."
  "V2: o4 b8 >d f+ a f+ d <b >d | e g b >d <b g e c | <a b >c e g e c <a")

(def ii-v-i-g-us-2
  "Variation with b9 and b13 in D7 and #11 in GMaj7."
  "V2: o4 b8 >d f+ a f+ d <b >d | e- g b- >c <b g e d | e c+ <a g a >c+ e g")

(def ii-v-i-g-us-3
  "Build tension in middle, more consonant at the start and end."
  "V2: o3 b8 >d c e f g f+ e | e- f+ g b- >c <b g+ g | a >c+ e g e c <a g")

(comment
  (play ii-v-i-g)
  (play ii-v-i-g ii-v-i-g-us-1)
  (play ii-v-i-g ii-v-i-g-us-2)
  (play ii-v-i-g ii-v-i-g-us-3))

(def release-me-m
  "Is this inspired by something?"
  "(tempo! 89)
   trumpet: V1: o5 g2~4 f4 | c1 | g2~4 f4 | d-1 | g2~4 f4 | a-2~4 b-4 | f2~4 g-4 | g2~4 r4")

(comment
  (play release-me-m))

(def m2
  "piano: V1:
   g4. b- r8 f | g b- >c <b- >d12 c <b- >c8 <b-")

(comment
  (play m2)
  (key-interpretations m2)
  ;; => ("C     5 b7 r  4 |  5 b7  1 b7  2  1 b7  1 b7"
  ;;     "C#   b5  6 r  3 | b5  6  7  6 b2  7  6  7  6"
  ;;     "Db   b5  6 r  3 | b5  6  7  6 b2  7  6  7  6"
  ;;     "D     4 b6 r b3 |  4 b6 b7 b6  1 b7 b6 b7 b6"
  ;;     "D#    3  5 r  2 |  3  5  6  5  7  6  5  6  5"
  ;;     "Eb    3  5 r  2 |  3  5  6  5  7  6  5  6  5"
  ;;     "E    b3 b5 r b2 | b3 b5 b6 b5 b7 b6 b5 b6 b5"
  ;;     "F     2  4 r  1 |  2  4  5  4  6  5  4  5  4"
  ;;     "F#   b2  3 r  7 | b2  3 b5  3 b6 b5  3 b5  3"
  ;;     "Gb   b2  3 r  7 | b2  3 b5  3 b6 b5  3 b5  3"
  ;;     "G     1 b3 r b7 |  1 b3  4 b3  5  4 b3  4 b3"
  ;;     "G#    7  2 r  6 |  7  2  3  2 b5  3  2  3  2"
  ;;     "Ab    7  2 r  6 |  7  2  3  2 b5  3  2  3  2"
  ;;     "A    b7 b2 r b6 | b7 b2 b3 b2  4 b3 b2 b3 b2"
  ;;     "A#    6  1 r  5 |  6  1  2  1  3  2  1  2  1"
  ;;     "Bb    6  1 r  5 |  6  1  2  1  3  2  1  2  1"
  ;;     "B    b6  7 r b5 | b6  7 b2  7 b3 b2  7 b2  7")
)

(def m3
  "G Lydian Dominant / G Dorian #4 ?"
  "piano: V1:
   o2 g4. >f4. e | d-8 d4. >b-8 b4. | <<g4. >f4. e | d-8 d4. >b-2 | <<g4. >f4. e | d-8 d4. >b-8 b4. | <<g4. >f4. e | d8 d-4. g2")

(comment
  (play m3)
  (key-interpretations m3)
  ;; => ("C     5  4  3 | b2  2 b7  7 |  5  4  3 | b2  2 b7 |  5  4  3 | b2  2 b7  7 |  5  4  3 |  2 b2  5"
  ;;     "C#   b5  3 b3 |  1 b2  6 b7 | b5  3 b3 |  1 b2  6 | b5  3 b3 |  1 b2  6 b7 | b5  3 b3 | b2  1 b5"
  ;;     "Db   b5  3 b3 |  1 b2  6 b7 | b5  3 b3 |  1 b2  6 | b5  3 b3 |  1 b2  6 b7 | b5  3 b3 | b2  1 b5"
  ;;     "D     4 b3  2 |  7  1 b6  6 |  4 b3  2 |  7  1 b6 |  4 b3  2 |  7  1 b6  6 |  4 b3  2 |  1  7  4"
  ;;     "D#    3  2 b2 | b7  7  5 b6 |  3  2 b2 | b7  7  5 |  3  2 b2 | b7  7  5 b6 |  3  2 b2 |  7 b7  3"
  ;;     "Eb    3  2 b2 | b7  7  5 b6 |  3  2 b2 | b7  7  5 |  3  2 b2 | b7  7  5 b6 |  3  2 b2 |  7 b7  3"
  ;;     "E    b3 b2  1 |  6 b7 b5  5 | b3 b2  1 |  6 b7 b5 | b3 b2  1 |  6 b7 b5  5 | b3 b2  1 | b7  6 b3"
  ;;     "F     2  1  7 | b6  6  4 b5 |  2  1  7 | b6  6  4 |  2  1  7 | b6  6  4 b5 |  2  1  7 |  6 b6  2"
  ;;     "F#   b2  7 b7 |  5 b6  3  4 | b2  7 b7 |  5 b6  3 | b2  7 b7 |  5 b6  3  4 | b2  7 b7 | b6  5 b2"
  ;;     "Gb   b2  7 b7 |  5 b6  3  4 | b2  7 b7 |  5 b6  3 | b2  7 b7 |  5 b6  3  4 | b2  7 b7 | b6  5 b2"
  ;;     "G     1 b7  6 | b5  5 b3  3 |  1 b7  6 | b5  5 b3 |  1 b7  6 | b5  5 b3  3 |  1 b7  6 |  5 b5  1"
  ;;     "G#    7  6 b6 |  4 b5  2 b3 |  7  6 b6 |  4 b5  2 |  7  6 b6 |  4 b5  2 b3 |  7  6 b6 | b5  4  7"
  ;;     "Ab    7  6 b6 |  4 b5  2 b3 |  7  6 b6 |  4 b5  2 |  7  6 b6 |  4 b5  2 b3 |  7  6 b6 | b5  4  7"
  ;;     "A    b7 b6  5 |  3  4 b2  2 | b7 b6  5 |  3  4 b2 | b7 b6  5 |  3  4 b2  2 | b7 b6  5 |  4  3 b7"
  ;;     "A#    6  5 b5 | b3  3  1 b2 |  6  5 b5 | b3  3  1 |  6  5 b5 | b3  3  1 b2 |  6  5 b5 |  3 b3  6"
  ;;     "Bb    6  5 b5 | b3  3  1 b2 |  6  5 b5 | b3  3  1 |  6  5 b5 | b3  3  1 b2 |  6  5 b5 |  3 b3  6"
  ;;     "B    b6 b5  4 |  2 b3  7  1 | b6 b5  4 |  2 b3  7 | b6 b5  4 |  2 b3  7  1 | b6 b5  4 | b3  2 b6")
)

(def m4
  "piano: V1:
   o4 d8. g8 f16 e8 | f8 g16 a16 | c8. f8 e16 d8 | g8 a16 b-16")

(comment
  (play m4))

(def h4
  "vi i V ii"
  "V2:
   o2 d2/>f/<a/>c | <f4/>a/<c/>e | <c2/>e/<g/>b | <g4/>b-/<d/>f")

(comment
  (play "piano:" h4)
  (play m4 h4))

(def h5
  "V2: 
   o2 g2/>b-/<d/>f | <c/>e/<g/>b | <a/>c/<e/>g | <d/>f+/<a/>c+")

(comment
  (play "piano:" h5))

(def m5
  "piano: V1:
   o4 g8 f d <b- | >c d e g | a b >c e | d c <b a")

(comment
  (play m5)
  (play m5 h5))
