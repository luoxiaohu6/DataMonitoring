package com.shiyanshi.dashuju.Pojo;

import java.sql.Timestamp;

public class Minute1 {

    private String Equipment_name_min;

    private String Monitor_name_min;

    private Timestamp Time_min;

    private Timestamp Time_min1;

    private double Vaule_min;

    public Timestamp getTime_min1() {
        return Time_min1;
    }

    public void setTime_min1(Timestamp time_min1) {
        Time_min1 = time_min1;
    }

    public String getEquipment_name_min() {
        return Equipment_name_min;
    }

    public void setEquipment_name_min(String equipment_name_min) {
        Equipment_name_min = equipment_name_min;
    }

    public String getMonitor_name_min() {
        return Monitor_name_min;
    }

    public void setMonitor_name_min(String monitor_name_min) {
        Monitor_name_min = monitor_name_min;
    }

    public Timestamp getTime_min() {
        return Time_min;
    }

    public void setTime_min(Timestamp time_min) {
        Time_min = time_min;
    }

    public double getVaule_min() {
        return Vaule_min;
    }

    public void setVaule_min(double vaule_min) {
        Vaule_min = vaule_min;
    }
}
