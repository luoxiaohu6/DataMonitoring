package com.shiyanshi.dashuju.Mapper;

import com.shiyanshi.dashuju.Pojo.Calculation;
import com.shiyanshi.dashuju.Pojo.Equipment_message;

import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface MonitorInsertMapper {

    int InsertDataMonitor(Calculation calculation);

    int UpdateDataMonitor(Calculation calculation);

    int DelDataMonitor(Calculation calculation);
//    int DelDataMonitor(int  idnum);

    int DelDataMonitorE(Equipment_message equipment_message);
}
