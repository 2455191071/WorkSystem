package com.bdqn.controller;

import com.bdqn.entity.Student;
import com.bdqn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("kirb")
public class controller {
    @Resource
    private UserService userService;

    @RequestMapping("getStu")
    public String getStu(){

        return "Test";
    }

    @RequestMapping("getMain2")
    public String getMain1(){

        return "sys/main2";
    }


}
