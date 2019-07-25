package com.shiyanshi.dashuju.Pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

public class Equipment_message {

    private Equipment_Main equipment_main;

    private Calculation calculation;

    private Main_Monitor main_monitor;

    private int Monitor_id;

    private int Equipment_Main_id;

    private double Vaule;

    private String Monitor_name;

    private Timestamp Time1;

    private Timestamp Time2;

    private Timestamp Time3;

    private String Mequipment_name;

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

    public double getVaule() {
        return Vaule;
    }

    public void setVaule(double vaule) {
        Vaule = vaule;
    }

    public String getMonitor_name() {
        return Monitor_name;
    }

    public void setMonitor_name(String monitor_name) {
        Monitor_name = monitor_name;
    }

    public Timestamp getTime1() {
        return Time1;
    }

    public void setTime1(Timestamp time1) {
        Time1 = time1;
    }

    public Calculation getCalculation() {
        return calculation;
    }

    public void setCalculation(Calculation calculation) {
        this.calculation = calculation;
    }

    public Main_Monitor getMain_monitor() {
        return main_monitor;
    }

    public void setMain_monitor(Main_Monitor main_monitor) {
        this.main_monitor = main_monitor;
    }

    public String getMequipment_name() {
        return Mequipment_name;
    }

    public void setMequipment_name(String mequipment_name) {
        Mequipment_name = mequipment_name;
    }

    public Timestamp getTime2() {
        return Time2;
    }

    public void setTime2(Timestamp time2) {
        Time2 = time2;
    }

    public Equipment_Main getEquipment_main() {
        return equipment_main;
    }

    public void setEquipment_main(Equipment_Main equipment_main) {
        this.equipment_main = equipment_main;
    }

    public Timestamp getTime3() {
        return Time3;
    }

    public void setTime3(Timestamp time3) {
        Time3 = time3;
    }

    @Override
    public String toString() {
        return "Equipment_message{" +
                "equipment_main=" + equipment_main +
                ", calculation=" + calculation +
                ", main_monitor=" + main_monitor +
                ", Monitor_id=" + Monitor_id +
                ", Equipment_Main_id=" + Equipment_Main_id +
                ", Vaule=" + Vaule +
                ", Monitor_name='" + Monitor_name + '\'' +
                ", Time1=" + Time1 +
                ", Time2=" + Time2 +
                ", Time3=" + Time3 +
                ", Mequipment_name='" + Mequipment_name + '\'' +
                '}';
    }
}
