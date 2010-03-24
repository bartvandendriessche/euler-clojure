(defn fib-seq []
  ((fn rfib [a b]
     (cons a (lazy-seq (rfib b (+ a b)))))
   0 1))

(reduce + (for [fib (fib-seq)
                :when (= 0 (mod fib 2))
                :while (< fib 4000000)]
            fib))