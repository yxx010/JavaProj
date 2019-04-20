package com.imooc.three;

public class Parrot extends Animal implements IAct {
    private String brand;
    public Parrot(){}
    public Parrot(String name,int age,String brand){
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
        System.out.println("喜欢吃坚果和松子");
    }

    public void skill() {
        System.out.println("擅长模仿");
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
