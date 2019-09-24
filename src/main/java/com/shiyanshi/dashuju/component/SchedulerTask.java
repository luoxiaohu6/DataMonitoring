package com.shiyanshi.dashuju.component;

import com.google.gson.Gson;
import com.shiyanshi.dashuju.Mapper.HAndMMapper;
import com.shiyanshi.dashuju.Mapper.WebscoketMapper;
import com.shiyanshi.dashuju.Pojo.*;
import com.shiyanshi.dashuju.Util.Util;
import com.shiyanshi.dashuju.config.WebSocketServer;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.swing.plaf.synth.SynthEditorPaneUI;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;


@Component
public class SchedulerTask {

//    @Resource
//    private Equipment_message equipment_message;
    @Resource
    private WebscoketMapper webscoketMapper;
    @Resource
    private Util util ;
    @Resource
    private WebSocketServer webSocketServer;
    @Resource
    private HAndMMapper hAndMMapper;

    @Scheduled(fixedRate = 1000)
    public void process(){
        CopyOnWriteArraySet<WebSocketServer> webSocketSet =webSocketServer.getWebSocketSet();

        for (WebSocketServer item : webSocketSet)
                try {
                    List<Equipment_message> websocket = util.websocket(webSocketServer.getAn());

                    String ss = new Gson().toJson(websocket);       //强转为json
                    item.sendMessage(ss);

                } catch (IOException e) {
                    e.printStackTrace();
                }
    }

    /**
     * 定时对数据库中的数据进行取极大值
     */
    @Scheduled(fixedRate = 20*60*1000 )
//    @Scheduled(fixedRate = 10000)
    public void hour(){
            List<HAndM> list = hAndMMapper.findId();
        if(list!=null){
            for (int i = 0; i < list.size(); i++) {
                HAndM hAndM = list.get(i);              //将list中的值转化为具体的实体类对象
                Equipment_messageS equipment_messageS = hAndMMapper.findOne(hAndM);

                Timestamp mysqlTime = equipment_messageS.getTime1();            //数据库存储时间

                //处理时间格式
                SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date = new Date();
                Timestamp LocalTime = Timestamp.valueOf(f.format(date));       //本地时间


                if (!(mysqlTime.before(LocalTime))&&!(mysqlTime.after(LocalTime))) {
                    List<Equipment_messageH> equipment_messagesH = hAndMMapper.findMax(hAndM);
                    Equipment_messageH equipment_messageH = equipment_messagesH.get(0);
                    hAndMMapper.InsertHour(equipment_messageH);
                } else {
                    System.out.println("数据库错误!");
                }
            }
        }
    }

    @Scheduled(fixedRate = 1*60*10000)
//    @Scheduled(fixedRate = 5000)
    public void minute(){
        List<HAndMM> list = hAndMMapper.findIdM();
        if(list!=null) {
            for (int i = 0; i < list.size(); i++) {
                HAndMM hAndMM = list.get(i);              //将list中的值转化为具体的实体类对象
                Equipment_messageSS equipment_messageSS = hAndMMapper.findOneM(hAndMM);

                Timestamp mysqlTime1 = equipment_messageSS.getTime1();            //数据库存储时间

                //处理时间格式
                SimpleDateFormat f1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                Date date1 = new Date();
                Timestamp LocalTime1 = Timestamp.valueOf(f1.format(date1));       //本地时间

                if(!(mysqlTime1.before(LocalTime1))&&!(mysqlTime1.after(LocalTime1))) {
                    List<Equipment_messageM> equipment_messagesM = hAndMMapper.findMaxM(hAndMM);
                    Equipment_messageM equipment_messageM = equipment_messagesM.get(0);
                    hAndMMapper.InsertMinute(equipment_messageM);
                }else{
                    System.out.println("数据库错误!");
                }
            }
        }
    }
}

