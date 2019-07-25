package com.shiyanshi.dashuju.Seriver.Imp;

import com.shiyanshi.dashuju.Mapper.TestUpdateMapper;
import com.shiyanshi.dashuju.Pojo.Equipment_type;
import com.shiyanshi.dashuju.Seriver.TestUpdateSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TestUpdatelmp implements TestUpdateSeriver {


    @Autowired
    private TestUpdateMapper testUpdateMapper;
    @Override
    public void Updatemessage(Equipment_type type) {
            this.testUpdateMapper.Updatemessage(type);
    }

    @Override
    public void insertmessage(Equipment_type type) {
        this.testUpdateMapper.insertmessage(type);
    }

    @Override
    public void deletemessage(Equipment_type type) {
        this.testUpdateMapper.deletemessage(type);
    }
}
