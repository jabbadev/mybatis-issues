/*
 
PRODUCT                             VERSION         STATUS        
----------------------------------- --------------- ---------------
NLSRTL                              11.2.0.4.0      Production     
Oracle Database 11g Enterprise Edit
ion  11.2.0.4.0      64bit Productio
                                                    n              

PL/SQL                              11.2.0.4.0      Production     
TNS for Linux:                      11.2.0.4.0      Production

*/

drop table users;
create table users (
  id number ,
  name varchar(20)
);

insert into users (id, name) values (1, 'User1');
insert into users (id, name) values (2, 'User2');

drop table login_sessions;

create table login_sessions (
  id number,
  user_id number,
  session_id varchar(10)
);

insert into login_sessions (id,user_id,session_id) values (1,2,'000000001');





