package com.shiyanshi.dashuju.Mapper;

import com.shiyanshi.dashuju.Pojo.Equipment_Main;
import com.shiyanshi.dashuju.Pojo.Equipment_type;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MachineMapper {

    List<Equipment_type> MachinfindAll();    //全部type中信息浏览

    List<Equipment_type> MachinByid(String id);       //通过类型编号


    List<Equipment_type> MachinByEquipmentTypeName(String id);    //通过设备类型

    List<Equipment_type> MachinByEquipmentTypeDesc(String id);    //通过描述
}
