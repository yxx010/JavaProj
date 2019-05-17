package com.imooc.work3;


public class Monkey extends Animal implements IAct {
    private String brand;
    public Monkey(){}
    public Monkey(String name,int age,String brand){
        this.setName(name);
        this.setAge(age);
        this.setBrand(brand);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void love() {
        System.out.println("喜欢模仿人的动作表情");
    }

    public void skill() {
        System.out.println("骑独轮车过独木桥");
    }

    public void act() {
        System.out.println("表演者："+this.getName());
        System.out.println("年龄："+this.getAge()+"岁");
        System.out.println("品种："+this.getBrand());
        System.out.print("技能：");
        skill();
        System.out.print("爱好：");
        love();
    }
}
