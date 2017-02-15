(defn max-adjacents [coll]
  (map max coll (rest coll)))

(defn sum-of [prev current]
  (map + current (max-adjacents prev)))

(defn max-path-sum [tree]
  (first (reduce sum-of (reverse tree))))

(def tree  [[3]
           [7 4]
          [2 4 6]
         [8 5 9 3]]

(max-path-sum tree)
