package com.shiyanshi.dashuju.Mapper;

import com.shiyanshi.dashuju.Pojo.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HAndMMapper {

    List<HAndM> findId();

    List<Equipment_messageH> findMax(HAndM hAndM);

    int InsertHour(Equipment_messageH equipment_messageH);

    List<HAndMM> findIdM();

    List<Equipment_messageM> findMaxM(HAndMM hAndMM);

    int InsertMinute(Equipment_messageM equipment_messageM);

    Equipment_messageS findOne(HAndM hAndM);

    Equipment_messageSS findOneM(HAndMM hAndMM);
}
