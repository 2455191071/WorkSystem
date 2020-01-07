package com.bdqn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;

@SpringBootApplication

public class WorksystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(WorksystemApplication.class, args);
    }
    //这里配置静态资源文件的路径导包都是默认的直接导入就可以
}
