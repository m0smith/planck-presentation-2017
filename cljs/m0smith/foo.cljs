(ns m0smith.foo)

(defn greet [name]
  (println (str "Hello `" name "'!")))

(defn -main [name]
  (greet name))
