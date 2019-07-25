package com.shiyanshi.dashuju.Seriver.Imp;

import com.shiyanshi.dashuju.Mapper.MonitorMainMapper;
import com.shiyanshi.dashuju.Pojo.Main_Monitor;
import com.shiyanshi.dashuju.Seriver.MonitorMainSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonitorMainImp implements MonitorMainSeriver {

    @Autowired
    private MonitorMainMapper monitorMainMapper;


    @Override
    public int InsertMonitor(Main_Monitor main_monitor) {
        monitorMainMapper.InsertMonitor(main_monitor);
        return 1;
    }

    @Override
    public int UpdataMonitor(Main_Monitor main_monitor) {

        return 1;
    }

    @Override
    public int DelMonitor(Main_Monitor main_monitor) {

        return 1;
    }
}
