package com.shiyanshi.dashuju.Pojo;

public class HAndMM {

    private int Equipment_Main_id;

    private int Monitor_id;

    public int getEquipment_Main_id() {
        return Equipment_Main_id;
    }

    public void setEquipment_Main_id(int equipment_Main_id) {
        Equipment_Main_id = equipment_Main_id;
    }

    public int getMonitor_id() {
        return Monitor_id;
    }

    public void setMonitor_id(int monitor_id) {
        Monitor_id = monitor_id;
    }

    @Override
    public String toString() {
        return "HAndM{" +
                "Equipment_Main_id=" + Equipment_Main_id +
                ", Monitor_id=" + Monitor_id +
                '}';
    }

}
