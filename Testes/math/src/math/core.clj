(ns math.core
  (:gen-class))

  (defn soma [x y]
    (+ x y))

    (defn sub [x y]
      (- x y))

    (defn quad [x]
      (* x x))


  (defn pega_num []
    (try
      (def x (Integer/parseInt (read-line)))
      (when (number? x) x)
    (catch NumberFormatException e
           (println "Digite um numero desta vez")
           (pega_num))))

(defn -main  [& args]
  (println
    "Soma (10+5)(-10+5)(10+-5)\n"
    (soma 10 5)
    (soma -10 5)
    (soma  10 -5)
    "\nSubtração (5+4)(-5+4)(5+-4)\n"
    (sub 5 4)
    (sub -5 4)
    (sub 5 -4)
    "\nExponencial (9)\n"
    (quad 9)
    )
    (println "\nAgora você irá dar os valores\nSoma:")
    (println  (soma (pega_num) (pega_num)))
    (println "\nSubtração:")
    (println (sub (pega_num) (pega_num)))
    (println "\nQuadrado:")
    (println (quad (pega_num)))
)
