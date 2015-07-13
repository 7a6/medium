CREATE DATABASE IF NOT EXISTS medium CHARACTER SET = 'utf8' COLLATE = 'utf8_unicode_ci';

CREATE TABLE IF NOT EXISTS user 
(   "id" INT NOT NULL AUTO_INCREMENT,
    "long_name" VARCHAR(255) NOT NULL,
    "short_name" VARCHAR(25),
    "username" VARCHAR(255) NOT NULL,
    "password" VARCHAR(255) NOT NULL,
    "auth" 

