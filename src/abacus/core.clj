(ns abacus.core)

(defn pow
  "Returns the value with the a raised to the power of the b"
  [a b]
  (Math/pow a b))

(defn log
  "Returns the base 10 logarithm of a"
  [a]
  (Math/log10 a))

(defn interest
  "Return the earned simple interest, p is the pricipal, r is the 
  interest rate, and t is times"
  [p r t]
  (* p r t))

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

(defn interest+
  "Return the earned compound interest, p is the pricipal, r is the
  interest rate, and t is times"
  [p r t]
  (- (future-value+ p r t) p))

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
  (/ (- (/ f p) 1) r))

(defn times+
  "Returns the times using compound interest. f is the future value, p is the
  principal, and r is the interest rate"
  [f p r]
  (/ (log (/ f p)) (log (+ 1 r))))

(defn rate
  "Returns the simple interest rate. f is the future value, p is the principal,
  and t is times"
  [f p t]
  (/ (- (/ f p) 1) t))

(defn rate+
  "Returns the compound interest rate. f is the future value, p is the principal,
  and t is times"
  [f p t]
  (- (pow (/ f p) (/ 1 t)) 1))
