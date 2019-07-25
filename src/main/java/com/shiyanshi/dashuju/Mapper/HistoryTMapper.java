package com.shiyanshi.dashuju.Mapper;

import com.shiyanshi.dashuju.Pojo.Equipment_message;
import com.shiyanshi.dashuju.Pojo.Hour1;
import com.shiyanshi.dashuju.Pojo.Minute1;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HistoryTMapper {

    List<Hour1> findHistoryHour(Hour1 hour1);

    List<Minute1> findHistoryMinute(Minute1 minute1);

    List<Equipment_message> findHistoryS(Equipment_message equipment_message);

}
