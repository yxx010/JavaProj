package com.imooc.work2;

public class CompanyTest {
    public static void main(String[] args) {

        Department d1=new Department("D001","人事部");
        Department d2=new Department("D002","市场部");

        Duty duty1=new Duty("T3","经理");
        Duty duty2=new Duty("T2","助理");
        Duty duty3=new Duty("T1","职员");

        Staff staff1=new Staff("张铭","S001","男",29,d1,duty1);
        Staff staff2=new Staff("张艾爱","S002","女",21,d1,duty2);
        Staff staff3=new Staff("孙超","S004","男",29,d1,duty3);
        Staff staff4=new Staff("张美美","S005","女",26,d2,duty3);
        Staff staff5=new Staff("蓝迪","S006","男",37,d2,duty1);
        Staff staff6=new Staff("米莉","S007","女",24,d2,duty3);
        //加人事部员工
        d1.addStaffs(staff1);
        d1.addStaffs(staff2);
        d1.addStaffs(staff3);
        //加市场部员工
        d2.addStaffs(staff4);
        d2.addStaffs(staff5);
        d2.addStaffs(staff6);
        //展示人事部员工信息
        for (int i=0;i<d1.getStaffNum();i++){
            System.out.println(d1.getStaffs()[i].staffInfo());
            System.out.println("================");

        }
        //展示市场部员工信息
        for (int i=0;i<d2.getStaffNum();i++){
            System.out.println(d2.getStaffs()[i].staffInfo());
            System.out.println("================");

        }
        //展示人事部、市场部员工人数
        System.out.println(d1.getDepartmentName()+"总共有"+d1.getStaffNum()+"名员工");
        System.out.println(d2.getDepartmentName()+"总共有"+d2.getStaffNum()+"名员工");


    }
}
