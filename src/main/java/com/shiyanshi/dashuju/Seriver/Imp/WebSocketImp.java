package com.shiyanshi.dashuju.Seriver.Imp;

import com.shiyanshi.dashuju.Mapper.WebscoketMapper;
import com.shiyanshi.dashuju.Pojo.Equipment_message;
import com.shiyanshi.dashuju.Pojo.WebSocketPojo;
import com.shiyanshi.dashuju.Seriver.WebSocketSeriver;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Service
public class WebSocketImp implements WebSocketSeriver {

    @Resource
    private WebscoketMapper webscoketMapper;


    @Override
    public List<Equipment_message> websocket(String Mequipment_name) {
        return webscoketMapper.websocket(Mequipment_name);
    }
}
