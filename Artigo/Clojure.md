# CLOJURE

![](https://miro.medium.com/max/1200/1*eLqeIits5crU3G5b9LMEyg.png)


Alunos: Alexandre Maia e Luciano  
Professor: Francisco Sant’Anna  
Disciplina: Estrutura de Linguaguens – 2020.1  


## Introdução

Clojure é uma linguagem de programação desenvolvida a partir de LISP, criado por Rich Hickey, ela possui enfase em programação funcional, ou seja, diferente das linguagens Orientadas a Objetos e Imperativas, ela se baseia em funções matemáticas e estruturas e dados imutáveis.  

Clojure é executado numa máquina virtual java (JVM) mas possui também outros ambientes como o Clojure CLR que compila para .net e o ClojureScript que compila para JavaScript.

## Histórico

Levaram-se dois anos e meio de trabalho exclusivo e sem nenhum financiamento externo para que Rich Hickey, pudesse lançar a primeira versão Clojure 1.0 publicamente em 2007.  

Hickey trabalhou na dotLisp, um projeto com base na plataforma .NET e também desenvolveu a interface jfli(uma ponte de recursos do java para LISP), FOIL(interface de objetos externos LISP), Lisplets(interface amigável do Lisp para Java Servlets).  

Ele a desenvolveu pelo desejo de modernizar a linguagem LISP mesclando-a com a plataforma Java para Programação Funcional e desenhada para computação concorrente.
Atualmente no Brasil Clojure é utilizado por empresas como Walmart, Puppet Labs, B2W, americanas, submarino, Nubank, dentre outras, demonstrando sua força, poder e adaptabilidade.  

## Características

#### Programação Funcional
Como ja apresentado, Clojure é uma linguagem Funcional,cujo objetivo é trabalhar principalmente com funções. Tudo se resume a funções que podem ser agrupadas ou combinadas para produzir um resultado.
Essa pensamento é tão forte que um clojurista adotou a a seguinte filosofia:

>"É melhor ter 100 funções operando em uma estrutura de dados a ter 10 funções operando em 10 estruturas de dados."  
"It is better to have 100 functions operate on one data structure than 10 functions on 10 data structures."  
>Alan Perlis

#### Estática ou Dinâmica?

Clojure é uma linguagem Estática poŕem dependendo do seu ambiente de desenvolvimento pode ser Dinâmica.
Um código Clojure é compilado em um bytecode Java, através disso podemos rodar um Projeto Clojure em qualquer Ambiente que possua o Java instalado.
Existem ferramentas como o Leiningen que é um interpretador Clojure ao qual permite a sua execução em tempo real. Além disso o Leiningen permite acessar um programa clj em execução e permite a alteração do mesmo em tempo de execução.

#### Onde e como é usado ?

###### Nubank
O CLOJURE é utilizado por empresas como a Nubank, para eles CLOJURE é uma ferramenta que permitiu remover a burocracia do sistema financeiro e devolver às pessoas o controle sobre o próprio dinheiro. Quando a empresa foi fundada CLOJURE pareceu a melhor opção afirmam seus funcionários, por ser Funcional:  
>“Uma linguagem funcional, quando utilizada de forma correta, possui comportamento equivalente a uma função matemática, por isso não retorna um resultado inesperado”.  
>diz Bruno.

Hoje todas as áreas do Nubank usam CLOJURE e mais de 90% dos microsserviços são escritos em CLOJURE. Ainda posssuem códigos escritos em outras linguagens como python e Scala, mas a infraestrutura de microsserviços estão todos em CLOJURE.

###### B2W

## Exemplos

## Bibliografia
https://blog.nubank.com.br/o-que-e-clojure/  
https://clojure.org/  
https://pt.wikipedia.org/wiki/Clojure  
https://www.devmedia.com.br/introducao-a-linguagem-clojure/30587  
https://www.braveclojure.com/  
https://angeliski.com.br/tag/funcional/  
