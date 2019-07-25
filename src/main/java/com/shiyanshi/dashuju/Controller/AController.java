//package com.shiyanshi.dashuju.Controller;
//
//
//import com.shiyanshi.dashuju.Pojo.Equipment_message;
//import com.shiyanshi.dashuju.Seriver.WebSocketSeriver;
//import com.shiyanshi.dashuju.config.WebSocketServer;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class AController {
//
//
//
//    @Autowired
//    private WebSocketSeriver  webSocketSeriver;
//
//
//    @RequestMapping("/hello")
//
//    public List<Equipment_message> list( String Mequipment_name)
//    {
//        List<Equipment_message> list=webSocketSeriver.websocket(Mequipment_name);
//        return list;
//    }
//}
