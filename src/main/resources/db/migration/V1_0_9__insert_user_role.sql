insert into user_role values (
(select id from users where email = 'sevval@gmail.com'),
(select id from roles where role = 'Admin'));

insert into user_role values (
(select id from users where email = 'tugce@gmail.com'),
(select id from roles where role = 'Warehouse Supervisor'));
