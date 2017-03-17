(ns blog-midje.core-test
  (:use [blog-midje.core])
  (:use [midje.sweet]))

(tabular
  (fact "The rules of XOR"
        (xor ?x ?y) => ?expected)
  ?x    ?y    ?expected
  0     0     false
  0     1     true
  1     0     true
  1     1     false
  false false false
  false true  true
  true  false true
  true  true  false)
