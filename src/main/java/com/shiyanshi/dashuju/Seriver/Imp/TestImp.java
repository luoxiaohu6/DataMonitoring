package com.shiyanshi.dashuju.Seriver.Imp;

import com.shiyanshi.dashuju.Mapper.TestMapper;
import com.shiyanshi.dashuju.Pojo.Equipment_message;
import com.shiyanshi.dashuju.Seriver.TestSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TestImp implements TestSeriver {

    @Autowired
    private TestMapper testMapper;

    @Override
    public List<Equipment_message> findAll() {
        return this.testMapper.findAll();
    }

    @Override
    public List<Equipment_message> SelectByEquipmentMessage(String equipmentName) {

        return this.testMapper.SelectByEquipmentMessage(equipmentName);
    }

    @Override
    public List<Equipment_message> SelectByDNS(String gateway) {
        return this.testMapper.SelectByDNS(gateway);
    }

    @Override
    public List<Equipment_message> SelectByMaxValue(double maxValue) {
        return this.testMapper.SelectByMaxValue(maxValue);
    }

    @Override
    public List<Equipment_message> SelectByID(int id) {
        return this.testMapper.SelectByID(id);
    }

    @Override
    public List<Equipment_message> SelectByAccess(String AccessName) {
        return this.testMapper.SelectByAccess(AccessName);
    }

    @Override
    public List<Equipment_message> SelectByMonitorName(String MonitorName) {
        return this.testMapper.SelectByMonitorName(MonitorName);
    }

    @Override
    public List<Equipment_message> SelectByFormula(int Formula) {
        return this.testMapper.SelectByFormula(Formula);
    }

    @Override
    public List<Equipment_message> SelectByStandardValue(double StandardValue) {
        return this.testMapper.SelectByStandardValue(StandardValue);
    }

    @Override
    public List<Equipment_message> SelectByMinValue(double minValue) {
        return this.testMapper.SelectByMinValue(minValue);
    }

}
