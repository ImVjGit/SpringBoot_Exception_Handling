package com.SBMCD1.Service;

import com.SBMCD1.Entity.Department;
import com.SBMCD1.error.DepartmentNotFoundException;
import org.springframework.stereotype.Component;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment( Department department);
    public List<Department> getDepartment();
    public Department getDepartmentByID(Long departmentId) throws DepartmentNotFoundException;

    public void deleteDepartmentByID(Long departmentId);

   public Department updateDepartment(Long departmentId, Department department);

   public Department getDepartmentByName(String departmentname);
}
