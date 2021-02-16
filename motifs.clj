(ns motifs
  (:require [alda.core :as alda]))

(def play (partial alda.core/alda "play" "-c"))

(def m-1
  "piano: o3
   a4 >c+ e f+ | e g f+ e | c+ <a b >c+ |
   e g f+ r | d f e r | c+ e d e")

(comment
  (play m-1))



(alda.core/->str (alda.core/parse-events! m-1))
