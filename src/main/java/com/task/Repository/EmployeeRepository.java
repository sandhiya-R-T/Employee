package com.task.Repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.task.employee.Employee;

public interface EmployeeRepository extends MongoRepository<Employee, String> {
    Employee findByEmployeeId(String employeeId);
}