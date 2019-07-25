package com.shiyanshi.dashuju.Pojo;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
public class Hour1 {

    private String Equipment_name_hour;

    private String Monitor_name_hour;

    private Timestamp Time_hour;

    private Timestamp Time_hour1;

    private double Vaule_hour;

    public Timestamp getTime_hour1() {
        return Time_hour1;
    }

    public void setTime_hour1(Timestamp time_hour1) {
        Time_hour1 = time_hour1;
    }

    public String getEquipment_name_hour() {
        return Equipment_name_hour;
    }

    public void setEquipment_name_hour(String equipment_name_hour) {
        Equipment_name_hour = equipment_name_hour;
    }

    public String getMonitor_name_hour() {
        return Monitor_name_hour;
    }

    public void setMonitor_name_hour(String monitor_name_hour) {
        Monitor_name_hour = monitor_name_hour;
    }

    public Timestamp getTime_hour() {
        return Time_hour;
    }

    public void setTime_hour(Timestamp time_hour) {
        Time_hour = time_hour;
    }

    public double getVaule_hour() {
        return Vaule_hour;
    }

    public void setVaule_hour(double vaule_hour) {
        Vaule_hour = vaule_hour;
    }
}
