package com.springboot.hotel.demo.dao;

import com.springboot.hotel.demo.entity.Api;
import com.springboot.hotel.demo.entity.ApiExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ApiMapper {
    long countByExample(ApiExample example);

    int deleteByExample(ApiExample example);

    int insert(Api record);

    int insertSelective(Api record);

    List<Api> selectByExample(ApiExample example);

    int updateByExampleSelective(@Param("record") Api record, @Param("example") ApiExample example);

    int updateByExample(@Param("record") Api record, @Param("example") ApiExample example);
}