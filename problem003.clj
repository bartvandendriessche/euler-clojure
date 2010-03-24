;; The prime factors of 13195 are 5, 7, 13 and 29.
;; What is the largest prime factor of the number 600851475143 ?
(defn prime-factors [n]
  (defn do-factor [x]
    (let [divisors (for [factor (range 2 (Math/sqrt x))
                         :when (= 0 (mod x factor))]
                     factor)]
      (if (empty? divisors)
        (list x) 
        (cons (first divisors) (do-factor (/ x (first divisors)))))))
  (do-factor n))

(reduce max (prime-factors 600851475143))
