;; 2520 is the smallest number that can be divided by each of the
;; numbers from 1 to 10 without any remainder.

;; What is the smallest number that is evenly divisible by all of the
;; numbers from 1 to 20?

;; first the brute force way (caution, this can take a very long time):
(defn divides? [seq x]
  "Takes a number and a seq of divisors and returns wether or not the 
   number is evenly divisible by each value in the seq"
  (every? #(= 0 (mod x %)) seq))

(defn smallest-divisible-by [seq]
  (first (drop-while (complement (partial divides? seq)) (iterate inc 1))))

(smallest-divisible-by (range 2 21))

;; a better approach is to realize that we just need to find the least
;; common multiple of the set of integers {2,...,20} and implement a
;; suitable algorithm to calculate that. See
;; http://en.wikipedia.org/wiki/Least_common_multiple for more info.
