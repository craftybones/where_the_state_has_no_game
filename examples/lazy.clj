(defn inc-and-print [x]
  (do
    (println x)
    (inc x)))

(def millions (map inc-and-print (range 1 1000000)))

(def first-five (take 5 millions))

;; only evaluates the first 5(32) numbers
