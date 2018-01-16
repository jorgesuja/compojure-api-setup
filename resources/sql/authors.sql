-- :name all :*
SELECT * FROM authors

-- :name find :1
SELECT * FROM authors WHERE id = :id

-- :name create :i!
INSERT INTO authors (name)
VALUES (:name)

-- :name truncate :!
DELETE FROM authors