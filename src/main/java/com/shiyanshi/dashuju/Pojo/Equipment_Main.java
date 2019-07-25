package com.shiyanshi.dashuju.Pojo;

import java.sql.Timestamp;

public class Equipment_Main {

    private int Idm;                //机器编号

    private Timestamp ProductionDate;

    private String Equipment_name;  //机器名称

    private String Describ;

    private String Customer;

    private String Agency;

    private String Equipment_type;

    public String getEquipment_name() {

        return Equipment_name;
    }

    public void setEquipment_name(String equipment_name) {
        Equipment_name = equipment_name;
    }

    public int getIdm() {
        return Idm;
    }

    public void setIdm(int idm) {
        Idm = idm;
    }

    public Timestamp getProductionDate() {
        return ProductionDate;
    }

    public void setProductionDate(Timestamp productionDate) {
        ProductionDate = productionDate;
    }

    public String getDescrib() {
        return Describ;
    }

    public void setDescrib(String describ) {
        Describ = describ;
    }

    public String getCustomer() {
        return Customer;
    }

    public void setCustomer(String customer) {
        Customer = customer;
    }

    public String getAgency() {
        return Agency;
    }

    public void setAgency(String agency) {
        Agency = agency;
    }

    public String getEquipment_type() {
        return Equipment_type;
    }

    public void setEquipment_type(String equipment_type) {
        Equipment_type = equipment_type;
    }
}
