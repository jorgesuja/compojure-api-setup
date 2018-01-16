(ns compojure-api-setup.models.authors
  (:require [conman.core :as conman]
            [compojure-api-setup.database :refer [*db*]]))

(conman/bind-connection *db* "sql/authors.sql")
