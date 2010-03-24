;; A Pythagorean triplet is a set of three natural numbers, a  b  c
;; for which

;; a^2 + b^2 = c^2
;; For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

;; There exists exactly one Pythagorean triplet for which a + b + c = 1000.
;; Find the product abc.
(defn find-triplet []
  (first (for [a (range 1 1000)
             b (range 1 1000)
             c (range 1 1000)
             :when (and (= 1000 (+ a b c))
                        (= (* c c) (+ (* a a) (* b b))))]
         (* a b c))))