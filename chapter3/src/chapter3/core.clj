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
 :last-name  "McFishwich"}

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



(or + -)

((or + -) 1 2 3)

((and (= 1 1) +) 1 2 3)

((first [+ 0]) 1 2 3)

; error
;(1 2 3 4)
;("test" 1 2 3)


(inc 1.1)

(map inc [0 1 2 3])


;(if boolean-form
;    then-form
;    optional-else-form)

;(if good-mood
;    (tweet walking-on-sunshine-lyrics)
;    (tweet mopey-country-song-lyrics))

(defn too-enthusiastic
  "Return a cheer that might be a bit too enthusiastic"
  [name]
  (str "OH. MY. GOD! " name " YOU ARE MOST DEFINITELY LIKE THE BEST "
       "MAN SLASH WOMAN EVER I LOVE YOU AND WE SHOULD RUN AWAY SOMEWHERE"))

(too-enthusiastic "Zelda")


(defn codger-communication
  [whippersnapper]
  (str "Get off my lawn, " whippersnapper "!!!"))
(defn codger
  [& whippersnappers]
  (map codger-communication whippersnappers))
(codger "Billy" "Anne-Marie" "The Incredible Bulk")


(defn favorite-things
  [name & things]
  (str "Hi, " name ", here are my favorite things: "
       (clojure.string/join ", " things)))

(favorite-things "Doreen" "gum" "shoes" "kara-te")

(defn my-first
  [[first-thing]]
  first-thing)

(my-first ["oven" "bike" "war-axe"])

(defn chooser
  [[first-choice second-choice & unimportant-choices]]
  (println (str "Your first choice is: " first-choice))
  (println (str "Your second choice is: " second-choice))
  (println (str "We're ignoring the rest of your choices. "
                "Here they are in case your need to cry over them: "
                (clojure.string/join ", " unimportant-choices))))

(chooser ["Marmalade" "Handsome Jack" "Pigpen" "Aquaman"])


(defn announce-treasure-location
  [{lat :lat lng :lng}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))

(defn announce-treasure-location1
  [{:keys [lat lng]}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng)))

(announce-treasure-location {:lat 28.22 :lng 81.33})
(announce-treasure-location1 {:lat 28.22 :lng 81.33})


(defn receive-treasure-location
  [{:keys [lat lng] :as treasure-location}]
  (println (str "Treasure lat: " lat))
  (println (str "Treasure lng: " lng))
  (steer-ship! treasure-location))



(defn illustrative-function
  []
  (+ 1 304)
  30
  "joe")
(illustrative-function)

(defn number-comment
  [x]
  (if (> x 6)
    "Oh my gosh! What a big number!"
    "That number's OK, i guess"))

(number-comment 5)

(number-comment 7)



;(fn [param-list]
;  function-body)

(map (fn [name] (str "Hi, " name))
     ["Darth Vader" "Mr. Magoo"])

((fn [x] (* x 3)) 8)

(def my-special-multiplier (fn [x] (* x 3)))
(my-special-multiplier 12)

#(* % 3)

