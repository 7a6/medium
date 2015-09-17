CREATE DATABASE IF NOT EXISTS medium CHARACTER SET = 'utf8' COLLATE = 'utf8_unicode_ci';

CREATE TABLE IF NOT EXISTS user 
(   "username" VARCHAR(255) NOT NULL PRIMARY KEY,
    "long_name" VARCHAR(255) NOT NULL,
    "short_name" VARCHAR(25),
    "password" VARCHAR(255) NOT NULL,
    "auth" 
)

