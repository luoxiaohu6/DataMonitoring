package com.shiyanshi.dashuju.Util;

import com.shiyanshi.dashuju.Mapper.WebscoketMapper;
import com.shiyanshi.dashuju.Pojo.Equipment_message;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.List;

@Component
public class Util {
    @Resource
    private WebscoketMapper webscoketMapper;

    public List<Equipment_message> websocket(String Mequipment_name) {
        return webscoketMapper.websocket(Mequipment_name);
    }
}
