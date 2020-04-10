# Introduction to clojure-noob

TODO: write [great documentation](http://jacobian.org/writing/what-to-write/)

##Aqui irei documentar meus testes e descobertas usados no Leinigein repl


###Definindo funções


>(defn hello-clj[]
>  (println "Hello ""Clojure ""!!!"))
>Hello Clojure !!!


>(defn soma[x y]
>  (+ x y))
>(soma 10 25)
>35


>(defn sub[x y]
>  (- x y))
>
>(sub 100 50)
>50


>  (sub -80 50)
>-130


>  (sub 80 -50)
>130


(defn pares[& args]
  (filter even? args))
(pares 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20)

(if true
  (println "verdade")
  (printl "falso"))
verdade

(if false
  (println "verdade")
  (println "falso"))
falso

(if false
  (println "verdade"))
nil

(if true
  (do(println "verdade ")
  (println "verdadeira."))
  (do(println "falso")
  (println  "inverdade.")))
verdade
verdadeira.

(if false
  (do(println "verdade ")
  (printl "verdadeira."))
  (do(printl "falso ")
  (println  "inverdade.")))
falso
inverdade.

"Mistura de if e do, é como um if porém apenas com o then e sem a parte do else"
(when true
  (println "v"
  "v"
  "v"))
v v v
nil

(nil? 1)
false

(true? 1)
false

(false? 1)
false

(= 1 1)
true

(= "string" "string")
true

(= "string" "STRING")
false

(= "A" 2)
false

clojure-noob.core=> (def v1 5)
#'clojure-noob.core/v1
clojure-noob.core=> (println v1)
5
nil
clojure-noob.core=> (+ 2 v1)
7
clojure-noob.core=> (= 5 v1)
true
