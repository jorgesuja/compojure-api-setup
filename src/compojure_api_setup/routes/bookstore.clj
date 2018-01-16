(ns compojure-api-setup.routes.bookstore
  (:require [compojure.api.sweet :refer :all]
            [ring.util.http-response :refer :all]
            [compojure-api-setup.models.books :as books]))

(defroutes bookstore-routes
  (context "/books" []
    :tags ["books"]

    (GET "/" []
      :summary "Retrieves all books"
      (ok (books/all)))))
