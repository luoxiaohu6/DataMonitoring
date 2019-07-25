package com.shiyanshi.dashuju.Controller;


import com.shiyanshi.dashuju.Pojo.Equipment_message;
import com.shiyanshi.dashuju.Seriver.HistorySeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",maxAge = 3600)
public class DataAnalysisHistoricalController {

    @Autowired
    private HistorySeriver historySeriver;

   @PostMapping("/history")
    public List<Equipment_message> history (@RequestBody Equipment_message equipment_message){
        return this.historySeriver.findHistoryRecord(equipment_message);

    }

}
