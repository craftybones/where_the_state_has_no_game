(def middle-of (comp rest butlast))

(defn palindrome? [string]
  (if (empty? string) 
    true
    (if (not= (first string) (last string))
      false
      (palindrome? (middle-of string)))))
