(ns abacus.core)

(defn foo
  "I don't do a whole lot."
  [x]
  (println x "Hello, World!"))

(defn exp [x n]
  (reduce * (repeat n x)))

(defn R [c r t]
  (* c (+ 1 (* (/ r 365) t))))


