(ns four-clojure.my-interpose)

(defn my-interpose
  "Problem 40: http://www.4clojure.com/problem/40"
  [value coll]
  (butlast (mapcat #(vector % value) coll)))

(comment (= (my-interpose 0 [1 2 3]) [1 0 2 0 3]))
(comment (= (apply str (my-interpose ", " ["one" "two" "three"])) "one, two, three"))
(comment (= (my-interpose :z [:a :b :c :d]) [:a :z :b :z :c :z :d]))
