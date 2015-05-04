(ns abacus.core)

(defn pow
    "Returns the value with the a raised to the power of the b"
  [a b]
  (Math/pow a b))

(defn future-value
  "Returns the future value using simple interest. p is the principal, r is the
  interest rate, and t is the time"
  [p r t]
  (* p (+ 1 (* r t))))

(defn future-value+
  "Returns the future value using add-on interest. p is the principal, r is the
  interest rate, and t is the time"
  [p r t]
  (* p (pow (+ 1 r) t)))



