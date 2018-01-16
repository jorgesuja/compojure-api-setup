(ns compojure-api-setup.database
  (:require [mount.core :refer [defstate]]
            [compojure-api-setup.config :refer [config]]
            [conman.core :as conman]))

(defstate ^:dynamic *db*
          :start (conman/connect! {:jdbc-url (:jdbc-url config)})
          :stop (conman/disconnect! *db*))
