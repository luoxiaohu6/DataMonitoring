package com.shiyanshi.dashuju.Seriver.Imp;

import com.shiyanshi.dashuju.Mapper.MachineMapper;
import com.shiyanshi.dashuju.Pojo.Equipment_Main;
import com.shiyanshi.dashuju.Pojo.Equipment_type;
import com.shiyanshi.dashuju.Seriver.MachineSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Machinelmp implements MachineSeriver {
    @Autowired
    private MachineMapper machineMapper;

    @Override
    public List<Equipment_type> MachinfindAll() {
        return this.machineMapper.MachinfindAll();
    }



    @Override
    public List<Equipment_type> MachinByid(String id) {
        return this.machineMapper.MachinByid(id);
    }

    @Override
    public List<Equipment_type> MachinByEquipmentTypeName(String id) {
        return this.machineMapper.MachinByEquipmentTypeName(id);
    }

    @Override
    public List<Equipment_type> MachinByEquipmentTypeDesc(String id) {
        return this.machineMapper.MachinByEquipmentTypeDesc(id);
    }
}
