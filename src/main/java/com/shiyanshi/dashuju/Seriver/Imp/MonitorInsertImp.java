package com.shiyanshi.dashuju.Seriver.Imp;

import com.shiyanshi.dashuju.Mapper.MonitorInsertMapper;

import com.shiyanshi.dashuju.Pojo.Calculation;
import com.shiyanshi.dashuju.Pojo.Equipment_message;
import com.shiyanshi.dashuju.Seriver.MonitorInsertSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;

@Service
public class MonitorInsertImp implements MonitorInsertSeriver {

    @Autowired
    private MonitorInsertMapper monitorInsertMapper;


    @Override
    public int InsertDataMonitor(Calculation calculation) {
////        monitorInsert.setTime(new Timestamp(new Date().getTime()));   //自动获取系统时间
//        monitorInsertMapper.InsertDataMonitor(monitorInsert);
//
//        monitorInsert.setIdca(monitorInsert.getId());
//        monitorInsert.setDNS_c(monitorInsert.getDNS());
//        monitorInsert.setAccess_name_c(monitorInsert.getAccess_name());
//
////        System.out.println(monitorInsert.getDNS_c());
////        System.out.println(monitorInsert.getIdca());
////        System.out.println(monitorInsert.getMaxValue());
//
//        monitorInsertMapper.InsertDataMonitorC(monitorInsert);
        monitorInsertMapper.InsertDataMonitor(calculation);


        return 1;
    }

    @Override
    public int UpdateDataMonitor(Calculation calculation) {

        monitorInsertMapper.UpdateDataMonitor(calculation);

        return 1;
    }

    @Override
    public int DelDataMonitor(Calculation calculation) {

        monitorInsertMapper.DelDataMonitor(calculation);

        Equipment_message equipment_message = new Equipment_message();

        equipment_message.setMonitor_name(calculation.getEm_Monitor_name());
        equipment_message.setMequipment_name(calculation.getEm_Equipment_name());

        monitorInsertMapper.DelDataMonitorE(equipment_message);


        return 1;
    }


}
