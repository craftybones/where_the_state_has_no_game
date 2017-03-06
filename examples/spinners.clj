(defn fibo
  ([] (fibo 0 1))
  ([s1 s2] (lazy-seq (cons s1 (fibo s2 (+ s1 s2))))))

(defn fibo-container
  [f]
  [:div (map to-paragraph (take 3 @f))])

(defn sequence-cycler
  [s f t]
  (let [foo (reagent/atom s)]
    (fn [s]
      (js/setTimeout #(swap! foo rest) t)
      (f foo))))

(defn top-container []
  [:div
   [sequence-cycler (fibo) fibo-container 1000]
   [sequence-cycler (cycle [:red :black :black]) spinner-container 200]
   [sequence-cycler (cycle [:up :right :down :left]) square-spinner 100]
   [sequence-cycler (cycle "|/-\\") ascii-spinner 100]
   [sequence-cycler (cycle "this is cool ") dash-container 300]])
