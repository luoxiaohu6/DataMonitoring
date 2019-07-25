//package com.shiyanshi.dashuju.Controller;
//
//import com.shiyanshi.dashuju.Pojo.WebSocketPojo;
//import com.shiyanshi.dashuju.Seriver.WebSocketSeriver;
//import com.shiyanshi.dashuju.component.SchedulerTask;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class WebSocketController {
//
//    @Autowired
//    private WebSocketSeriver webSocketSeriver;
//
//    @RequestMapping("/websocket")
//    public WebSocketPojo websocket(@RequestParam("Mequipment_name") String Mequipment_name){
//
////      WebSocketPojo webSocketPojo = webSocketSeriver.websocket(Mequipment_name);
//        SchedulerTask schedulerTask = new SchedulerTask();
//
//        return  schedulerTask.process(Mequipment_name);
//    }
//
//
//
//}
