package com.bdqn.service;

import com.bdqn.entity.Paper;
import com.bdqn.entity.StuClass;

import java.util.List;

public interface PaperService {
    int addPaperService(Paper paper);

    int updPaperService(Paper paper);

    int delPaperService(String pnum);

    int findPaperCountService(String pnum
            , String pdateStart
            , String pdateEnd
            , Integer classid
            , String username
            , Integer isidentify);

    List<Paper> findPaperService(String pnum
            , String pdateStart
            , String pdateEnd
            , Integer classid
            , String username
            , Integer isidentify
            , int pageStart
            , int pageSize);

    List<StuClass> findStuClassService();

    int findWordaCountService();

    Paper findPaperByIdService(Integer pid);
}
