package com.gm.springbootdatamydatis.controller;

import com.gm.springbootdatamydatis.bean.Department;
import com.gm.springbootdatamydatis.bean.Employee;
import com.gm.springbootdatamydatis.mapper.DepartmentMapper;
import com.gm.springbootdatamydatis.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
    @Autowired
    DepartmentMapper departmentMapper;
    @Autowired
    EmployeeMapper employeeMapper;

    //注解版myatis
    @GetMapping("/dept/{id}")
    public Department getDept(@PathVariable("id") Integer id){
        Department dept = departmentMapper.getDeptById(id);
        return dept;
    }
    
    @GetMapping("/dept")
    public Department insertDept(Department department){
        departmentMapper.insertDept(department);
        return department;
    }

    //配置文件版mybatis
    @GetMapping("/emp/{id}")
    public Employee getEmp(@PathVariable("id") Integer id){
        return employeeMapper.findEmpById(id);
    }
    public Employee insertEmp(Employee employee){
        employeeMapper.insertEmp(employee);
        return employee;
    }
}
