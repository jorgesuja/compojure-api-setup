(ns compojure-api-setup.handler
  (:require [compojure-api-setup.routes.bookstore :refer [bookstore-routes]]
            [compojure-api-setup.routes.status :refer [status-routes]]
            [compojure.api.sweet :refer :all]))

(def app
  (api
    {:swagger
     {:ui "/"
      :spec "/swagger.json"
      :data {:info {:title "compojure-api-setup"
                    :description "Compojure Api simple setup"}}}}

    (context "/api" []
      :tags ["api"]
      status-routes
      bookstore-routes)))
