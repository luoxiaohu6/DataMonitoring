package com.shiyanshi.dashuju.Pojo;

import org.springframework.stereotype.Component;

@Component
public class WebSocketPojo {

    private double vaule;

    private String Monitor_name;

    private String Mequipment_name;

    public String getMequipment_name() {
        return Mequipment_name;
    }

    public void setMequipment_name(String mequipment_name) {
        Mequipment_name = mequipment_name;
    }

    public double getVaule() {
        return vaule;
    }

    public void setVaule(double vaule) {
        this.vaule = vaule;
    }

    public String getMonitor_name() {
        return Monitor_name;
    }

    public void setMonitor_name(String monitor_name) {
        Monitor_name = monitor_name;
    }

    @Override
    public String toString() {
        return "WebSocketPojo{" +
                "vaule=" + vaule +
                ", Monitor_name='" + Monitor_name + '\'' +
                ", Mequipment_name='" + Mequipment_name + '\'' +
                '}';
    }
}
