(ns compojure-api-setup.schemas
  (:require [schema.core :as s]))

(s/defschema Book
  {:title s/Str
   (s/optional-key :description) s/Str
   :pages s/Int
   :author s/Str})

(s/defschema Author
  {:name s/Str
   (s/optional-key :country) s/Str})