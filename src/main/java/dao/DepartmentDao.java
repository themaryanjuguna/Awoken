package dao;

import models.Department;
import sun.java2d.cmm.Profile;

import java.util.List;

public abstract class DepartmentDao {

    //CREATE: save department information


    void save(Department department) {

    }

    // list all departments
    List<Department> findAll(int deptId) {
        return null;
    }


    //delete a department
    void delete(int id) {
    }

    //delete all departments
    void clearAll() {

    }
}
