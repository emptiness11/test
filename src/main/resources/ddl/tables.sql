drop table if exists `user`;
create table user (
    id int primary key auto_increment not null,
    business_id int not null default 0,
    username varchar(255) not null default '',
    mobile varchar(11) not null default '',
    password varchar(128) not null default '',
)