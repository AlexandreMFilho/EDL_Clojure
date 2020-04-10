(ns hello-clojure.core)

  (defn hello-clj[]
    (println "Hello""Clojure""!!!"))

  (defn soma[x y]
    (+ x y))


  (defn sub[x y]
    (- x y))


  (defn pares[& args]
    (filter even? args))




(defn main[& args]
  (hello-clj)
  (println (soma 10 25) "\n"
  (sub 100 50)
  (sub -80 50)
  (sub 80 -50)
  (pares 1 2 3 4 5 6 7 8 9 0)
  (filter even?[1 2 3 4 5 6 7 8 9 10])
  (map inc[1 2 3 4 5])
  (reduce + [1 2 3 4 5 6]))
)
