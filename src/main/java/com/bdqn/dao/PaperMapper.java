package com.bdqn.dao;

import com.bdqn.entity.Paper;
import com.bdqn.entity.StuClass;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface PaperMapper {
    int addPaper(Paper paper);

    int updPaper(Paper paper);

    int delPaper(@Param("pnum") String pnum);

    int findPaperCount(@Param("pnum") String pnum
            , @Param("pdateStart") String pdateStart
            , @Param("pdateEnd") String pdateEnd
            , @Param("classid") Integer classid
            , @Param("username") String username
            , @Param("isidentify") Integer isidentify);

    List<Paper> findPaper(@Param("pnum") String pnum
            , @Param("pdateStart") String pdateStart
            , @Param("pdateEnd") String pdateEnd
            , @Param("classid") Integer classid
            , @Param("username") String username
            , @Param("isidentify") Integer isidentify
            , @Param("pageStart") int pageStart
            , @Param("pageSize") int pageSize);

    List<StuClass> findStuClass();

    int findWordaCount();

    Paper findPaperById(@Param("pid") Integer pid);
}
