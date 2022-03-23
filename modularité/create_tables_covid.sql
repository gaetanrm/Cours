CREATE TABLE users(
    user_id serial NOT NULL PRIMARY KEY,
    first_name varchar(30),
    last_name varchar(30),
    email varchar(80),
    phone_number varchar(20),
    username varchar(50) NOT NULL,
    password varchar(100) NOT NULL,
    enabled boolean NOT NULL DEFAULT false

);

CREATE TABLE locations(
    location_id serial PRIMARY KEY,
    latitude numeric(18, 16) NOT NULL,
    longitude numeric(18, 16) NOT NULL,
    location_date timestamp without time zone NOT NULL
);

CREATE TABLE user_locations
(
    user_id integer NOT NULL REFERENCES users (user_id),
    location_id integer NOT NULL REFERENCES locations (location_id)
);

CREATE TABLE authorities(
  authority_id serial primary key,
  username varchar(50) NOT NULL 
           REFERENCES users (username),
  authority varchar(50) NOT NULL DEFAULT 'ROLE_USER'
);

CREATE TABLE persistent_logins(
 username varchar(50) NOT NULL 
          REFERENCES users (username),
 series varchar(64) PRIMARY KEY,
 token varchar(64) NOT NULL,
 last_used timestamp NOT NULL
);



INSERT INTO users(first_name,last_name,email,phone_number,username, password) VALUES('Tom','Robinson','tom.rob@yopmail.com','+15103754657', 'totodu34', '123456');
INSERT INTO locations(latitude,longitude,location_date) VALUES(43.63746472422702,3.8409670228559136,now());