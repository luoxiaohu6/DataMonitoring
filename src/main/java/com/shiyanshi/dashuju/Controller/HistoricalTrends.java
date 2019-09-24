package com.shiyanshi.dashuju.Controller;

import com.shiyanshi.dashuju.Pojo.Equipment_message;
import com.shiyanshi.dashuju.Seriver.HistorySeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class  HistoricalTrends {

    @Autowired
    private HistorySeriver historySeriver;

    @PostMapping("/historyTH")
    public List<Equipment_message> historyTH (@RequestBody Equipment_message equipment_message){
        return this.historySeriver.findHistoryRecord(equipment_message);
    }

    @PostMapping("/historyTM")
    public List<Equipment_message> historyTM (@RequestBody Equipment_message equipment_message){
        return this.historySeriver.findHistoryRecord(equipment_message);
    }

    @PostMapping("/historyTS")
    public List<Equipment_message> historyTS (@RequestBody Equipment_message equipment_message){
        return this.historySeriver.findHistoryRecord(equipment_message);
    }
}
