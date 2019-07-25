package com.shiyanshi.dashuju.Seriver.Imp;


import com.shiyanshi.dashuju.Mapper.HistoryDataMapper;
import com.shiyanshi.dashuju.Pojo.Equipment_message;
import com.shiyanshi.dashuju.Seriver.HistorySeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorySeriverImp implements HistorySeriver {

    @Autowired
    private HistoryDataMapper historyDataMapper;


    @Override
    public List<Equipment_message> findHistoryRecord(Equipment_message equipment_message) {
        return this.historyDataMapper.findHistoryRecord(equipment_message);
    }
}
