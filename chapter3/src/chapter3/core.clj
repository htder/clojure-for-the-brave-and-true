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

(or false nil :large_i_mean_venti :why_cant_i_just_say_large)

(or (= 0 1) (= "yes" "no"))

(or nil)

(and :free_wifi :hot_coffee)

(and :feelin_super_cool nil false)

(def greeting
  "Hello World!")

(println greeting);

(hash-map :a 1 :b 2)

(get {:a 0 :b 1} :b)
(get {:a 0 :b {:c "ho hum"}} :b)

(get {:a 0 :b 1} :c "empty")

(get-in {:a 0 :b {:c "ho hum"}} [:b :c])

({:name "The Human Coffeepot"} :name)

(def arr 
  [3 2 1])
(get arr 1)

(get ["a" {:name "Pugsley Winterbottom"} "c"] 1)

(vector "creepy" "full" "moon")

(conj [1 2 3] 4)

'(1 2 3 4)

(nth '(:a :b :c) 0)

(list 1 "two" {3 4})

#{"kurt vonnegut" 20 :icicle}

(hash-set 1 1 2 2)

(set [3 3 3 4 4])

(contains? #{:a :b} :a)

(:a #{:a :b})

(get #{:a :b} :a)
