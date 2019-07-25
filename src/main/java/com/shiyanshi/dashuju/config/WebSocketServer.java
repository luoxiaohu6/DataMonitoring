package com.shiyanshi.dashuju.config;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.annotation.Resource;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import com.google.gson.Gson;
import com.shiyanshi.dashuju.Mapper.WebscoketMapper;
import com.shiyanshi.dashuju.Pojo.Equipment_message;
import com.shiyanshi.dashuju.Pojo.WebSocketPojo;
import com.shiyanshi.dashuju.Seriver.Imp.WebSocketImp;
import com.shiyanshi.dashuju.Util.Util;
import com.shiyanshi.dashuju.component.SchedulerTask;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

@ServerEndpoint(value = "/websocket/{sid}",configurator = SpringContextHelper.class)
@Component
@CrossOrigin(origins = "*",maxAge = 3600)
public class WebSocketServer {

    @Resource
    private SchedulerTask schedulerTask;

    @Resource
    private Util util ;
    @Resource
    private WebSocketPojo webSocketPojo ;

    //静态变量，用来记录当前在线连接数。应该把它设计成线程安全的。
    private static int onlineCount = 0;
    //concurrent包的线程安全Set，用来存放每个客户端对应的MyWebSocket对象。
    public static CopyOnWriteArraySet<WebSocketServer> webSocketSet = new CopyOnWriteArraySet<WebSocketServer>();

    //与某个客户端的连接会话，需要通过它来给客户端发送数据
    private Session session;

    public  CopyOnWriteArraySet<WebSocketServer> getWebSocketSet() {
        return webSocketSet;
    }
    private String an;
    //接收sid
    private String sid="";
    /**
     * 连接建立成功调用的方法
     * */
    @OnOpen
    public void onOpen(Session session,@PathParam("sid") String sid) throws IOException {
        this.session = session;
        webSocketSet.add(this);     //加入set中
        addOnlineCount();
        this.sid=sid;
        System.out.println("连接成功");
        sendMessage("连接成功");
    }

    /**
     * 连接关闭调用的方法
     */
    @OnClose
    public void onClose() {
        webSocketSet.remove(this);  //从set中删除
        subOnlineCount();           //在线数减1
    }
    /**
     * 收到客户端消息后调用的 @OnClose
     * message客户端发送过来的消息
     * */
    @OnMessage
    public void onMessage(String message,Session session) {
        an = message;
        setAn(an);
      /* SchedulerTask schedulerTask = new SchedulerTask();
       schedulerTask.process();*/
        //群发消息
//        an=message;
//            for (WebSocketServer item : webSocketSet)
//                try {
//
////                    Timestamp times = new Timestamp(System.currentTimeMillis());
////                    Date date = new Date();
////                    System.out.println(times);
//                    List<Equipment_message> websocket = util.websocket(an);
//                    String ss = new Gson().toJson(websocket);       //强转为json
//                    item.sendMessage(ss);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }


    }

    @OnError
    public void onError(Session session, Throwable error) {
//        log.error("发生错误");
        error.printStackTrace();
    }

    /**
     * 实现服务器主动推送
     */
    // 发送消息，在定时任务中会调用此方法
    public void sendMessage(String message) throws IOException {
        this.session.getBasicRemote().sendText(message);   //发送给前端
    }


    /**
     * 群发自定义消息
     * */
    public static void sendInfo(String message,@PathParam("sid") String sid) throws IOException {
        for (WebSocketServer item : webSocketSet) {
            try {
                //这里可以设定只推送给这个sid的，为null则全部推送
                if(sid==null) {
                    item.sendMessage(message);
                }else if(item.sid.equals(sid)){
                    item.sendMessage(message);
                }
            } catch (IOException e) {
                continue;
            }
        }
    }

    public static synchronized int getOnlineCount() {
        return onlineCount;
    }

    public static synchronized void addOnlineCount() {
        WebSocketServer.onlineCount++;
    }

    public static synchronized void subOnlineCount() {
        WebSocketServer.onlineCount--;
    }

    public String getAn() {
        return an;
    }

    public void setAn(String an) {
        this.an = an;
    }
}
