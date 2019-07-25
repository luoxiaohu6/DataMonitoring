package com.shiyanshi.dashuju.Seriver;


import com.shiyanshi.dashuju.Pojo.Equipment_message;

import java.util.List;

public interface HistorySeriver {

    List<Equipment_message> findHistoryRecord(Equipment_message equipment_message);

}
