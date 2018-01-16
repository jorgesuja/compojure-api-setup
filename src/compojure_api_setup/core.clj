(ns compojure-api-setup.core
  (:require [mount.core :as mount]
            [cprop.core :refer [load-config]]
            [ring.adapter.jetty :refer [run-jetty]]
            [ring.middleware.reload :refer [wrap-reload]]
            [compojure-api-setup.config :refer [config]]
            [compojure-api-setup.database]
            [compojure-api-setup.handler :as handler]))

(defn start-app
  "Starts the jetty server using the defined compojure-api handler"
  []
  (run-jetty (wrap-reload #'handler/app) {:port (:port config) :join? false}))

(mount/defstate ^{:on-reload :noop}
                app
                :start (start-app)
                :stop (.stop app))

(defn -main
  "Application's entry point function"
  [& args]
  (mount/start))
