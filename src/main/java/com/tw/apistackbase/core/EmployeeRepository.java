package com.tw.apistackbase.core;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

    Employee findEmployeeByName(String name);

    Employee findEmployeeByNameAndAge(String name, int age);

    @Query("from Employee emp where name=:name and age=:age")
    Employee findEmp(@Param("name") String name, @Param("age") int age);
}
