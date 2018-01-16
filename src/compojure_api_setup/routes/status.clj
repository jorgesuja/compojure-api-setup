(ns compojure-api-setup.routes.status
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [compojure-api-setup.models.books :as books]))

(defroutes status-routes
  (context "/status" []
    :tags ["status"]

    (GET "/" []
      :summary "Returns ok"
      (ok {:status "ok"}))))
