package com.shiyanshi.dashuju.Mapper;

import com.shiyanshi.dashuju.Pojo.Equipment_message;
import com.shiyanshi.dashuju.Pojo.Equipment_type;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface TestUpdateMapper {

 void Updatemessage(Equipment_type type);   //更新信息

 void insertmessage(Equipment_type type);   //增加信息

 void deletemessage(Equipment_type type);

}
