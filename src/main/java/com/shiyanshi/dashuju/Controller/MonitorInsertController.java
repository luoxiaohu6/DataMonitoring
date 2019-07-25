package com.shiyanshi.dashuju.Controller;

import com.shiyanshi.dashuju.Pojo.Calculation;
import com.shiyanshi.dashuju.Pojo.Equipment_message;

import com.shiyanshi.dashuju.Seriver.MonitorInsertSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class MonitorInsertController {

    @Autowired
    private MonitorInsertSeriver monitorInsertSeriver;

    @RequestMapping("/insertDataMonitor")
    public int insertMonitor(@RequestBody Calculation calculation){
        System.out.println(calculation);
        if(calculation==null){
            System.out.println("为空");
        }else {
            monitorInsertSeriver.InsertDataMonitor(calculation);
        }
        return 1;
    }

    @PutMapping("/updateDataMonitor")
    public int updateDataMonitor(@RequestBody Calculation calculation){

        monitorInsertSeriver.UpdateDataMonitor(calculation);

        return 1;
    }

    @DeleteMapping("/delDataMonitor")
    public int delDataMonitor(@RequestBody Calculation calculation){

        monitorInsertSeriver.DelDataMonitor(calculation);

        return 1;
    }

}
