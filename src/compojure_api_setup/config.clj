(ns compojure-api-setup.config
  (:require [mount.core :as mount]
            [cprop.core :refer [load-config]]))

(mount/defstate config :start (load-config))
