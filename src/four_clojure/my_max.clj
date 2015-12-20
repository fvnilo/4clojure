(ns four-clojure.my-max)

(defn my-max
  "Problem 38: http://www.4clojure.com/problem/38"
  [& numbers]
  (last (sort numbers)))

(comment (= (my-max 1 8 3 4) 8))
(comment (= (my-max 30 20) 30))
(comment (= (my-max 45 67 11) 67))
