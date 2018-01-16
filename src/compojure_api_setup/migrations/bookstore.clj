(ns compojure-api-setup.migrations.bookstore
  (:require [compojure-api-setup.models.authors :as authors]
            [compojure-api-setup.models.books :as books]))

(def ^:private authors [
  {:name "Fernando Aramburu" :books ["Patria"]}
  {:name "Federico Moccia" :books ["Tres veces tú"]}
  {:name "Dolores Redondo" :books ["Todo esto te daré"]}
  {:name "Carlos Ruiz Zafón" :books ["El Laberinto de los Espíritus"]}
  {:name "Luz Gabás" :books ["Como fuego en el hielo"]}
  {:name "Mónica Carrillo" :books ["El tiempo. Todo. Locura"]}
  {:name "Laura Norton" :books ["Ante todo, mucho karma"]}
  {:name "Luis Landero Duran" :books ["La vida negociable"]}
  {:name "Marcos Chicot" :books ["El asesinato de Sócrates"]}
  {:name "Paula Hawkins" :books ["La chica del tren"]}])

(defn- create-books
  "Inserts books from vector of names and author id"
  [author-id book-names connection]
  (doseq [book-name book-names]
    (books/create connection {:name book-name :author-id author-id})))

(defn migrate-up
  "Populates authors and books tables with test data"
  [{connection :conn}]
  (doseq [author-data authors]
    (-> (authors/create connection author-data)
        :generated_key
        (create-books (:books author-data) connection))))

(defn migrate-down
  "Truncates authors and books (by cascading)"
  [{connection :conn}]
  (authors/truncate connection))
