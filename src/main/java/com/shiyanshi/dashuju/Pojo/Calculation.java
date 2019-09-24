package com.shiyanshi.dashuju.Pojo;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class Calculation implements Serializable {

    private int idnum;

//    @JsonProperty(value = "gateway")
    private String Gateway;

//    @JsonProperty(value = "access_name")
    private String Access_name;

//    @JsonProperty(value = "maxValue1")
    private double MaxValue1;

//    @JsonProperty(value = "minValue")
    private double MinValue;

//    @JsonProperty(value = "standardValue")
    private double StandardValue;

//    @JsonProperty(value = "formula")
    private int Formula;

//    @JsonProperty(value = "em_Equipment_name")
    private String Em_Equipment_name;

    private int Em_Equipment_name_id;

//    @JsonProperty(value = "em_Monitor_name")
    private String Em_Monitor_name;

    private int Em_Monitor_id;

    public int getIdnum() {
        return idnum;
    }

    public void setIdnum(int idnum) {
        this.idnum = idnum;
    }

    public String getGateway() {
        return Gateway;
    }

    public void setGateway(String gateway) {
        Gateway = gateway;
    }

    public String getAccess_name() {
        return Access_name;
    }

    public void setAccess_name(String access_name) {
        Access_name = access_name;
    }

    public double getMaxValue1() {
        return MaxValue1;
    }

    public void setMaxValue1(double maxValue1) {
        MaxValue1 = maxValue1;
    }

    public double getStandardValue() {
        return StandardValue;
    }

    public void setStandardValue(double standardValue) {
        StandardValue = standardValue;
    }

    public int getFormula() {
        return Formula;
    }

    public void setFormula(int formula) {
        Formula = formula;
    }

    public String getEm_Equipment_name() {
        return Em_Equipment_name;
    }

    public void setEm_Equipment_name(String em_Equipment_name) {
        Em_Equipment_name = em_Equipment_name;
    }

    public int getEm_Equipment_name_id() {
        return Em_Equipment_name_id;
    }

    public void setEm_Equipment_name_id(int em_Equipment_name_id) {
        Em_Equipment_name_id = em_Equipment_name_id;
    }

    public String getEm_Monitor_name() {
        return Em_Monitor_name;
    }

    public void setEm_Monitor_name(String em_Monitor_name) {
        Em_Monitor_name = em_Monitor_name;
    }

    public int getEm_Monitor_id() {
        return Em_Monitor_id;
    }

    public void setEm_Monitor_id(int em_Monitor_id) {
        Em_Monitor_id = em_Monitor_id;
    }

    public double getMinValue() {
        return MinValue;
    }

    public void setMinValue(double minValue) {
        MinValue = minValue;
    }

    @Override
    public String toString() {
        return "Calculation{" +
                "Gateway='" + Gateway + '\'' +
                ", Access_name='" + Access_name + '\'' +
                ", MaxValue1=" + MaxValue1 +
                ", MinValue=" + MinValue +
                ", StandardValue=" + StandardValue +
                ", Formula=" + Formula +
                ", Em_Equipment_name='" + Em_Equipment_name + '\'' +
                ", Em_Equipment_name_id=" + Em_Equipment_name_id +
                ", Em_Monitor_name='" + Em_Monitor_name + '\'' +
                ", Em_Monitor_id=" + Em_Monitor_id +
                '}';
    }
}
