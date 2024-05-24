CREATE TABLE products (
  id BINARY(16) NOT NULL,
  product_name VARCHAR(45) NOT NULL,
  category_id BINARY(16) NOT NULL,
  quantity INT NOT NULL,
  unit_price DECIMAL NOT NULL,
  sale_price DECIMAL NOT NULL,
  brand VARCHAR(45) NOT NULL,
  PRIMARY KEY (id),
  CONSTRAINT prod_cate_cate_fk
  	FOREIGN KEY (category_id)
  	REFERENCES categories (id)
  	ON DELETE NO ACTION
  	ON UPDATE NO ACTION);