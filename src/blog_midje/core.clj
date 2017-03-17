(ns blog-midje.core)

(defn xor
    "Returns true if x and y are mutual exclusive."
    [x y]
    (if (= x y) false true))
