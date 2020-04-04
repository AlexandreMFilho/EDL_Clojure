# Introduction to clojure-noob

TODO: write [great documentation](http://jacobian.org/writing/what-to-write/)

#Aqui irei documentar meus testes e descobertas usados no Leinigein repl


##Definindo funções


>(defn hello-clj[]
>  (println "Hello ""Clojure ""!!!"))
>
>Hello Clojure !!!


>(defn soma[x y]
>  (+ x y))
>(soma 10 25)
>
>35


>(defn sub[x y]
>  (- x y))
>  (sub 100 50)
>
>50


>  (sub -80 50)
>
>-130


>  (sub 80 -50)
>
>130


(defn pares[& args]
  (filter even? args))
(pares 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20)
