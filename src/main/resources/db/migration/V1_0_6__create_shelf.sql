CREATE TABLE shelf (
  id BINARY(16) NOT NULL,
  product_id BINARY(16) NOT NULL,
  count INT NOT NULL,
  capacity INT NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT she_prod_prod_fk
    FOREIGN KEY (product_id)
    REFERENCES products (id));