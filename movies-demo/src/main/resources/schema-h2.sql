create table movie
(  id integer not null auto_increment,
   title varchar(255) not null,
   releaseDate Date,
   type_desc varchar(50), 
   director varchar(100),
   primary key(id)
);