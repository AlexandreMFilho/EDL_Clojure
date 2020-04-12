# CLOJURE

![](https://miro.medium.com/max/1200/1*eLqeIits5crU3G5b9LMEyg.png)


Alunos: Alexandre Maia e Luciano Januário.  
Professor: Francisco Sant’Anna.  
Disciplina: Estrutura de Linguaguens – 2020.1  


## Introdução

Clojure é uma linguagem de programação desenvolvida a partir de LISP, criado por Rich Hickey, ela possui enfase em programação funcional, ou seja, diferente das linguagens Orientadas a Objetos e Imperativas, ela se baseia em funções matemáticas e estruturas e dados imutáveis.  

Clojure é executado numa máquina virtual java (JVM) mas possui também outros ambientes como o Clojure CLR que compila para .net e o ClojureScript que compila para JavaScript.

## Histórico

Levaram-se dois anos e meio de trabalho exclusivo e sem nenhum financiamento externo para que Rich Hickey, pudesse lançar a primeira versão Clojure 1.0 publicamente em 2007.  

Hickey trabalhou na dotLisp, um projeto com base na plataforma .NET e também desenvolveu a interface jfli(uma ponte de recursos do java para LISP), FOIL(interface de objetos externos LISP), Lisplets(interface amigável do Lisp para Java Servlets).  

Ele a desenvolveu pelo desejo de modernizar a linguagem LISP mesclando-a com a plataforma Java para Programação Funcional e desenhada para computação concorrente.
Atualmente no Brasil Clojure é utilizado por empresas como Walmart, Puppet Labs, B2W, americanas, submarino, Nubank, dentre outras, demonstrando sua força, poder e adaptabilidade.  

O nome Clojure, de acordo com o próprio criador da linguagem, é um trocadilho com o conceito em programação “closure”, incorporando as letras C, L e J que se referem a C#, Lisp e Java respectivamente que foram as três linguagens que mais influenciaram no design de Clojure.

## Características

### Programação Funcional
Como ja apresentado, Clojure é uma linguagem Funcional,cujo objetivo é trabalhar principalmente com funções. Tudo se resume a funções que podem ser agrupadas ou combinadas para produzir um resultado.
Essa pensamento é tão forte que um clojurista adotou a a seguinte filosofia:

>"É melhor ter 100 funções operando em uma estrutura de dados a ter 10 funções operando em 10 estruturas de dados."  
"It is better to have 100 functions operate on one data structure than 10 functions on 10 data structures."  
>Alan Perlis

### Estática ou Dinâmica?
Clojure é uma linguagem com tipagem dinâmica e compilada que mantém sua dinamicidade através de um ambiente que permite com que cada um de seus recursos da linguagem sejam suportados em tempo de execução.

O ambiente repl é utilizado para fazer a execução de seus programas e leiningen é uma ferramenta popular escrita usando própria linguagem Clojure que faz o gerênciamento de dependencias e a automação da compilação, simplificando os processos necessários para a criação de um projeto.

### Onde e como é usado ?

#### Nubank
O CLOJURE é utilizado por empresas como a Nubank, para eles CLOJURE é uma ferramenta que permitiu remover a burocracia do sistema financeiro e devolver às pessoas o controle sobre o próprio dinheiro. Quando a empresa foi fundada CLOJURE pareceu a melhor opção afirmam seus funcionários, por ser Funcional:  
>“Uma linguagem funcional, quando utilizada de forma correta, possui comportamento equivalente a uma função matemática, por isso não retorna um resultado inesperado”.  
>diz Bruno.

Hoje todas as áreas do Nubank usam CLOJURE e mais de 90% dos microsserviços são escritos em CLOJURE. Ainda posssuem códigos escritos em outras linguagens como python e Scala, mas a infraestrutura de microsserviços estão todos em CLOJURE.

#### B2W
[...]  

## Exemplos

##### Hello World  

Clojure
>```clojure
>(ns hello_world.core  
>  (:gen-class))  
>
>(defn -main  
>  [& args]  
>  (println "Hello World!!!"))  
>```  

C  
>```C
>#include <stdio.h>
>
>int main(){
>  printf("Hello World!!!");
>  return 0;
>}
>```

Java
>```Java
>public class hello_world{
>  public static void main(String[] args){
>    System.out.println("Hello World!!!");
>  }
>}
>```
##### Criando funções

Utilizamos defn para criar uma função pública no nosso namespace. Há também variações como defn- que cria funç privadas no namespace, ou, def que cria constantes publicas no namespace e fn que cria funções anônimas.

>```clojure
>(ns math.core  
>  (:gen-class))  
>
>(defn soma [x y]  
>  (+ x y))  
>
>(defn-main  [& args]  
>  (println (soma 2 3)))
>```
##### Fatorial Recursivo

É demonstrado duas maneiras de se fazer o fatorial recursivo, a primeira utilizando-se apenas da chamada recursiva e a segunda utilizando-se de otimização na chamada de cauda usando loop/recur.

Clojure
>```clojure
>(ns factorial.core
>  (:gen-class))
>
>(defn fatorial[n]
>  (if (= 1 n)
>    1
>    (* n (fatorial(dec n))))) ; dec => n -= 1 => n = n-1
>
>(defn fatorialRecur [n]
>  (loop [atual n prox (dec atual) total 1]
>    (if (> atual 1)
>      (recur prox (dec prox) (* total atual))
>      total)))
>
>(defn -main
>  [& args]
>  (println (fatorial 5))
>  (println (fatorialRecur 5)))
>
>```

C
>```c
>#include <stdio.h>
>
>int fatorial(int);
>
>int main(){
>  int n;                        
>  printf("Informe o número que deseja obter o fatorial:\n");
>  scanf("%d",&n);
>  printf("O fatorial de %d é %d \n",n,fatorial(n));
>  return 0;
>}
>
>int fatorial(int x){
>  if(x == 0 || x == 1){
>    return 1;
>  }else{
>    return fatorial(x-1) * x;
>  }
>}
>```

Java
```Java
public class fatorial{

  public calc(int x){

  }
  public static void main(String[] args){
    System.out.println("Informe o numero que deseja obter o fatorial:\n");
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    fatorial.calc(num);
}
```
## Bibliografia
https://blog.nubank.com.br/o-que-e-clojure/  
https://clojure.org/  
https://pt.wikipedia.org/wiki/Clojure  
https://en.wikipedia.org/wiki/Clojure  
https://www.devmedia.com.br/introducao-a-linguagem-clojure/30587  
https://www.braveclojure.com/  
https://angeliski.com.br/tag/funcional/  
