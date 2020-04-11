(ns condicionais.core
  (:gen-class))

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


(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println
    (posso_isso 21)
    (posso_aquilo 16 "Arrumar uma namorada")
    (posso_aquilo 14)
    (posso_bol 10)
    (posso_bol 10 "Comer Caqui")
    (posso_bol 20)
    (posso_bol 20 "Morar sozinho")))
