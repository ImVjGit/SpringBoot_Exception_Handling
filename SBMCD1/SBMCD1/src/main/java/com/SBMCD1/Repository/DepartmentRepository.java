package com.SBMCD1.Repository;

import com.SBMCD1.Entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {


public Department findByDepartmentName(String departmentName);
public Department findByDepartmentNameIgnoreCase(String departmentName);



}
