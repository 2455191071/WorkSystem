package com.bdqn.service;


import com.bdqn.entity.Statistics;

import java.util.List;

public interface StatisticsService {
    List<Statistics> findStatistics();
    Statistics findStatisticsBySdate();
    int addStatistics(Statistics statistics);
    Statistics findStatisticsSum();
}
