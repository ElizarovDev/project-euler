(ns project-euler.problem1)

(defn filterMod 
  [divider x]
  (= 0 (mod x divider)))

(def mod3 (partial filterMod 3))
(def mod5 (partial filterMod 5))

(defn get-value-or-null
  [x]
  (cond
    (mod3 x) x
    (mod5 x) x
    :else 0))

(defn get-sum 
  [items]
  (reduce
   (fn [acc number] (+ (get-value-or-null number) acc))
   0
   items)
  )

(defn -main
  []
  (println (get-sum (range (inc 1000)))))