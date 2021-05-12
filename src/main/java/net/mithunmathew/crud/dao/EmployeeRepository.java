package net.mithunmathew.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.mithunmathew.crud.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
