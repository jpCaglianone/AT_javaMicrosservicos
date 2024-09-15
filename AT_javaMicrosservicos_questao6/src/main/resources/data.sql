CREATE TABLE produtos (
                          id SERIAL PRIMARY KEY,
                          nome VARCHAR(255) NOT NULL,
                          preco DOUBLE NOT NULL
);

INSERT INTO produtos (nome, preco) VALUES ('Produto A', 29.99);
INSERT INTO produtos (nome, preco) VALUES ('Produto B', 19.99);
