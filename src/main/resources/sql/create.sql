DROP TABLE IF EXISTS categories;
CREATE TABLE categories(
  id int(2) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255) NOT NULL
);

INSERT INTO categories (id, title) VALUES (0, 'cheap');
INSERT INTO categories (id, title) VALUES (0, 'high-priced');
INSERT INTO categories (id, title) VALUES (0, 'business-class');
INSERT INTO categories (id, title) VALUES (0, 'president-class');

DROP TABLE IF EXISTS addoptions;
CREATE TABLE addoptions(
  id int(2) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255) NOT NULL
);


ALTER TABLE addoptions ADD price int(5) NOT NULL;

INSERT  INTO addoptions (id,title,price) VALUES (0,'breakfast', 5);
INSERT  INTO addoptions (id,title,price) VALUES (0,'dinner', 5);
INSERT  INTO addoptions (id,title,price) VALUES (0,'tennis', 5);

DROP TABLE IF EXISTS cleanings;
CREATE TABLE cleanings(
  id int(2) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  title VARCHAR(255) NOT NULL,
  price int(5)
);

INSERT INTO cleanings(id, title, price) VALUES (0, 'full',2);
INSERT INTO cleanings(id, title, price) VALUES (0, 'mini',2);


DROP TABLE IF EXISTS rooms;
CREATE TABLE rooms(
  id int(5) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  category_id int(5) NOT NULL,
  price int(10) NOT NULL,
  additional_options_id int(5),
  cleaning_id int(5),
  FOREIGN KEY (category_id) REFERENCES categories(id),
  FOREIGN KEY (additional_options_id) REFERENCES addoptions(id),
  FOREIGN KEY (cleaning_id) REFERENCES cleanings(id)
);

INSERT INTO rooms(id, category_id, price, additional_options_id, cleaning_id) VALUES (0,1,100,3,1);
INSERT INTO rooms(id, category_id, price, additional_options_id, cleaning_id) VALUES (0,2,140,1,2);
INSERT INTO rooms(id, category_id, price, additional_options_id, cleaning_id) VALUES (0,3,1000,2,2);


DROP TABLE IF EXISTS users;
CREATE TABLE users(
  id int(5) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(255) NOT NULL
);

DROP TABLE IF EXISTS orders;
CREATE TABLE orders(
  id int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
  user_id int(5) NOT NULL,
  room_id int(5) NOT NULL,
  date TIMESTAMP NOT NULL,

  FOREIGN KEY (user_id) REFERENCES users(id),
  FOREIGN KEY (room_id) REFERENCES rooms(id)
);