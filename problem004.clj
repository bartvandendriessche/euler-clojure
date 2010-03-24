;; A palindromic number reads the same both ways. The largest
;; palindrome made from the product of two 2-digit numbers is 9009 =
;; 91  99.

;; Find the largest palindrome made from the product of two 3-digit
;; numbers.

(defn find-largest-palindrome []
  (reduce max (for [x (range 1000 100 -1)
                    y (range 1000 100 -1)
                    :when (= (str (* x y))
                             (apply str (reverse (str (* x y)))))]
                (* x y))))

(find-largest-palindrome)

(defn find-largest-palindrome2 []
  (loop [x 1000]
    (loop [y 1000]
      (if (= (str (* x y))
             (apply str (reverse (str (* x y)))))
        (format "%s" (* x y)))
      (recur (dec y)))
    (if (= 0 x)
      0
     (recur (dec x)))))