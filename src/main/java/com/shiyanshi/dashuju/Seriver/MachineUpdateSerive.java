package com.shiyanshi.dashuju.Seriver;

import com.shiyanshi.dashuju.Pojo.Equipment_Main;

public interface MachineUpdateSerive {

    void UpdateMain(Equipment_Main main);   //更新信息

    void insertMain(Equipment_Main main);   //增加信息

    void deleteMain(Equipment_Main main);  //删除信息
}
