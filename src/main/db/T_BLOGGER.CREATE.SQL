create table t_blogger (
id 				int not null primary key auto_increment,
title 			varchar(1000)	not null ,
content			varchar(100) not null,
create_time		timestamp not null,
last_updated	timestamp not null,
creator			varchar(100) not null,
last_updated_by	varchar(100) not null
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;