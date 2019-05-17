package com.imooc.work2;

public class Duty {
    //能够描述职务编号、职务名称

    private String dutyNo;
    private String dutyName;

    public Duty(){

    }
    public Duty(String dutyName){
        this.setDutyName(dutyName);
    }
    public Duty(String dutyNo,String dutyName){
        this.setDutyNo(dutyNo);
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
