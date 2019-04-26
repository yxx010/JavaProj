package com.imooc.three;

import java.util.Scanner;

public class IActTest {
    public void showAct() {
        System.out.println("******欢迎来到太阳马戏团******");
        System.out.println("******** 请选择表演者********");
        System.out.println("********   1、棕熊  ********");
        System.out.println("********   2、狮子  ********");
        System.out.println("********   3、猴子  ********");
        System.out.println("********   4、鹦鹉  ********");
        System.out.println("********   5、小丑  ********");
    }

    public static void main(String[] args) {
        int i, j;
        Scanner sc = new Scanner(System.in);
        IActTest iact = new IActTest();
        IAct act = null;
        do {
            iact.showAct();
            i = sc.nextInt();
            switch (i) {
                case 1:
                    act = new Bear("Bill", 1);
                    break;
                case 2:
                    act = new Lion("Lain", 2, "公狮", "灰色");
                    break;
                case 3:
                    act = new Monkey("Tom", 1, "金丝猴");
                    break;
                case 4:
                    act = new Parrot("Rose", 1, "牡丹鹦鹉");
                    break;
                case 5:
                    act = new Clown("Kahle", 5);
                    break;
                default:
                    act = null;
                    System.out.println("*******选择表演者错误*******");
                    break;
            }
            if (act != null) {
                act.act();
            }
            System.out.println("*******是否继续观看1/0*******");
            do {
                j = sc.nextInt();
                if (j != 0 & j != 1) {
                    System.out.println("输入错误，请重新输入：");
                }
            }
            while (j != 0 & j != 1);

        }
        while (j != 0);
    }
}
