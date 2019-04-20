package com.imooc.three;

public class Bear extends Animal implements IAct {
    public  Bear(){}
    public  Bear(String name,int age){
        this.setName(name);
        this.setAge(age);
    }

    public void love() {
        System.out.println("喜欢卖萌");
    }

    public void skill() {
        System.out.println("挽着花篮，打着雨伞,自立走秀");
    }

    public void act() {
        System.out.println("表演者："+this.getName());
        System.out.println("年龄："+this.getAge()+"岁");
        System.out.print("技能：");
        skill();
        System.out.print("爱好：");
        love();
    }
}
