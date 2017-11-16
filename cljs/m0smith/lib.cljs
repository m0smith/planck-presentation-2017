(ns m0smith.lib
    (:require [planck.http] [goog.text.LoremIpsum] [planck.io]))

(defn -main []
      (println (let [li (goog.text.LoremIpsum.)]

		     (.generateChains_ li
					     (planck.io.slurp "cljs/resource/dictionary.txt"))
		     (.generateStatistics_ li
					     (planck.io.slurp "cljs/resource/dictionary.txt"))
		     (.initializeDictionary_ li
					     (planck.io.slurp "cljs/resource/APrincessOFMars.txt"))					

           	         (.generateSentence li))))
