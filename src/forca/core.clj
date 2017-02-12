(ns forca.core
  (:gen-class)
  (:use '[clojure.string :refer [includes?]] 'debugger.core))

(defn perdeu [] (println "Voce perdeu"))
(defn ganhou [] (println "Voce ganhou!"))

(defn letras-faltantes [palavra acertos]
  (remove (fn [letra] (str/includes? acertos (str letra))) palavra))

(defn acertou-a-palavra-toda? [palavra acertos]
  (empty? (letras-faltantes palavra acertos)))

(defn jogo [vidas palavra acertos]
  (if (= vidas 0)
    (perdeu)
    (if (acertou-a-palavra-toda? palavra acertos)
      (ganhou))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
