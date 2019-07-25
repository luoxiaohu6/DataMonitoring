package com.shiyanshi.dashuju.Pojo;

import java.sql.Timestamp;

public class Equipment_messageSS {

    private int Monitor_id;

    private int Equipment_Main_id;

    private Timestamp Time1;

    public int getMonitor_id() {
        return Monitor_id;
    }

    public void setMonitor_id(int monitor_id) {
        Monitor_id = monitor_id;
    }

    public int getEquipment_Main_id() {
        return Equipment_Main_id;
    }

    public void setEquipment_Main_id(int equipment_Main_id) {
        Equipment_Main_id = equipment_Main_id;
    }

    public Timestamp getTime1() {
        return Time1;
    }

    public void setTime1(Timestamp time1) {
        Time1 = time1;
    }
}
