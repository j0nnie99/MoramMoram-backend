INSERT INTO authority (authority_name) VALUES ('ROLE_USER');
INSERT INTO authority (authority_name) VALUES ('ROLE_ADMIN');

INSERT INTO user (id,email,name,pw) VALUES (1,'1000playch@naver.com','admin','$2a$10$D99zvd9eSCquwrkA5ss7L.GiYshRHu2x.MEgvTbk80SpnGahGNKse');
INSERT INTO user (id,email,name,pw) VALUES (2,'6candoit@naver.com','user','$2a$10$D99zvd9eSCquwrkA5ss7L.GiYshRHu2x.MEgvTbk80SpnGahGNKse');

INSERT INTO user_authority (id,authority_name) VALUES (1,'ROLE_ADMIN');
INSERT INTO user_authority (id,authority_name) VALUES (1,'ROLE_USER');
INSERT INTO user_authority (id,authority_name) VALUES (2,'ROLE_USER');

INSERT INTO QuestionBoard (userId,name,title,note) VALUES (1,'홍길동','질문있습니다1!','질문....질문.....');
INSERT INTO QuestionBoard (userId,name,title,note) VALUES (2,'홍길동','질문있습니다2!','질문....질문.....');
INSERT INTO QuestionBoard (userId,name,title,note) VALUES (3,'홍길동','질문있습니다3!','질문....질문.....');
INSERT INTO QuestionBoard (userId,name,title,note) VALUES (4,'홍길동','질문있습니다4!','질문....질문.....');
INSERT INTO QuestionBoard (userId,name,title,note) VALUES (5,'홍길동','질문있습니다5!','질문....질문.....');
INSERT INTO QuestionBoard (userId,name,title,note) VALUES (6,'홍길동','질문있습니다6!','질문....질문.....');
INSERT INTO QuestionBoard (userId,name,title,note) VALUES (7,'홍길동','질문있습니다7!','질문....질문.....');
INSERT INTO QuestionBoard (userId,name,title,note) VALUES (8,'홍길동','질문있습니다8!','질문....질문.....');
INSERT INTO QuestionBoard (userId,name,title,note) VALUES (9,'홍길동','질문있습니다9!','질문....질문.....');
INSERT INTO QuestionBoard (userId,name,title,note) VALUES (10,'홍길동','질문있습니다10!','질문....질문.....');
INSERT INTO QuestionBoard (userId,name,title,note) VALUES (11,'홍길동','질문있습니다11!','질문....질문.....');
INSERT INTO QuestionBoard (userId,name,title,note) VALUES (12,'홍길동','질문있습니다12!','질문....질문.....');
