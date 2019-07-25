package com.shiyanshi.dashuju.Seriver.Imp;

import com.shiyanshi.dashuju.Mapper.MachineUpdateMapper;
import com.shiyanshi.dashuju.Pojo.Equipment_Main;
import com.shiyanshi.dashuju.Seriver.MachineUpdateSerive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MachineUpdatelmp implements MachineUpdateSerive {
    @Autowired
    private MachineUpdateMapper machineUpdateMapper;


    @Override
    public void UpdateMain(Equipment_Main main) {
        this.machineUpdateMapper.UpdateMain(main);
    }

    @Override
    public void insertMain(Equipment_Main main) {
    this.machineUpdateMapper.insertMain(main);
    }

    @Override
    public void deleteMain(Equipment_Main main) {
     this.machineUpdateMapper.deleteMain(main);
    }
}
