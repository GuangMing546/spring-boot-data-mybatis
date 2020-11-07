package com.gm.springbootdatamydatis.mapper;

import com.gm.springbootdatamydatis.bean.Department;
import org.apache.ibatis.annotations.*;

//这里用了mapper的包扫描
//@Mapper //指定这是一个操作数据库的mapper
public interface DepartmentMapper {
    @Select("select * from department where id=#{id}")
    public Department getDeptById(Integer id);

    @Select("delete from department where id=#{id}")
    public int deleteDeptById(Integer id);

    @Options(useGeneratedKeys = true,keyProperty = "id") //插入的时候 主键又注入进来给department对象，用来显示
    @Insert("insert into department(department_name) value (#{departmentName})")
    public int insertDept(Department department);

    @Update("update department set department_name=#{departmentName} where id=#{id}")
    public int updateDept(Department department);

}
