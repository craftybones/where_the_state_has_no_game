(defn fibo
  ([] (fibo 1 1))
  ([s1 s2] (lazy-seq (cons s1 (fibo s2 (+ s1 s2))))))

(take 5 (fibo))

(take-while (partial > 50) (fibo))

(take 5 (take-nth 10 (fibo)))
