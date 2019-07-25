package com.shiyanshi.dashuju.Controller;

import com.shiyanshi.dashuju.Pojo.Main_Monitor;
import com.shiyanshi.dashuju.Seriver.MonitorMainSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class MonitorMainController {

    @Autowired
    private MonitorMainSeriver monitorMainSeriver;


    @RequestMapping("/insertmonitor")
    public int insertmonitor(@RequestBody Main_Monitor main_monitor){

        monitorMainSeriver.InsertMonitor(main_monitor);

        return 1;
    }
}
