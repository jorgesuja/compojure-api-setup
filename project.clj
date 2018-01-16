(defproject compojure-api-setup "0.1.0-SNAPSHOT"

  :description "Simple example application using compojure-api, with added database migrations and seeds."

  :dependencies [[com.layerware/hugsql "0.4.7"]
                 [conman "0.6.6"]
                 [cprop "0.1.11"]
                 [metosin/compojure-api "1.1.10"]
                 [migratus "0.9.5"]
                 [mount "0.1.11"]
                 [mysql/mysql-connector-java "6.0.6"]
                 [org.clojure/clojure "1.8.0"]
                 [org.slf4j/slf4j-log4j12 "1.7.9"]
                 [ring/ring-devel "1.6.1"]
                 [ring/ring-jetty-adapter "1.6.1"]]

  :main compojure-api-setup.core

  :uberjar-name "compojure-api-setup.jar"

  :profiles {:dev {:dependencies [[javax.servlet/javax.servlet-api "3.1.0"]]
                   :plugins [[lein-ring "0.10.0"]]}}

  :plugins [[migratus-lein "0.4.9"]]

  :migratus {:store :database
             :db ~(get (System/getenv) "DATABASE_URL")}
)
