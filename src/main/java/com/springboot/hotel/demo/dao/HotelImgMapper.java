package com.springboot.hotel.demo.dao;

import com.springboot.hotel.demo.entity.HotelImg;
import com.springboot.hotel.demo.entity.HotelImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HotelImgMapper {
    long countByExample(HotelImgExample example);

    int deleteByExample(HotelImgExample example);

    int deleteByPrimaryKey(Integer imgid2);

    int insert(HotelImg record);

    int insertSelective(HotelImg record);

    List<HotelImg> selectByExample(HotelImgExample example);

    HotelImg selectByPrimaryKey(Integer imgid2);

    int updateByExampleSelective(@Param("record") HotelImg record, @Param("example") HotelImgExample example);

    int updateByExample(@Param("record") HotelImg record, @Param("example") HotelImgExample example);

    int updateByPrimaryKeySelective(HotelImg record);

    int updateByPrimaryKey(HotelImg record);
}