package com.shiyanshi.dashuju.Seriver.Imp;

import com.shiyanshi.dashuju.Mapper.TestMapper;
import com.shiyanshi.dashuju.Pojo.Equipment_message;
import com.shiyanshi.dashuju.Seriver.TestSeriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TestImp implements TestSeriver {

    @Autowired
    private TestMapper testMapper;

//    注入springboot自动配置好的RedisTeplate
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;

//    @Override
//    public List<Equipment_message> findAll() {
//        return this.testMapper.findAll();
//    }
    @Override
    public List<Equipment_message> findAll() {

//        字符串的序列化
        RedisSerializer redisSerializer = new StringRedisSerializer();
        redisTemplate.setKeySerializer(redisSerializer);

        //查询缓存
        List<Equipment_message> equipment_messages = (List<Equipment_message>) redisTemplate.opsForValue().get("all");

        //双重检测解决高并发问题
        if(null == equipment_messages){

            synchronized (this){
                equipment_messages = (List<Equipment_message>) redisTemplate.opsForValue().get("all");
                if(null == equipment_messages) {
                    //缓存为空
                    equipment_messages = testMapper.findAll();
                    redisTemplate.opsForValue().set("all", equipment_messages);
                }

            }

        }
        return equipment_messages;
    }


    @Override
    public List<Equipment_message> SelectByEquipmentMessage(String equipmentName) {

        return this.testMapper.SelectByEquipmentMessage(equipmentName);
    }

    @Override
    public List<Equipment_message> SelectByDNS(String gateway) {
        return this.testMapper.SelectByDNS(gateway);
    }

    @Override
    public List<Equipment_message> SelectByMaxValue(double maxValue) {
        return this.testMapper.SelectByMaxValue(maxValue);
    }

    @Override
    public List<Equipment_message> SelectByID(int id) {
        return this.testMapper.SelectByID(id);
    }

    @Override
    public List<Equipment_message> SelectByAccess(String AccessName) {
        return this.testMapper.SelectByAccess(AccessName);
    }

    @Override
    public List<Equipment_message> SelectByMonitorName(String MonitorName) {
        return this.testMapper.SelectByMonitorName(MonitorName);
    }

    @Override
    public List<Equipment_message> SelectByFormula(int Formula) {
        return this.testMapper.SelectByFormula(Formula);
    }

    @Override
    public List<Equipment_message> SelectByStandardValue(double StandardValue) {
        return this.testMapper.SelectByStandardValue(StandardValue);
    }

    @Override
    public List<Equipment_message> SelectByMinValue(double minValue) {
        return this.testMapper.SelectByMinValue(minValue);
    }

}
