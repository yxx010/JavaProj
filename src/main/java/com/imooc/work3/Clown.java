package com.imooc.work3;

public class Clown implements IAct {
    private String name;
    private int years;
    public Clown(){}
    public Clown(String name,int years){
        this.setName(name);
        this.setYears(years);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public void skill() {
        System.out.println("脚踩高跷，进行杂技魔术表演");
    }
    public void wear(){
        System.out.println("身穿五彩服装，头上戴着彩色的帽子，脸上画着夸张的彩妆");
    }
    public void act() {
        System.out.println("表演者："+this.getName());
        System.out.println("艺龄："+this.getYears()+"年");
        System.out.print("着装：");
        wear();
        System.out.print("技能：");
        skill();
    }
}
