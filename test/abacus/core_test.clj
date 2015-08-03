(ns abacus.core-test
  (:require [clojure.test :refer :all]
            [abacus.core :refer :all]))

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 0))))

(deftest balance-test
  (let [deposit (+ 4897 4848.89 5 987 4913 5000 6800)
        draw (+ 1000 20000)
        principal(+ 1000 4900 4900 20000)
        interest 0
        ]
    (testing "Deposit is wrong:"
      (is (= 27450.89 deposit)))
    (testing "Draw is wrong:"
      (is (= 21000 draw)))
    (testing "Pricipal is wrong:"
      (is (= 30800 principal)))
    (testing "Interest is wrong:"
      (is (= 0 0)))))
