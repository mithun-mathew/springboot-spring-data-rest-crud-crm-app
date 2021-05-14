package net.mithunmathew.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import net.mithunmathew.crud.entity.Employee;

// Spring Data REST creates endpoint as "/employees" by default (adds 's' to Entity). To override it.
@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
