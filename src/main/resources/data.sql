INSERT INTO authority (authority_name) VALUES ('ROLE_USER');
INSERT INTO authority (authority_name) VALUES ('ROLE_ADMIN');

INSERT INTO user (id,email,name,pw) VALUES (1,'1000playch@naver.com','admin','$2a$10$D99zvd9eSCquwrkA5ss7L.GiYshRHu2x.MEgvTbk80SpnGahGNKse');
INSERT INTO user (id,email,name,pw) VALUES (2,'6candoit@naver.com','user','$2a$10$D99zvd9eSCquwrkA5ss7L.GiYshRHu2x.MEgvTbk80SpnGahGNKse');

INSERT INTO user_authority (id,authority_name) VALUES (1,'ROLE_ADMIN');
INSERT INTO user_authority (id,authority_name) VALUES (1,'ROLE_USER');
INSERT INTO user_authority (id,authority_name) VALUES (2,'ROLE_USER');

INSERT INTO question_board (user_id,title,note) VALUES (1,'질문있습니다!','질문....질문.....');