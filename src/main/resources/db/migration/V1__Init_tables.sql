create sequence hibernate_sequence;

create table Employee (
                          id LONG primary key ,
                          name VARCHAR(225),
                          age INT,
                          company_id long
);

create table Company (
                         id LONG primary key ,
                         name VARCHAR(225),
                         profile_id long unique
);


create table Company_Profile (
                         id LONG PRIMARY KEY,
                         registered_capital LONG,
                         cert_id VARCHAR(225)
);
// 数据库一般不区分大小写， ORM（对象关系映射，eg. hibernate）框架会把_自动转成驼峰
// int long float null bit varchar(变长)  char(定长) text