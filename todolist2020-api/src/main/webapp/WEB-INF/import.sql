-- USER
INSERT INTO user(name, surname) values('User1', 'user1');
-- USER
INSERT INTO user(name, surname) values('User2', 'user2');
-- TODOLIST
INSERT INTO todolist(name, id_user) VALUES ('todolistTest1', 1);
INSERT INTO todolist(name, id_user) VALUES ('todolistTest2', 2);
-- TASK
INSERT INTO task(label,startDate,status,id_todolist) VALUES('Task1','1988-11-13',true,1);
INSERT INTO task(label,startDate,status,id_todolist) VALUES('Task2','1988-11-13',true,1);