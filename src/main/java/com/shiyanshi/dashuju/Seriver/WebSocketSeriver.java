package com.shiyanshi.dashuju.Seriver;

import com.shiyanshi.dashuju.Pojo.Equipment_message;
import com.shiyanshi.dashuju.Pojo.WebSocketPojo;

import java.sql.Timestamp;
import java.util.List;

public interface WebSocketSeriver {

   List<Equipment_message> websocket(String Mequipment_name);

}
