package com.bdqn.service.impl;

import com.bdqn.dao.UserMapper;
import com.bdqn.entity.Student;
import com.bdqn.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
//
//    @Override
//    public List<Teacher> findTeacherList(String tname, String tpwd) {
//        return userMapper.findTeacherList(tname, tpwd);
//    }

    @Override
    public List<Student> findStudentList(String stuname, String stupwd) {
        return userMapper.findStudentList(stuname, stupwd);
    }
}
