(ns forca.core
  (:gen-class))

(def total-de-vidas 6)

(defn perdeu []
  (println "Voce perdeu"))

(defn jogo [vidas]
  (if (= vidas 0)
    (perdeu)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))