package com.shiyanshi.dashuju.Seriver;

import com.shiyanshi.dashuju.Pojo.Calculation;


public interface MonitorInsertSeriver {

    int InsertDataMonitor(Calculation calculation);         //增加监测点

    int UpdateDataMonitor(Calculation calculation);             //更新监测点

    int DelDataMonitor(Calculation calculation);           //删除监测点
//    int DelDataMonitor(int idnum);                          //删除监测点
}
