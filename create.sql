drop database if exists ibm_mentor_on_demand;
create database ibm_mentor_on_demand;
-- user mentor training table
create table if not exists `ibm_mentor_on_demand`.`training`(
 `training_id` bigint(20) not null auto_increment comment 'training_id and primary key',
 `status` varchar(128) not null default '' comment 'status',
 `progress` bigint(20) not null default 0 comment 'progress',
 `fees` decimal not null default 0.0 comment 'fees',
 `commission_amount` decimal not null default 0.0 comment 'commission_amount',
 `rating` bigint(20) not null default 0 comment 'rating',
 `start_date` datetime not null default '1970-01-01 08:00:00' comment 'start_date',
 `end_date` datetime not null default '1970-01-01 08:00:00' comment 'end_date',
 `amount_received` decimal not null default 0.0 comment 'amount_received',
 `user_id` bigint(20) not null default 0 comment 'user_id',
 `mentor_id` bigint(20) not null default 0 comment 'mentor_id',
 `skill_id` bigint(20) not null default 0 comment 'skill_id',
 `razorpay_payment_id` varchar(128) not null default '' comment 'razorpay_payment_id',
 `create_date` datetime not null default '1970-01-01 08:00:00' comment 'create_date',
 `update_date` datetime not null default '1970-01-01 08:00:00' comment 'update_date',
 primary key(`training_id`),
 unique key `key_user_mentor_skill_id` (`user_id`,`mentor_id`,`skill_id`)
) engine=innodb auto_increment=6 default charset=utf8 row_format=compact comment='user and mentor training table';

-- mentor skill table
create table if not exists `ibm_mentor_on_demand`.`skill`(
 `skill_id` bigint(20) not null auto_increment comment 'skill_id',
 `skill_name` varchar(128) not null default '' comment 'skill_name',
 `toc` varchar(128) not null default '' comment 'toc',
 `prerequisites` varchar(128) not null default '' comment 'prerequisites',
 `start_date` datetime not null default '1970-01-01 08:00:00' comment 'start_date',
 `update_date` datetime not null default '1970-01-01 08:00:00' comment 'update_date',
 primary key(`skill_id`),
 unique key `key_skill_name` (`skill_name`)
)engine=innodb auto_increment=6 default charset=utf8 row_format=compact comment='mentor skill table';

-- user table
create table if not exists `ibm_mentor_on_demand`.`_user`(
 `user_id` bigint(20) not null auto_increment comment 'user_id',
 `username` varchar(128) not null default '' comment 'username',
 `password` varchar(128) not null default '' comment 'password',
 `contact_no` varchar(128) default '' comment 'contact_no',
 `reg_code` varchar(128) default '' comment 'reg_code',
 `_role` varchar(128) default '' comment 'role',
 `linkedin_url` varchar(128) default '' comment 'linkedin_url',
 `years_of_experience` decimal default 0.0 comment 'years_of_experience',
 `_active` tinyint(1) default 0 comment 'active',
 `confirmed_signup` tinyint(1) default 0 comment 'confirmed_signup',
 `reset_pwd` tinyint(1) default 0 comment 'reset_pwd',
 `reset_pwd_date` datetime not null default '1970-01-01 08:00:00' comment 'reset_pwd_date',
 `create_date` datetime not null default '1970-01-01 08:00:00' comment 'create_date',
 `update_date` datetime not null default '1970-01-01 08:00:00' comment 'update_date',
 primary key(`user_id`),
 unique key `key_username_name` (`username`)
)engine=innodb auto_increment=6 default charset=utf8 row_format=compact comment='user table';