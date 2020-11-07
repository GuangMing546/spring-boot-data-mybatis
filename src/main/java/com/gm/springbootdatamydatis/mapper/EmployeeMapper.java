package com.gm.springbootdatamydatis.mapper;

import com.gm.springbootdatamydatis.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

//@Mapper
//@MapperScan
public interface EmployeeMapper {
    public Employee findEmpById(Integer id);
    public int insertEmp(Employee employee);
}
