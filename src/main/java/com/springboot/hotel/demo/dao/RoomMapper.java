package com.springboot.hotel.demo.dao;

import com.springboot.hotel.demo.entity.Room;
import com.springboot.hotel.demo.entity.RoomExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RoomMapper {
    long countByExample(RoomExample example);

    int deleteByExample(RoomExample example);

    int deleteByPrimaryKey(Integer roomid);

    int insert(Room record);

    int insertSelective(Room record);

    List<Room> selectByExample(RoomExample example);

    Room selectByPrimaryKey(Integer roomid);

    int updateByExampleSelective(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByExample(@Param("record") Room record, @Param("example") RoomExample example);

    int updateByPrimaryKeySelective(Room record);

    int updateByPrimaryKey(Room record);
}