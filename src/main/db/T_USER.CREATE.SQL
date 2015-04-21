create table t_user (
id 			int not null auto_increment,
name 		varchar(20)	not null ,
password	varchar(100) not null,
  PRIMARY KEY (`id`),
  UNIQUE KEY `t_user_name_UNIQUE` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;
