package com.bdqn.service;


import com.bdqn.entity.Student;

import java.util.List;

public interface UserService {
//    public List<Teacher> findTeacherList(String tname, String tpwd);

    public List<Student> findStudentList(String stuname, String stupwd);

}
