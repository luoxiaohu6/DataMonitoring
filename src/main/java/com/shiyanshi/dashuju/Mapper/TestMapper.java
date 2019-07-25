package com.shiyanshi.dashuju.Mapper;

import com.shiyanshi.dashuju.Pojo.Equipment_message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface TestMapper {

    List<Equipment_message> findAll();

    List<Equipment_message> SelectByEquipmentMessage(String equipmentName); //通过设备名查询

    List<Equipment_message> SelectByMaxValue(double maxValue);                //通过最大量程查

    List<Equipment_message> SelectByMinValue(double minValue);              //通过最小量程查找

    List<Equipment_message> SelectByDNS(String gateway);                        //通过网关查找

    List<Equipment_message> SelectByID(int id);                             //通过编号查找

    List<Equipment_message> SelectByAccess(String AccessName);              //通过接入点查找

    List<Equipment_message> SelectByMonitorName(String MonitorName);         //通过监测点查找

    List<Equipment_message> SelectByFormula(int Formula);                   //通过计算方式查找

    List<Equipment_message> SelectByStandardValue(double StandardValue);         //通过标准值查找

}
