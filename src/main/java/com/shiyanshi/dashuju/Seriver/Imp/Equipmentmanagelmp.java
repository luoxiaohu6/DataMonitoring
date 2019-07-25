package com.shiyanshi.dashuju.Seriver.Imp;

import com.shiyanshi.dashuju.Mapper.EquipmentmanageMapper;
import com.shiyanshi.dashuju.Pojo.Equipment_Main;
import com.shiyanshi.dashuju.Seriver.EquipmentmanageSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Equipmentmanagelmp implements EquipmentmanageSeriver {

@Autowired
   private EquipmentmanageMapper equipmentmanageMapper;
    @Override
    public List<Equipment_Main> MachinfindMain() {
        return this.equipmentmanageMapper.MachinfindMain();
    }

    @Override
    public List<Equipment_Main> MachinByEquipment_name(String Equipment_name) {
        return this.equipmentmanageMapper.MachinByEquipment_name(Equipment_name);
    }

    @Override
    public List<Equipment_Main> MachinByEquipment_type(String equipment_type) {
        return this.equipmentmanageMapper.MachinByEquipment_type(equipment_type);
    }

    @Override
    public List<Equipment_Main> MachinByDescrib(String Describe) {
        return this.equipmentmanageMapper.MachinByDescrib(Describe);
    }

    @Override
    public List<Equipment_Main> MachinByProductionDate(String ProductionDate) {
        return this.equipmentmanageMapper.MachinByProductionDate(ProductionDate);
    }

    @Override
    public List<Equipment_Main> MachinByCustomer(String Customer) {
        return this.equipmentmanageMapper.MachinByCustomer(Customer);
    }

    @Override
    public List<Equipment_Main> MachinByAgency(String Agency) {
        return this.equipmentmanageMapper.MachinByAgency(Agency);
    }
}
