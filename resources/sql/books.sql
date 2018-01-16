-- :name all :*
SELECT * FROM books

-- :name find :1
SELECT * FROM books WHERE id = :id

-- :name create :i!
INSERT INTO books (name, author_id)
VALUES (:name, :author-id)

-- :name truncate :!
DELETE FROM books