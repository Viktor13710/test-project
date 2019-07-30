DROP TABLE IF EXISTS Student;
CREATE TABLE Student (
    id serial PRIMARY KEY,
    firstName varchar(100) NOT NULL,
    lastName varchar(100) NOT NULL ,
    age INT NOT NULL,
    faculty varchar(100) NOT NULL,
    groupID varchar(100) NOT NULL
);