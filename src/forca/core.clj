(ns forca.core
  (:gen-class))

(defn perdeu [] (println "Voce perdeu"))
(defn ganhou [] (println "Voce ganhou!"))

(defn acertou-a-palavra-toda? [palavra acertos] true)

(defn jogo [vidas palavra acertos]
  (if (= vidas 0)
    (perdeu)
    (if (acertou-a-palavra-toda? palavra acertos)
      (ganhou))))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
