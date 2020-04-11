(ns data-structures.core
  (:gen-class))

(defn -main [& args]

  (println "map\n")
    (def a (hash-map :a 1 :b 2 :c 3 :d 4 :e 5 :f 6))
    (println (get a :c) (get a :1) (get a :h) (get a :e) (:c a))
    (def coisa [5 4 3 2 1])"creating vector"
    (println (get coisa 0))

  (println "\nvector\n")
    (println(vector "banana" "maça" "morango"))
    (println (conj ["banana" "maça" "morango"] "caramelo"))

  (println  "\nlist\n")
    '(1 2 3 4 5)
    (println(nth '(5 4 6 3 8 9) 2))"pegar elemento de uma list"
    (println (list 5 4 "coisa" 3 "macarrão"))
    (println (conj '(5 4 "coisa" 3 "macarrão") "leite"))"elementos adicionados a uma lista são colocados no inicio dela"

  (println "\nsets\n")
    (hash-set 1 1 2 2 3 3 4 4)
    (conj #{"alex" 2 56} 2)
    (contains? #{:a :b} :a)
    (contains? #{:a :b} nil)
    (get #{:a :b} :a)

  )
