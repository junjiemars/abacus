(ns abacus.core)

(defn pow
    "Returns the value with the a raised to the power of the b"
  [a b]
  (Math/pow a b))

(defn log
  [a]
  (Math/log10 a))

(defn future-value
  "Returns the future value using simple interest. p is the principal, r is the
  interest rate, and t is the times"
  [p r t]
  (* p (+ 1 (* r t))))

(defn future-value+
  "Returns the future value using compound interest. p is the principal, r is the
  interest rate, and t is the times"
  [p r t]
  (* p (pow (+ 1 r) t)))

(defn present-value
  "Returns the present value using simple interest. f is the future value, r is 
  the interest rate, and t is the times"
  [f r t]
  (/ f (+ 1 (* r t))))

(defn present-value+
  "Returns the present value using compound interest. f is the future value, r is
  the interest rate, and t is the times"
  [f r t]
  (/ f (pow (+ 1 r) t)))

(defn times
  "Returns the times using simple interest. f is the future value, p is the 
  principal, and r is the interest rate"
  [f p r]
  (/ (log (/ f p)) (log (+ 1 r))))

(defn times+
  "Returns the times using compound interest. f is the future value, p is the
  principal, and r is the interest rate"
  [f p r]
  (/ (log (/ f p)) (log (+ 1 r))))
