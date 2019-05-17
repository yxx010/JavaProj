package com.imooc.work3;

public class Lion extends Animal implements IAct {
    private String sex;
    private String color;
    public Lion(){}
    public Lion(String name,int age){
        this.setName(name);
        this.setAge(age);
    }
    public Lion(String name,int age,String sex,String color){
        this.setName(name);
        this.setAge(age);
        this.setSex(sex);
        this.setColor(color);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void love() {
        System.out.println("喜欢吃各种肉类");
    }

    public void skill() {
        System.out.println("擅长钻火圈");
    }

    public void act() {
        System.out.println("表演者："+this.getName());
        System.out.println("年龄："+this.getAge()+"岁");
        System.out.println("性别："+this.getSex());
        System.out.println("毛色："+this.getColor());
        System.out.print("技能：");
        skill();
        System.out.print("爱好：");
        love();
    }
}
