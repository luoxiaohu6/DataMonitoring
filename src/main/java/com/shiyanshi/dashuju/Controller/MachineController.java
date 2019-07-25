package com.shiyanshi.dashuju.Controller;


import com.shiyanshi.dashuju.Pojo.Equipment_type;
import com.shiyanshi.dashuju.Seriver.MachineSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class MachineController {


    @Autowired
    private MachineSeriver machineSeriver;

    @RequestMapping(value = "/select2")
    public List<Equipment_type> list()
    {
        List<Equipment_type>list=this.machineSeriver.MachinfindAll();
        return list;
    }



    @PostMapping("/idEquipmentType")
    public List<Equipment_type> idEquipmentType(@RequestParam("idEquipmentType") String idEquipmentType){

        List<Equipment_type> list = this.machineSeriver.MachinByid(idEquipmentType);
        return list;
    }

    @PostMapping("/EquipmentTypeName")
    public List<Equipment_type> EquipmentTypeName(@RequestParam("EquipmentTypeName") String EquipmentTypeName){

        List<Equipment_type> list = this.machineSeriver.MachinByEquipmentTypeName(EquipmentTypeName);
        return list;
    }

    @PostMapping("/EquipmentTypeDesc")
    public List<Equipment_type> EquipmentTypeDesc(@RequestParam("EquipmentTypeDesc") String EquipmentTypeDesc){

        List<Equipment_type> list = this.machineSeriver.MachinByEquipmentTypeDesc(EquipmentTypeDesc);
        return list;
    }

}
