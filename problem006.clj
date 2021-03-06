;; The sum of the squares of the first ten natural numbers is
;; 1^2 + 2^2 + ... + 10^2 = 385

;; The square of the sum of the first ten natural numbers is
;; (1 + 2 + ... + 10)^2 = 55^2 = 3025

;; Hence the difference between the sum of the squares of the first
;; ten natural numbers and the square of the sum is 3025 - 385 = 2640.

;; Find the difference between the sum of the squares of the first one
;; hundred natural numbers and the square of the sum.

(defn diff-sum-of-squares-square-of-sum [coll]
  (- (Math/pow (reduce + coll) 2)
     (reduce + (map #(Math/pow % 2) coll))))

(int (diff-sum-of-squares-square-of-sum (range 1 101)))

;; version that uses clojure.contrib.math instead of the jdk Math.pow
;; advantage of the following version is that it does not overflow for
;; large numbers.
(use 'clojure.contrib.math)

(defn diff-sum-of-squares-square-of-sum2 [coll]
  (- (expt (reduce + coll) 2)
     (reduce + (map #(expt % 2) coll))))

(int (diff-sum-of-squares-square-of-sum2 (range 1 101)))


