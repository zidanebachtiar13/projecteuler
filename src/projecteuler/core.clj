(ns projecteuler.core)

(def problem1
 (->> (for [x [3 5]
            y (range 1 1000)
            :when (= 0 (mod y x))]
        y)
      (distinct)
      (apply +)))

(def problem2
  (->> (take 32 (map first (iterate (fn [[a b]] [b (+' a b)]) [1 2])))
       (filter even?)
       (apply +)))
