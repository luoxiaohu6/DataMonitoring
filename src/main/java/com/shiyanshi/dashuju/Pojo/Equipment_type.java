package com.shiyanshi.dashuju.Pojo;

public class Equipment_type {

private String idEquipmentType;

private String EquipmentTypeName;

private String EquipmentTypeDesc;

private Equipment_Main equipment_main;


public Equipment_type(String idEquipmentType, String equipmentTypeName, String equipmentTypeDesc, Equipment_Main equipment_main) {
        this.idEquipmentType = idEquipmentType;
        EquipmentTypeName = equipmentTypeName;
        EquipmentTypeDesc = equipmentTypeDesc;
        this.equipment_main = equipment_main;
}

    public Equipment_type() {
    }


    public String getIdEquipmentType() {
        return idEquipmentType;
    }

    public void setIdEquipmentType(String idEquipmentType) {
        this.idEquipmentType = idEquipmentType;
    }

    public String getEquipmentTypeName() {
        return EquipmentTypeName;
    }

    public void setEquipmentTypeName(String equipmentTypeName) {
        EquipmentTypeName = equipmentTypeName;
    }

    public String getEquipmentTypeDesc() {
        return EquipmentTypeDesc;
    }

    public void setEquipmentTypeDesc(String equipmentTypeDesc) {
        EquipmentTypeDesc = equipmentTypeDesc;
    }

    public Equipment_Main getEquipment_main() {
        return equipment_main;
    }

    public void setEquipment_main(Equipment_Main equipment_main) {
        this.equipment_main = equipment_main;
    }

    @Override
    public String toString() {
        return "Equipment_type{" +
                "idEquipmentType='" + idEquipmentType + '\'' +
                ", EquipmentTypeName='" + EquipmentTypeName + '\'' +
                ", EquipmentTypeDesc='" + EquipmentTypeDesc + '\'' +
                ", equipment_main=" + equipment_main +
                '}';
    }
}
