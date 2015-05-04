(ns abacus.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn exp [x n]
  (reduce * (repeat n x)))

(defn R0 [c r t]
  (* c (+ 1 (* (/ r 365) t))))

(defn R1 [c r t]
  (* c (exp (+ 1 (/ r 365)) t)))


