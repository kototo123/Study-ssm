package com.kototo.task.service.impl;

import com.kototo.task.mapper.OrderInfoMapper;
import com.kototo.task.pojo.OrderInfo;
import com.kototo.task.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class OrderInfoServiceImpl implements OrderInfoService {
    @Autowired
    private OrderInfoMapper orderInfoMapper;
    @Override
    @Transactional(readOnly = true)
    public void sendMessage(String dataString) {
        List<OrderInfo> orderInfoList = orderInfoMapper.selectScheduleByReserveDate(dataString);
        for (OrderInfo orderInfo : orderInfoList) {
            System.out.println(orderInfo.getHosname()+"\t"+orderInfo.getReserveDate());
        }
    }
}
