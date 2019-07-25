package com.shiyanshi.dashuju.Controller;


import com.shiyanshi.dashuju.Pojo.Equipment_Main;
import com.shiyanshi.dashuju.Seriver.EquipmentmanageSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class EquipmentmanageController {

@Autowired
private EquipmentmanageSeriver equipmentmanageSeriver;


    @RequestMapping("/select1")
    public List<Equipment_Main> list1()
    {
        List<Equipment_Main> list1=this.equipmentmanageSeriver.MachinfindMain();

        return list1;
    }


    @PostMapping("/Equipment_name")
    public List<Equipment_Main> Equipment_name(@RequestParam("Equipment_name") String Equipment_name){

        List<Equipment_Main> list = this.equipmentmanageSeriver.MachinByEquipment_name(Equipment_name);
        return list;
    }


    @PostMapping("/Equipment_type")
    public List<Equipment_Main> Equipment_type(@RequestParam("Equipment_type") String Equipment_type){

        List<Equipment_Main> list = this.equipmentmanageSeriver.MachinByEquipment_type(Equipment_type);
        return list;
    }


    @PostMapping("/Describ")
    public List<Equipment_Main> Describe(@RequestParam("Describ") String Describ){

        List<Equipment_Main> list = this.equipmentmanageSeriver.MachinByDescrib(Describ);
        return list;
    }

    @PostMapping("/ProductionDate")
    public List<Equipment_Main> ProductionDate(@RequestParam("ProductionDate") String ProductionDate){

        List<Equipment_Main> list = this.equipmentmanageSeriver.MachinByProductionDate(ProductionDate);
        return list;
    }


    @PostMapping("/Customer")
    public List<Equipment_Main> Customer(@RequestParam("Customer") String Customer){

        List<Equipment_Main> list = this.equipmentmanageSeriver.MachinByCustomer(Customer);
        return list;
    }


    @PostMapping("/Agency")
    public List<Equipment_Main> Agency(@RequestParam("Agency") String Agency){

        List<Equipment_Main> list = this.equipmentmanageSeriver.MachinByCustomer(Agency);
        return list;
    }
}
