package ru.otus.java.basic.homework17;

public class SQL {
    /*
    CREATE DATABASE homework17;

    CREATE TABLE tests (
            id serial4 NOT NULL,
            topic varchar(100) NOT NULL,
            CONSTRAINT tests_pk PRIMARY KEY(id),
            CONSTRAINT tests_un UNIQUE(topic)
    );

    CREATE TABLE questions (
            id serial4 NOT NULL,
            question varchar(100) NOT NULL,
            answer1 varchar(100) NOT NULL,
            answer2 varchar(100) NOT NULL,
            answer3 varchar(100),
            answer4 varchar(100),
            answer5 varchar(100),
            correct_answer int4 NOT NULL,
            test_id int4 NOT NULL,
            CONSTRAINT questions_pk PRIMARY KEY(id),
            CONSTRAINT questions_un UNIQUE(question),
            CONSTRAINT answers_check CHECK ((answer3=NULL AND answer4=NULL AND answer5=NULL AND 1<=correct_answer AND correct_answer<=2) OR
									        (answer4=NULL AND answer5=NULL AND 1<=correct_answer AND correct_answer<=3) OR
                                            (answer5=NULL AND 1<=correct_answer AND correct_answer<=4) OR
									        (1<=correct_answer AND correct_answer<=5))
            );*/
}




