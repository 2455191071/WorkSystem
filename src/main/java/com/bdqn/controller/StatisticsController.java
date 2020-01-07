package com.bdqn.controller;

import com.alibaba.fastjson.JSON;
import com.bdqn.entity.Statistics;
import com.bdqn.service.StatisticsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("statistics")
public class StatisticsController {
    @Resource
    private StatisticsService statisticsService;

    @RequestMapping("showBar_Simple")
    public String showBar_Simple(Model model) {
        List<Statistics> list=statisticsService.findStatistics();
        model.addAttribute("list", JSON.toJSONString(list));
        return "writea/bar-simple";
    }
    @RequestMapping("showBar_Simple1")
    public String showBar_Simple1(Model model) {
        List<Statistics> list=statisticsService.findStatistics();
        model.addAttribute("list", JSON.toJSONString(list));
        return "writea/bar-simple1";
    }
}
