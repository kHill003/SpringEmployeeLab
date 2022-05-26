package com.codeclan.EmployeeDeptLab.repositories;

import com.codeclan.EmployeeDeptLab.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
//Make it a interface love
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
}
