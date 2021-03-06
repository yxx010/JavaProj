package com.imooc.work4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestDemo {
    public void mainMenu() {
        System.out.println("**********************");
        System.out.println("      **主菜单**");
        System.out.println("      1--商品管理");
        System.out.println("      2--购物车");
        System.out.println("      0--退出");
        System.out.println("**********************");
        System.out.println("请输入对应数字进行操作：");
    }

    public void shoppingCart() {
        System.out.println("******************************");
        System.out.println("      **购物车管理**");
        System.out.println("      1--添加商品到购物车");
        System.out.println("      2--修改购物车中的商品数量");
        System.out.println("      3--显示购物车中的所有商品信息");
        System.out.println("      4--结算");
        System.out.println("      9--返回上级菜单");
        System.out.println("******************************");
        System.out.println("请输入对应的数字对购物车进行管理：");
    }

    public void goodsManage() {
        System.out.println("*************************");
        System.out.println("      **商品管理**");
        System.out.println("      1--商品信息导入");
        System.out.println("      2--显示所有商品信息");
        System.out.println("      9--返回上一级菜单");
        System.out.println("*************************");
        System.out.println("请输入对应的数字对商品进行管理：");
    }

    public static void main(String[] args) {
        TestDemo td = new TestDemo();
        GoodsManage gm = new GoodsManage();
        ShoppingCart shop = new ShoppingCart();
        Scanner sc = new Scanner(System.in);
        try {
            int in;
            do {
                td.mainMenu();
                in = sc.nextInt();
                switch (in) {
                    case 1:
                        goodMange(td, gm, sc);
                        break;
                    case 2:
                        shoppingCart(td, gm, shop, sc);
                        break;
                    case 0:
                        System.out.println("已退出程序！");
                        break;
                    default:
                        System.out.println("输入错误，请重新输入！");

                }

            } while (in != 0);
        } catch (InputMismatchException IE) {
            System.out.println("数据类型输入错误!");

        }

    }

    private static void shoppingCart(TestDemo testdemo, GoodsManage goodsmanage, ShoppingCart shoppingcart, Scanner scanner) {
        int i2;
        do {
            testdemo.shoppingCart();
            i2 = scanner.nextInt();
            switch (i2) {
                case 1:
                    //添加商品到购物车
                    shoppingcart.addGoodsToCart(goodsmanage);
                    break;
                case 2:
                    //修改商品数量
                    shoppingcart.updateNumInCart();
                    break;
                case 3:
                    //显示全部商品
                    shoppingcart.displayAllInCart();
                    break;
                case 4:
                    //结算
                    shoppingcart.settleAccounts();
                    break;
                case 9:
                    //返回上级菜单
                    System.out.println("已返回上级菜单");
                    break;
                default:
                    System.out.println("输入错误");

            }
        } while (i2 != 9);
    }

    private static void goodMange(TestDemo testdemo, GoodsManage goodsmanage, Scanner scanner) {
        int i1;
        do {
            testdemo.goodsManage();
            i1 = scanner.nextInt();
            switch (i1) {
                case 1:
                    goodsmanage.importGoods();
                    break;
                case 2:
                    goodsmanage.displayAllGoods();
                    break;
                case 9:
                    System.out.println("已返回上级菜单");
                    break;
                default:
                    System.out.println("输入错误，请重新选择！");
                    break;
            }
        } while (i1 != 9);
    }
}
