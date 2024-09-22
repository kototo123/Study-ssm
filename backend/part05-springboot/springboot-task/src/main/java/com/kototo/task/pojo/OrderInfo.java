package com.kototo.task.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class OrderInfo {

    //id
    private Long id;

    //创建时间
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    //更新时间
    private Date updateTime;
    
	//下单用户id
	private Long userId;

	//订单交易号
	private String outTradeNo;

	//医院编号
	private String hoscode;

	//医院名称
	private String hosname;

	//科室编号
	private String depcode;

	//科室名称
	private String depname;

	//排班id
	private String scheduleId;

	//医生职称
	private String title;

	//就诊日期
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date reserveDate;

	//就诊时间：上午 下午
	private Integer reserveTime;

	//就诊人id
	private Long patientId;

	//就诊人名称
	private String patientName;

	//就诊人手机号
	private String patientPhone;

	//预约记录唯一标识（医院预约记录主键）
	private String hosRecordId;

	//预约号序")
	private Integer number;

	//建议取号时间
	private String fetchTime;

	//取号地点
	private String fetchAddress;

	//医事服务费
	private BigDecimal amount;

	//退号时间
	private Date quitTime;

	//订单状态
	private Integer orderStatus;
}