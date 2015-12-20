(ns four-clojure.drop-nth)

(defn drop-every-nth
  [collection index]
  (flatten (partition-all (dec index) index collection)))

(comment (= (drop-every-nth [1 2 3 4 5 6 7 8] 3) [1 2 4 5 7 8]))
(comment (= (drop-every-nth [:a :b :c :d :e :f] 2) [:a :c :e]))
(comment (= (drop-every-nth [1 2 3 4 5 6] 4) [1 2 3 5 6]))
