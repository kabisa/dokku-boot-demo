CREATE TABLE quotes (
    id BIGSERIAL NOT NULL,
    text TEXT NOT NULL,
    CONSTRAINT PK_QUOTES PRIMARY KEY (id)
);

INSERT INTO quotes (text) VALUES ('You miss 100% of the shots you don’t take');
INSERT INTO quotes (text) VALUES ('Strive not to be a success, but rather to be of value.');
INSERT INTO quotes (text) VALUES ('Life is 10% what happens to me and 90% of how I react to it');