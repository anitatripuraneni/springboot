package com.springbootdao.repository;

import org.springframework.data.repository.CrudRepository;

import com.springbootdao.bean.Employee;

public interface EmployeeRepository extends CrudRepository<Employee,Long> {

}
