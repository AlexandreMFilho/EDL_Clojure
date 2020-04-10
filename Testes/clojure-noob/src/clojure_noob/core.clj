(ns clojure-noob.core
  (:gen-class))

(defn quad[x]
    (println (* x x)))

(defn posso_isso [idade]
  (if (>= idade 18)
    (println "Posso pois sou maior de idade.")
    (println "Não posso tenho que ver com meus pais.")))

(defn posso_aquilo [idade & args]
  (if (>= idade 18)
    (do (if (nil? args)
        (println "Posso pois sou maior de idade.")
        (println "Posso" args "pois ja sou adulto."))
    )
    (do (if (nil? args)
        (println "Não posso tenho que ver com meus pais.")
        (println "Devo perguntar aos meus pais se posso" args ".")))))

(defn posso_bol [idade & args]
  (if (and (>= idade 18) (nil? args))
    (println "Posso pois sou maior de idade.")
    (do (if (>= idade 18)
          (println "Posso" args "pois ja sou adulto.")
          (do (if (nil? args)
                (println "Não posso tenho que ver com meus pais.")
                (println "Devo perguntar aos meus pais se posso" args ".")))))))

(defmacro infix
  [infixed]
  (list (second infixed) (first infixed) (last infixed)))


(defn -main[& args]
  (println "Eu sou um pequeno pote de chá!")
  (quad 9)
  (posso_isso 21)
  (posso_aquilo 16 "Arrumar uma namorada")
  (posso_aquilo 14)
  (println)
  (posso_bol 10)
  (posso_bol 10 "Comer Caqui")
  (posso_bol 20)
  (posso_bol 20 "Morar sozinho")

  "map"
  (def a (hash-map :a 1 :b 2 :c 3 :d 4 :e 5 :f 6))
  (println (get a :c) (get a :1) (get a :h) (get a :e) (:c a))
  (def coisa [5 4 3 2 1])"creating vector"
  (println (get coisa 0))

  "vector"
  (println(vector "banana" "maça" "morango"))
  (println (conj ["banana" "maça" "morango"] "caramelo"))

  "list"
  '(1 2 3 4 5)
  (println(nth '(5 4 6 3 8 9) 2))"pegar elemento de uma list"
  (println (list 5 4 "coisa" 3 "macarrão"))
  (println (conj '(5 4 "coisa" 3 "macarrão") "leite"))"elementos adicionados a uma lista são colocados no inicio dela"

  (println
  "sets "
  (hash-set 1 1 2 2 3 3 4 4)
  (conj #{"alex" 2 56} 2)
  (contains? #{:a :b} :a)
  (contains? #{:a :b} nil)
  (get #{:a :b} :a)
  )
  "macro"
  (println (infix (1 + 1))
  (macroexpand ' (infix (1 + 1)))
  )
)
