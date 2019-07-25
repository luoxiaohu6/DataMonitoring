package com.shiyanshi.dashuju.Controller;


import com.shiyanshi.dashuju.Pojo.Equipment_Main;
import com.shiyanshi.dashuju.Seriver.MachineUpdateSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class MachineUpdateController {



    @Autowired
    private MachineUpdateSerive machineUpdateSerive;

/*这有问题*/
    @RequestMapping(value ="/genggai",method = RequestMethod.POST)
    public void update(Equipment_Main equipment_main)
    {
//        System.out.println(equipment_main);
        this.machineUpdateSerive.UpdateMain(equipment_main);
    }




    @RequestMapping(value = "/inserttwo",method = RequestMethod.POST)

    public void insert(Equipment_Main equipment_main)
    {

        this.machineUpdateSerive.insertMain(equipment_main);
    }


    @RequestMapping(value = "/deletetwo",method = RequestMethod.POST)

    public void delete(Equipment_Main equipment_main)
    {
        this.machineUpdateSerive.deleteMain(equipment_main);
    }
}
