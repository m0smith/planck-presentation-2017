(ns m0smith.gdax
    (:require [planck.http] [goog.text.LoremIpsum] [planck.io]))

(defn -main []
      (println (planck.http/get "https://api.gdax.com/time" {:headers {"User-Agent" "hamster"}}))
      (println (let [li (goog.text.LoremIpsum.)]
      	         (.generateParagraph li)))
      (println (let [li (goog.text.LoremIpsum.)]

		     (.generateChains_ li
					     (planck.io.slurp "resource/dictionary.txt"))
		     (.generateStatistics_ li
					     (planck.io.slurp "resource/dictionary.txt"))
		     (.initializeDictionary_ li
					     (planck.io.slurp "resource/APrincessOFMars.txt"))					

           	         (.generateSentence li))))
