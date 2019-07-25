package com.shiyanshi.dashuju.Seriver;

import com.shiyanshi.dashuju.Pojo.Equipment_Main;

import java.util.List;

public interface EquipmentmanageSeriver {

    List<Equipment_Main> MachinfindMain();

    List<Equipment_Main> MachinByEquipment_name(String Equipment_name);


    List<Equipment_Main> MachinByEquipment_type(String equipment_type);


    List<Equipment_Main> MachinByDescrib(String Describ);

    List<Equipment_Main> MachinByProductionDate(String ProductionDate);   //Customer

    List<Equipment_Main> MachinByCustomer(String Customer);

    List<Equipment_Main> MachinByAgency(String Agency);



}
