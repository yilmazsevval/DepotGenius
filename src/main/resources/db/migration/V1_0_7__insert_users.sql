insert into users (id, first_name, last_name, email, password) 
values 
	(unhex(replace(uuid(), '-', '')), 'Şevval', 'Yılmaz', 'sevval@gmail.com', 'sevval'),
	(unhex(replace(uuid(), '-', '')), 'Tuğçe', 'Dalay', 'tugce@gmail.com', 'tugce')