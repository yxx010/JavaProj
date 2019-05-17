package com.imooc.work2;

public class Department {
    //能够描述部门编号、部门名称、获取所有该部门员工信息;
    //设定方法，完成统计该部门员工个数的功能
    private String departmentNo;
    private String departmentName;
    private Staff[] staffs;
    private int staffNum;

    public Department(){

    }
    public Department(String departmentName){
        this.setDepartmentName(departmentName);
    }
    public Department(String departmentNo,String departmentName){
        this.setDepartmentNo(departmentNo);
        this.setDepartmentName(departmentName);
    }


    public String getDepartmentNo() {
        return departmentNo;
    }

    public void setDepartmentNo(String departmentNo) {
        this.departmentNo = departmentNo;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Staff[] getStaffs() {
        if(this.staffs==null)
            this.staffs=new Staff[200];
            return staffs;
    }

    public void setStaffs(Staff[] staffs) {
        this.staffs = staffs;
    }

    public int getStaffNum() {
        return staffNum;
    }

    public void setStaffNum(int staffNum) {
        this.staffNum = staffNum;
    }

    /**
     * 将员工信息加到部门中
     * 统计部门中的人数
     * @param staff
     */
    public void addStaffs(Staff staff){
        for (int i=0;i<this.getStaffs().length;i++){
            if(this.getStaffs()[i]==null){
                this.getStaffs()[i]=staff;
                this.setStaffNum(i+1);
                return;
            }
        }
    }
}
