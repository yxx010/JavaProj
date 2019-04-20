package com.imooc.three;

import java.util.Scanner;

public class IActTest {
    public void showAct(){
        System.out.println("******欢迎来到太阳马戏团******");
        System.out.println("******** 请选择表演者********");
        System.out.println("********   1、棕熊  ********");
        System.out.println("********   2、狮子  ********");
        System.out.println("********   3、猴子  ********");
        System.out.println("********   4、鹦鹉  ********");
        System.out.println("********   5、小丑  ********");
    }
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        IActTest iact=new IActTest();
        do{
            iact.showAct();
            i=sc.nextInt();
        switch (i){
            case 1:
                Bear bear=new Bear("Bill",1);
                bear.act();
                break;
            case 2:
                Lion lion=new Lion("Lain",2,"公狮","灰色");
                lion.act();
                break;
            case 3:
                Monkey monkey=new Monkey("Tom",1,"金丝猴");
                monkey.act();
                break;
            case 4:
                Parrot parrot=new Parrot("Rose",1,"牡丹鹦鹉");
                parrot.act();
                break;
            case 5:
                Clown clown=new Clown("Kahle",5);
                clown.act();
                break;
            default:
                System.out.println("*******选择表演者错误*******");
        }
        System.out.println("*******是否继续观看1/0*******");
           do{
               j=sc.nextInt();
               if(j!=0&j!=1){
                   System.out.println("输入错误，请重新输入：");
               }
           }
           while(j!=0&j!=1);

        }
        while(j!=0);
    }
}
