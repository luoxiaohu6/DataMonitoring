package com.shiyanshi.dashuju.Seriver.Imp;

import com.shiyanshi.dashuju.Mapper.MonitorInsertMapper;

import com.shiyanshi.dashuju.Pojo.Calculation;
import com.shiyanshi.dashuju.Pojo.Equipment_message;
import com.shiyanshi.dashuju.Seriver.MonitorInsertSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;

@Service
public class MonitorInsertImp implements MonitorInsertSeriver {

    @Autowired
    private MonitorInsertMapper monitorInsertMapper;


    @Override
    public int InsertDataMonitor(Calculation calculation) {

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

//    @Override
//    public int DelDataMonitor(int idnum) {
//
//        monitorInsertMapper.DelDataMonitor(idnum);
//
//        Equipment_message equipment_message = new Equipment_message();
//
//        equipment_message.setMonitor_name(calculation.getEm_Monitor_name());
//        equipment_message.setMequipment_name(calculation.getEm_Equipment_name());
//
//        monitorInsertMapper.DelDataMonitorE(equipment_message);
//
//
//        return 1;
//    }


}
