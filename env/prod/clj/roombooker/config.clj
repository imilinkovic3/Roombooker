(ns roombooker.config
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[roombooker started successfully]=-"))
   :middleware identity})
