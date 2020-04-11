(ns math.core
  (:gen-class))

  (defn soma [x y]
    (+ x y))

  (defn sub [x y]
    (- x y))

  (defn quad [x]
    (* x x))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
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

  ))
