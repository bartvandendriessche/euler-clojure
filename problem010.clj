(use 'clojure.contrib.lazy-seqs)

(defn sum-of-primes [limit]
  (reduce + (for [p primes :while (< p limit)] p)))

(sum-of-primes 2000000)