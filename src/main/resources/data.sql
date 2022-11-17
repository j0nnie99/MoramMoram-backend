INSERT INTO authority (authority_name) VALUES ('ROLE_USER');
INSERT INTO authority (authority_name) VALUES ('ROLE_ADMIN');
INSERT INTO authority (authority_name) VALUES ('ROLE_OFFICE');

INSERT INTO user (id,email,name,pw,pnum,uimg,seller,report,maketing) VALUES (1,'1000playch@naver.com','admin','$2a$10$D99zvd9eSCquwrkA5ss7L.GiYshRHu2x.MEgvTbk80SpnGahGNKse','010-1234-1234',null,true,0,true);
INSERT INTO user (id,email,name,pw,pnum,uimg,seller,report,maketing) VALUES (2,'6candoit@naver.com','user','$2a$10$D99zvd9eSCquwrkA5ss7L.GiYshRHu2x.MEgvTbk80SpnGahGNKse','010-1234-1234',null,true,0,true);
INSERT INTO user (id,email,name,pw,pnum,uimg,seller,report,maketing,office_add,maket_add) VALUES (3,'6candoit@gmail.com','office','$2a$10$D99zvd9eSCquwrkA5ss7L.GiYshRHu2x.MEgvTbk80SpnGahGNKse','010-5678-5678',null,true,0,true,"dk.jpn","aa.png");

INSERT INTO user_authority (id,authority_name) VALUES (1,'ROLE_ADMIN');
INSERT INTO user_authority (id,authority_name) VALUES (1,'ROLE_USER');
INSERT INTO user_authority (id,authority_name) VALUES (1,'ROLE_OFFICE');
INSERT INTO user_authority (id,authority_name) VALUES (2,'ROLE_USER');
INSERT INTO user_authority (id,authority_name) VALUES (3,'ROLE_OFFICE');

INSERT INTO question_board (question_board_id,user_id,name,title,note,status) VALUES (1,1,'홍길동','질문있습니다1!','질문....질문.....','status');
INSERT INTO question_board (question_board_id,user_id,name,title,note,status) VALUES (2,1,'홍길동','질문있습니다1!','질문....질문.....','status');
INSERT INTO question_board (question_board_id,user_id,name,title,note,status) VALUES (3,1,'홍길동','질문있습니다1!','질문....질문.....','status');
INSERT INTO question_board (question_board_id,user_id,name,title,note,status) VALUES (4,1,'홍길동','질문있습니다1!','질문....질문.....','status');
INSERT INTO question_board (question_board_id,user_id,name,title,note,status) VALUES (5,1,'홍길동','질문있습니다1!','질문....질문.....','status');
INSERT INTO question_board (question_board_id,user_id,name,title,note,status) VALUES (6,1,'홍길동','질문있습니다1!','질문....질문.....','status');
INSERT INTO question_board (question_board_id,user_id,name,title,note,status) VALUES (7,1,'홍길동','질문있습니다1!','질문....질문.....','status');
INSERT INTO question_board (question_board_id,user_id,name,title,note,status) VALUES (8,1,'홍길동','질문있습니다1!','질문....질문.....','status');
INSERT INTO question_board (question_board_id,user_id,name,title,note,status) VALUES (9,1,'홍길동','질문있습니다1!','질문....질문.....','status');
INSERT INTO question_board (question_board_id,user_id,name,title,note,status) VALUES (10,1,'홍길동','질문있습니다1!','질문....질문.....','status');
INSERT INTO question_board (question_board_id,user_id,name,title,note,status) VALUES (11,1,'홍길동','질문있습니다1!','질문....질문.....','status');
INSERT INTO question_board (question_board_id,user_id,name,title,note,status) VALUES (12,1,'홍길동','질문있습니다1!','질문....질문.....','status');

