package com.shiyanshi.dashuju.Mapper;

import com.shiyanshi.dashuju.Pojo.Equipment_Main;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface MachineUpdateMapper {
    void UpdateMain(Equipment_Main main);   //更新信息

    void insertMain(Equipment_Main main);   //增加信息

    void deleteMain(Equipment_Main main);  //删除信息


}
