package com.shiyanshi.dashuju.Seriver;

import com.shiyanshi.dashuju.Pojo.Equipment_Main;
import com.shiyanshi.dashuju.Pojo.Equipment_type;

import java.util.List;

public interface MachineSeriver {
    List<Equipment_type> MachinfindAll();

    List<Equipment_type> MachinByid(String id);

    List<Equipment_type> MachinByEquipmentTypeName(String id);

    List<Equipment_type> MachinByEquipmentTypeDesc(String id);
}
