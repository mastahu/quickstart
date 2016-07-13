--DROP TABLE books IF EXISTS;

CREATE TABLE books (
  id         INTEGER PRIMARY KEY,
  title VARCHAR(200),
  author  VARCHAR(200)
);
