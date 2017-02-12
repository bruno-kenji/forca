(ns forca.core
  (:gen-class))

(defn perdeu [] (println "Voce perdeu"))
(defn ganhou [] (println "Voce ganhou!"))

(defn jogo [vidas]
  (if (= vidas 0)
    (perdeu)
    (ganhou)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
