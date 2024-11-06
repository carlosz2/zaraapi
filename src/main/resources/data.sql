-- Crear la tabla brand
CREATE TABLE brand (
    id INT PRIMARY KEY,
    name VARCHAR(255)
);

-- Insertar datos en la tabla brand
INSERT INTO brand (id, name) VALUES
(1, 'ZARA');

-- Crear la tabla price con la clave foránea
CREATE TABLE price (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    brand_id INT,
    start_date TIMESTAMP,
    end_date TIMESTAMP,
    price_list INT,
    product_id INT,
    priority INT,
    price DOUBLE,
    curr VARCHAR(3),
    CONSTRAINT fk_brand FOREIGN KEY (brand_id) REFERENCES brand(id)
);

-- Insertar datos en la tabla price
INSERT INTO price (brand_id, start_date, end_date, price_list, product_id, priority, price, curr) VALUES
(1, '2020-06-14 00:00:00', '2020-12-31 23:59:59', 1, 35455, 0, 35.50, 'EUR'),
(1, '2020-06-14 15:00:00', '2020-06-14 18:30:00', 2, 35455, 1, 25.45, 'EUR'),
(1, '2020-06-15 00:00:00', '2020-06-15 11:00:00', 3, 35455, 1, 30.50, 'EUR'),
(1, '2020-06-15 16:00:00', '2020-12-31 23:59:59', 4, 35455, 1, 38.95, 'EUR');