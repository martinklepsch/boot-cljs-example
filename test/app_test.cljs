(ns app-test
  (:require-macros [cemerick.cljs.test :refer (is deftest with-test run-tests testing test-var)])
  (:require [cemerick.cljs.test :as t]
            [app :as a]))

(deftest addition
  (is (= (a/add-two-numbers 1 2) 4)))

;; (deftest somewhat-less-wat
;;   (is (= "{}[]" (+ {} []))))

(deftest javascript-allows-div0
  (is (= js/Infinity (/ 1 0) (/ (int 1) (int 0)))))

