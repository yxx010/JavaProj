package com.imooc.two;

import com.imooc.two.Department;
import com.imooc.two.Duty;

public class Staff {
    //需求要求：
    //能够描述员工姓名、工号、年龄、性别、所属部门、职务信息；
    //设定方法来约束年龄的范围；
    //设定方法来限定性别的选择；
    //设定方法，实现员工自我介绍信息，将员工信息作为字符串返回
    private String staffName;
    private String staffNo;
    private int staffAge;
    private String staffSex;
    private Department department;
    private Duty duty;

    public Staff(){

    }
    public Staff(String staffName,String staffNo,String staffSex,int staffAge,Department department,Duty duty){
        this.setStaffName(staffName);
        this.setStaffNo(staffNo);
        this.setStaffSex(staffSex);
        this.setStaffAge(staffAge);
        this.setDepartment(department);
        this.setDuty(duty);
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffNo() {
        return staffNo;
    }

    public void setStaffNo(String staffNo) {
        this.staffNo = staffNo;
    }

    public int getStaffAge() {
        return staffAge;
    }

    public void setStaffAge(int staffAge) {
        if(staffAge>=18&&staffAge<=60)
        this.staffAge = staffAge;
        else
            this.staffAge=18;
    }

    public String getStaffSex() {
        return staffSex;
    }

    public void setStaffSex(String staffSex) {
        if(staffSex.equals("男")||staffSex.equals("女"))
        this.staffSex = staffSex;
        else
            this.staffSex="男";
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Duty getDuty() {
        return duty;
    }

    public void setDuty(Duty duty) {
        this.duty = duty;
    }
    public String staffInfo(){
        String str="姓名："+this.getStaffName()+"\n工号："+this.getStaffNo()+"\n性别："
                +this.getStaffSex()+"\n年龄："+this.getStaffAge()+"\n职务："
                +this.getDepartment().getDepartmentName()+this.getDuty().getDutyName();
        return str;
    }
}
