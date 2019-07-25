package com.shiyanshi.dashuju.Mapper;

import com.shiyanshi.dashuju.Pojo.Equipment_message;

import java.sql.Timestamp;
import java.util.List;


public interface WebscoketMapper {

   List <Equipment_message> websocket(String Mequipment_name);

}
