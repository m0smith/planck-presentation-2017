(ns m0smith.gdax
    (:require [planck.http] [goog.text.LoremIpsum] [planck.io]))

(defn -main []
  (println (planck.http/get "https://api.gdax.com/time"
                            {:headers {"User-Agent" "hamster"}})))
