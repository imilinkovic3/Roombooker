(ns roombooker.config
  (:require [selmer.parser :as parser]
            [clojure.tools.logging :as log]
            [roombooker.dev-middleware :refer [wrap-dev]]))

(def defaults
  {:init
   (fn []
     (parser/cache-off!)
     (log/info "\n-=[roombooker started successfully using the development profile]=-"))
   :middleware wrap-dev})