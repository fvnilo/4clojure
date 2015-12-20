(ns four-clojure.rotate)

(defn rotate
  "Problem 44: http://www.4clojure.com/problem/44"
  [n collection]

  (let [rotation (mod n (count collection))]
    (if (pos? rotation)
      (concat (drop rotation collection) (take rotation collection))
      (concat (take-last (* -1 rotation) collection) (drop-last (* -1 rotation) collection)))))

(comment (= (rotate 2 [1 2 3 4 5]) '(3 4 5 1 2)))
(comment (= (rotate -2 [1 2 3 4 5]) '(4 5 1 2 3)))
(comment (= (rotate 6 [1 2 3 4 5]) '(2 3 4 5 1)))
(comment (= (rotate 1 '(:a :b :c)) '(:b :c :a)))
(comment (= (rotate -4 '(:a :b :c)) '(:c :a :b)))
