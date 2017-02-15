(defn prime-candidates-above-3 [x]
  (lazy-seq (list* (dec (* 6 x)) (inc (* 6 x))
                   (prime-candidates-above-3 (inc x)))))

(def prime-candidates
  (lazy-seq (list* 2 3 (prime-candidates-above-3 1))))

(def none (comp not some))

(defn divisible-by? [x y]
  (zero? (rem x y)))

(defn divisibility-check [x]
  (partial none (partial divisible-by? x)))

(defn prime-candidates-below [x]
  (take-while (partial >= x) prime-candidates))

(defn is-prime? [x]
  (let [threshold (closest-integer-sqrt x)
        x-not-divisible-by? (divisibility-check x)]
    (x-not-divisible-by? (prime-candidates-below threshold))))

(def primes (filter is-prime? prime-candidates))
