(ns chapter3.core
  (:gen-class))

; (defn -main
;   "I don't do a whole lot ... yet."
;   [& args]
;   (println "Hello, World!"))

(+ 1 2 3)

(str "It was the panda " "in the library " "with a dust buster")

(if true
  "By Zeus's hammer!"
  "By Aquaman's trident!")

(if false
  "By Zeus's hammer!"
  "By Aquaman's trident!")

(if false
  "By Odin's Elbow!")

(if true
  (do (println "Success!")
      "By Zues's hammer!")
  (do (println "Failure!")
      "By Aquaman's trident"))

(when true 
  (println "Success!")
  "abra cadabra")
