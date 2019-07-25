package com.shiyanshi.dashuju.Mapper;

import com.shiyanshi.dashuju.Pojo.Equipment_Main;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EquipmentmanageMapper {
    List<Equipment_Main> MachinfindMain();   //浏览机器管理全部信息

    List<Equipment_Main> MachinByEquipment_name(String Equipment_name);  //通过设备名称

    List<Equipment_Main> MachinByEquipment_type(String equipment_type);    //通过设备类型

    List<Equipment_Main> MachinByDescrib(String Describ);

    List<Equipment_Main> MachinByProductionDate(String ProductionDate);

    List<Equipment_Main> MachinByCustomer(String Customer);

    List<Equipment_Main> MachinByAgency(String Agency);
}
