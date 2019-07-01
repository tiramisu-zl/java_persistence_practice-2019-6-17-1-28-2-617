alter table Employee add foreign key (company_id) references Company(id);
alter table Company add foreign key (company_profile_id) references Company_Profile(id)