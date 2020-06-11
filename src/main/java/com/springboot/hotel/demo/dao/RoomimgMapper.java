package com.springboot.hotel.demo.dao;

import com.springboot.hotel.demo.entity.Roomimg;
import com.springboot.hotel.demo.entity.RoomimgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomimgMapper {
    long countByExample(RoomimgExample example);

    int deleteByExample(RoomimgExample example);

    int deleteByPrimaryKey(Integer imgid);

    int insert(Roomimg record);

    int insertSelective(Roomimg record);

    List<Roomimg> selectByExample(RoomimgExample example);

    Roomimg selectByPrimaryKey(Integer imgid);

    int updateByExampleSelective(@Param("record") Roomimg record, @Param("example") RoomimgExample example);

    int updateByExample(@Param("record") Roomimg record, @Param("example") RoomimgExample example);

    int updateByPrimaryKeySelective(Roomimg record);

    int updateByPrimaryKey(Roomimg record);
}