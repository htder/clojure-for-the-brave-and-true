(ns chapter3.core)

(+ 1 2 3)
(str "It was the panda " "in the library " "with a dustbuster")

(if true
  "By Zeus's hammer!"
  "By Aquaman's Trident!")

(if false
  "By Zeus's hammer!"
  "By Aquaman's Trident")

(if false
  "By Odin's Elbow")

(if true
  (do (println "Success!")
      "By Zeus's hammer!")
  (do (println "Failure!")
      "By Aquaman's trident!"))

(when true
  (println "Success!")
  "abra cadabra")

(nil? 1)
(nil? nil)

(if "bears eat beets"
  "bears beets Battlestar Galacica")

(if nil
  "This won't be the result because nil is falsy"
  "nil is falsy")


(= 1 1)
(= nil nil)
(= 1 2)

(or false nil :large_I_mean_venti :why_cant_i_just_say_large)
(or (= 0 1) (= "yes" "no"))
(or nil)


(and :free_wifi :hot_coffee)

(and :feelin_super_cool nil false)


(def failed-protagonist-names
  ["Larry Potter" "Doreen the Explorer" "The Incredible Bulk"])

failed-protagonist-names


"Lord Voldemort"
"\"He who must not be named\""
"\"Great cow of Moscow!\" - Hermes Conrad"


{}

{:first-name "Charlie"
 :last-name "McFishwich"}

{"string-key" +}

{:name {:first "John" :middle "Jacob" :last "Jingleheimerschmit"}}

(hash-map :a 1 :b 2)

(get {:a 0 :b 1} :b)

(get {:a 0 :b {:c "ho hum"}} :b)

(get {:a 0 :b 1} :c)

(get {:a 0 :b 1} :c "unicorns")

(get-in {:a 0 :b {:c "ho hum"}} [:b :c])

({:name "The Human Coffeepot"} :name)



:a
:rumplestiltsken
:34
:_?

(:a {:a 1 :b 2 :c 3})
({:a 1 :b 2 :c 3} :a)

(:d {:a 1 :b 2 :c 3} "No gnome knows homes likes Noah knows")



[3 2 1]

(get [3 2 1] 0)

(get ["a" {:name "Pugsley Winterbottom"} "c"] 1)
(get (get ["a" {:name "Pugsley Winterbottom"} "c"] 1) :name)

(vector "creepy" "full" "moon")

(conj [1 2 3] 4)


'(1 2 3 4)

(nth '(:a :b :c) 0)

(nth '(:a :b :c) 2)

(list 1 "two" {3 4})

(conj '(1 2 3) 4)



#{"kurt vonnegut" 20 :icicle}
(hash-set 1 1 2 2)

(conj #{:a :b} :b)

(set [3 3 3 4 4])

(contains? #{:a :b} :a)
(contains? #{:a :b} 3)
(contains? #{nil} nil)

(:a #{:a :b})

(get #{:a :b} :a)
(get #{:a nil} nil)
(get #{:a :b} "kurt vonnegut")













































