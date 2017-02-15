(defn to-div [content colour]
  (str "<div class='" colour "'>" content "</div>"))

(def words ["black" "is" "the" "new" "orange"])

(def colours (cycle [:black :orange]))

(map to-div words colours)