(#(* % 3) 8)

(map #(str "Hi, " %)
     ["Darth Vader" "Mr. Magoo"])

;; Function call
(* 8 3)

;; Anonymous function
#(* % 3)

(#(str %1 " and " %2) "cornbread" "butter beans")

(#(identity %&) 1 "blarg" :yip)




(defn inc-maker
  "Create a customer incrementor"
  [inc-by]
  #(+ % inc-by))

(def inc3 (inc-maker 3))
(inc3 7)



(def asym-hobbit-body-parts [{:name "head" :size 3}
                             {:name "left-eye" :size 1}
                             {:name "left-ear" :size 1}
                             {:name "mouth" :size 1}
                             {:name "nose" :size 1}
                             {:name "neck" :size 2}
                             {:name "left-shoulder" :size 3}
                             {:name "left-upper-arm" :size 3}
                             {:name "chest" :size 10}
                             {:name "back" :size 10}
                             {:name "left-forearm" :size 3}
                             {:name "abdomen" :size 6}
                             {:name "left-kidney" :size 1}
                             {:name "left-hand" :size 2}
                             {:name "left-knee" :size 2}
                             {:name "left-thigh" :size 4}
                             {:name "left-lower-leg" :size 3}
                             {:name "left-achilles" :size 1}
                             {:name "left-foot" :size 2}])

(defn matching-part
  [part]
  {:name (clojure.string/replace (:name part) #"^left-" "right-")
   :size (:size part)})

(defn symmetrize-body-parts
  "Expects a seq of maps that have a :name and :size"
  [asym-body-parts]
  (loop [remaining-asym-parts asym-body-parts
         final-body-parts []]
    (if (empty? remaining-asym-parts)
      final-body-parts
      (let [[part & remaining] remaining-asym-parts]
        (recur remaining
               (into final-body-parts
                     (set [part (matching-part part)])))))))

(symmetrize-body-parts asym-hobbit-body-parts)


(let [x 3] x)

(def damaltian-list
  ["Pongo" "Perdita" "Puppy 1" "Puppy2"])
(let [dalmatians (take 2 damaltian-list)] dalmatians)


(def x 0)
(let [x 1] x)

(def x 0)
(let [x (inc x)] x)

(let [[pongo & dalmatians] damaltian-list]
  [pongo dalmatians])

(into [] (set [:a :a]))


(loop [iteration 0]
  (println (str "Iteration " iteration))
  (if (> iteration 3)
    (println "Goodbye!")
    (recur (inc iteration))))

(loop [iter1 1 iter2 5]
  (println (str "Iter1 " iter1))
  (println (str "Iter2 " iter2))
  (if (> iter1 4)
    (println "stop")
    (recur (inc iter1) (inc iter2))))

(re-find #"^left-" "left-eye")
(re-find #"^left-" "cleft-chin")
(re-find #"^left-" "wongleblart")

(matching-part {:name "left-eye" :size 1})
(matching-part {:name "head" :size 3})



(reduce + [1 2 3 4])
(+ (+ (+ 1 2) 3) 4)

(reduce + 15 [1 2 3 4])


(defn better-symmetrize-body-parts
  "Expects a seq of maps that have a :name and :size"
  [asym-body-parts]
  (reduce (fn [final-body-parts part]
            (into final-body-parts (set [part (matching-part part)])))
          []
          asym-body-parts))

(defn hit
  [asym-body-parts]
  (let [sym-parts (better-symmetrize-body-parts asym-body-parts)
        body-part-size-sum (reduce + (map :size sym-parts))
        target (rand body-part-size-sum)]
    (loop [[part & remaining] sym-parts
           accumulated-size (:size part)]
      (println (str "Target is: " target))
      (println part)
      (if (> accumulated-size target)
        part
        (recur remaining (+ accumulated-size (:size (first remaining))))))))

(hit asym-hobbit-body-parts)

(reduce + (map :size (better-symmetrize-body-parts asym-hobbit-body-parts)))

(str "Hello " "World!")
(vector 1 2 3)
(list 3 2 1)
(hash-map :a "a" :b "b" :c "c")
(hash-set 2 3 4 123 3 2 (fn [x] (+ x 1)))

(defn addHundy
  "Takes a number n and adds 100"
  [n]
  (+ n 100))

(addHundy 1)

(defn dec-maker
  "Returns a function that decreases a given value by n"
  [n]
  (fn [x] (- x n)))

(defn dec-maker-anon
  "Anonymous version of dec-maker"
  [n]
  #(- % n))

(def def9 (dec-maker 9))
(def9 10)

(def def9Anon (dec-maker-anon 9))
(def9Anon 10)




(defn mapset
  "Works like map but return value is a set"
  [func coll]
  (set (map func coll)))

(mapset inc [1 1 2 2])















































