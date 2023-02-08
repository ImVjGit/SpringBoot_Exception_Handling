package com.SBMCD1.controller;

import com.SBMCD1.Entity.Department;
import com.SBMCD1.Service.DepartmentService;
import com.SBMCD1.error.DepartmentNotFoundException;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentservice;

    private final Logger Logger = LoggerFactory.getLogger( DepartmentController.class);


        @PostMapping("/department")
        public Department saveDepartment(@Valid @RequestBody Department department)
        {
            Logger.info("inside save Department ");
            return departmentservice.saveDepartment(department);
        }

        @GetMapping("/department")
        public List<Department> getDepartment()
        {
            Logger.info("inside all get  Department ");
            return departmentservice.getDepartment();
        }
        @GetMapping("/department/{id}")
        public Department getDepartmentByID(@PathVariable("id")Long departmentId) throws DepartmentNotFoundException {
            Logger.info("inside get Department by id ");
            return departmentservice.getDepartmentByID(departmentId);
        }
        @DeleteMapping("/department/{id}")
        public String deleteDepartmentByID(@PathVariable("id")Long departmentId)
        {
            Logger.info("inside delete  Department ");
            departmentservice.deleteDepartmentByID(departmentId);
            return "Department Delete Successfully!!!";
        }

        @PutMapping("/department/{id}")
        public Department updateDepartment(@PathVariable ("id")Long departmentId,
                                           @RequestBody  Department department)
        {
            Logger.info("inside update  Department ");
         return departmentservice.updateDepartment(departmentId,department);
        }

        @GetMapping("/department/name/{name}")
        public Department getDepartmentByName(@PathVariable("name") String departmentName)
    { Logger.info("inside get  Department  by name ");
        return departmentservice.getDepartmentByName(departmentName);
    }



}
