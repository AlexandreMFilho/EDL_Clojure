(ns arquivos.core
  (:require [clojure.string :as str])
  (:gen-class))

(use 'clojure.java.io)

(defn escreve_arquivo [arquivo texto]
  (with-open [wrtr (writer arquivo)]
    (.write wrtr texto)))

(defn ler_arquivo [arquivo]
  (try
    (println (slurp arquivo))

  (catch Exception e (println "Erro : " (.getMessage e)))))

(defn adiciona_arquivo [arquivo texto]
  (with-open [wrtr (writer arquivo :append true)]
    (.write wrtr texto)))

(defn ler_linha_arquivo [arquivo]
  (with-open [rdr (reader arquivo)]
    (doseq [line (line-seq rdr)]
      (println line))))

(defn -main
  [& args]
  "Criando e escrevendo num arquivo (Write)"
  (escreve_arquivo "Clojure.txt" "May the gods of Clojure be with you.\n")

  "Lendo um arquivo (Read)"
  (ler_arquivo "Clojure.txt")

  "Adicionando um texto a um arquivo (Append)"
  (adiciona_arquivo "Clojure.txt" "(blessing you Clojure_god)")
  (ler_arquivo "Clojure.txt")

  "Lendo linha de um arquivo"
  (ler_linha_arquivo "Clojure.txt"))
