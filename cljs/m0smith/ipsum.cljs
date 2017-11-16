(ns m0smith.ipsum
    (:require [planck.http] [goog.text.LoremIpsum] [planck.io]))

(defn -main []
      (println (let [li (goog.text.LoremIpsum.)]
      	         (.generateParagraph li))))

