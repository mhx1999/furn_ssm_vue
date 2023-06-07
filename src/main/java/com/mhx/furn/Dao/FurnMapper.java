package com.mhx.furn.Dao;

import com.mhx.furn.Bean.Furn;
import com.mhx.furn.Bean.FurnExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


public interface FurnMapper {
    long countByExample(FurnExample example);

    int deleteByExample(FurnExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Furn record);

    int insertSelective(Furn record);

    List<Furn> selectByExample(FurnExample example);

    Furn selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Furn record, @Param("example") FurnExample example);

    int updateByExample(@Param("record") Furn record, @Param("example") FurnExample example);

    int updateByPrimaryKeySelective(Furn record);

    int updateByPrimaryKey(Furn record);
}