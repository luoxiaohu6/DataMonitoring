package com.shiyanshi.dashuju.Controller;

import com.shiyanshi.dashuju.Pojo.Equipment_message;
import com.shiyanshi.dashuju.Seriver.TestSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class TestController {

    @Autowired
    private TestSeriver testSeriver;

    @RequestMapping("/select")
    public List<Equipment_message> findAll(){
        List<Equipment_message> list = this.testSeriver.findAll();
        return list;
    }

    @PostMapping("/select_1")
    public List<Equipment_message> SelectByEquipmentMessage(@RequestParam("equipmentMessage") String equipmentMessage){
        List<Equipment_message> list = this.testSeriver.SelectByEquipmentMessage(equipmentMessage);
        return list;

    }

    @PostMapping("/select_2")
    public List<Equipment_message> SelectByMaxValue(@RequestParam("maxValue") double maxValue){
        List<Equipment_message> list = this.testSeriver.SelectByMaxValue(maxValue);
        return list;
    }

    @PostMapping("/select_3")
    public List<Equipment_message> SelectByDNS(@RequestParam("gateway") String gateway) {
        List<Equipment_message> list=this.testSeriver.SelectByDNS(gateway);
        return  list;
    }

    @PostMapping("/select_4")
    public List<Equipment_message> SelectByID(@RequestParam("id") int id) {
        List<Equipment_message> list=this.testSeriver.SelectByID(id);
        return  list;
    }

    @PostMapping("/select_5")
    public List<Equipment_message> SelectByAccess(@RequestParam("AccessName") String AccessName) {
        List<Equipment_message> list=this.testSeriver.SelectByAccess(AccessName);
        return  list;
    }

    @PostMapping("/select_6")
    public List<Equipment_message> SelectByMonitorName(@RequestParam("MonitorName") String MonitorName) {
        List<Equipment_message> list=this.testSeriver.SelectByMonitorName(MonitorName);
        return  list;
    }
    @PostMapping("/select_7")
    public List<Equipment_message> SelectByFormula(@RequestParam("Formula") int Formula) {
        List<Equipment_message> list=this.testSeriver.SelectByFormula(Formula);
        return  list;
    }
    @PostMapping("/select_8")
    public List<Equipment_message> SelectByStandardValue(@RequestParam("StandardValue") double StandardValue) {
        List<Equipment_message> list=this.testSeriver.SelectByStandardValue(StandardValue);
        return  list;
    }
    @PostMapping("/select_9")
    public List<Equipment_message> SelectByMinValue(@RequestParam("minValue") double minValue){
        List<Equipment_message> list=this.testSeriver.SelectByMinValue(minValue);
        return  list;
    }

}
