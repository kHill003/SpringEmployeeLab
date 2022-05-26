package com.codeclan.EmployeeDeptLab.repositories;

import com.codeclan.EmployeeDeptLab.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;
//NOTE to self remeber these need to be interfades not dlasses.
public interface DepartmentRepository extends JpaRepository<Department, Long>{
}
