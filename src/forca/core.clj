(ns forca.core
  (:gen-class)
  (:use '[clojure.string :refer [includes?]] 'debugger.core))

(defn perdeu [] (println "Voce perdeu"))
(defn ganhou [] (println "Voce ganhou!"))

(defn le-letra! [] (read-line))

(defn letras-faltantes [palavra acertos]
  (remove (fn [letra] (str/includes? acertos (str letra))) palavra))

(defn acertou-a-palavra-toda? [palavra acertos]
  (empty? (letras-faltantes palavra acertos)))

(defn avalia-chute [chute, vidas, palavra, acertos]
  (if (acertou? palavra chute)
      (println "Acertou!"
        (jogo vidas palavra (conj acertos chute)))
      (println "Errou!"
        (jogo (dec vidas) palavra acertos))))

(defn jogo [vidas palavra acertos]
  (if (= vidas 0)
    (perdeu)
    (if (acertou-a-palavra-toda? palavra acertos)
      (ganhou)
      (avalia-chute (le-letra!) vidas palavra acertos))))

(defn -main [& args]
  (jogo 3 "PARALELEPIPEDO" (hash-set)))
