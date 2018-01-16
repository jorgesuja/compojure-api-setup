(ns compojure-api-setup.models.books
  (:require [conman.core :as conman]
            [compojure-api-setup.database :refer [*db*]]))

(conman/bind-connection *db* "sql/books.sql")
