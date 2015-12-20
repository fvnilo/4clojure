(ns four-clojure.reverse-interleave)

(defn reverse-interleave
  "Problem 43: http://www.4clojure.com/problem/43"
  [collection n]

  (apply map list (partition n collection)))

(comment (= (reverse-interleave [1 2 3 4 5 6] 2) '((1 3 5) (2 4 6))))
(comment (= (reverse-interleave (range 9) 3) '((0 3 6) (1 4 7) (2 5 8))))
(comment (= (reverse-interleave (range 10) 5) '((0 5) (1 6) (2 7) (3 8) (4 9))))
