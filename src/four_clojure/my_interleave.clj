(ns four-clojure.my-interleave)

(defn my-interleave
  "Problem 39: http://www.4clojure.com/problem/39"
  [x y]

  (mapcat vector x y))

(comment (= (my-interleave [1 2 3] [:a :b :c]) '(1 :a 2 :b 3 :c)))
(comment (= (my-interleave [1 2] [3 4 5 6]) '(1 3 2 4)))
(comment (= (my-interleave [1 2 3 4] [5]) [1 5]))
(comment (= (my-interleave [30 20] [25 15]) [30 25 20 15]))
