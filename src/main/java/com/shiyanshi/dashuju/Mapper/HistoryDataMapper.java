package com.shiyanshi.dashuju.Mapper;

import com.shiyanshi.dashuju.Pojo.Equipment_message;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HistoryDataMapper {

    List<Equipment_message> findHistoryRecord(Equipment_message equipment_message);

}
