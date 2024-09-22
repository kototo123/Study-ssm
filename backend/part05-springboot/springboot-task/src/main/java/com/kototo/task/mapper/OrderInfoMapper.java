package com.kototo.task.mapper;

import com.kototo.task.pojo.OrderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderInfoMapper {
    List<OrderInfo> selectScheduleByReserveDate(String dataString);

}
