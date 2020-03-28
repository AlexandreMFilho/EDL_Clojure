(ns hello-clojure.core)

(defn foo[x]
  (println x "Hello,Clojure!!!"))

  (defn hello-clj[]
    (println "Hello""Clojure""!!!"))

  (defn soma[x y]
    (+ x y))
  (soma 10 25)

  (defn sub[x y]
    (- x y))
    (sub 100 50)
    (sub -80 50)
    (sub 80 -50)

  (defn pares[& args]
    (filter even? args))
  (pares 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20)

    (filter even?[1 2 3 4 5 6 7 8 9 10])
    (map inc[1 2 3 4 5])
    (reduce + [1 2 3 4 5 6])
