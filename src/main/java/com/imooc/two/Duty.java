package com.imooc.two;

public class Duty {
    //能够描述职务编号、职务名称

    private String dutyNo;
    private String dutyName;

    public Duty(){

    }
    public Duty(String dutyName){
        this.setDutyName(dutyName);
    }

    public String getDutyNo() {
        return dutyNo;
    }

    public void setDutyNo(String dutyNo) {
        this.dutyNo = dutyNo;
    }

    public String getDutyName() {
        return dutyName;
    }

    public void setDutyName(String dutyName) {
        this.dutyName = dutyName;
    }
}
