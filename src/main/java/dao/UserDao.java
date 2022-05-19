package dao;

import models.Department;
import models.User;
import java.util.List;

public interface UserDao {
    //save user information
    void save(User name);
    //list all users
    List<User> findAll();
    //find user by id
    User findById(int id);
    //find all users in a department
    List<Department> allUsersInADepartment(int deptId);
    //delete a user
    void delete(int id);
    //delete all users
    void clearAll();
}

