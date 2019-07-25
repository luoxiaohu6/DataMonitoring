package com.shiyanshi.dashuju.Mapper;

import com.shiyanshi.dashuju.Pojo.Main_Monitor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MonitorMainMapper {

   int InsertMonitor(Main_Monitor main_monitor);
}
