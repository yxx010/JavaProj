package com.imooc.work1;

import java.util.Scanner;

public class DataManage {
    //定义一个10位数组，输入9个值，返回数组
    public int[] insertData() {
        int [] intArry=new int[10];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<intArry.length-1;i++){
            System.out.println("请输入第"+(i+1)+"个数据：");
            intArry[i]=sc.nextInt();
            if(intArry[i]==0){
                System.out.print("不能输入0！");
                i--;
                //intArry[i]=sc.nextInt();
            }
        }
        return intArry;
    }
    //打印数组元素
    public void showData(int[] a, int length) {
        System.out.println("数组元素为：");
        for(int i=0;i<length;i++){
            if(a[i]!=0){
                System.out.print(a[i]);
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    //指定位置插入数据，指定位置数据后移
    public void insertAtArray(int[] a, int n, int k) {
        for (int i=a.length-1;i>k;i--){
            a[i]=a[i-1];
        }
        a[k]=n;
    }
    //查询被3整存的数
    public void divThree(int[] a) {
        boolean flag=true;
        System.out.print("数组中能被3整除的数有：");
        for (int i=0;i<a.length;i++){
           if(a[i]%3==0) {
               System.out.print(a[i]+" ");
               flag=false;
           }
        }
        //System.out.println();
        if (flag==true)
        System.out.print("没有被3整除的数");
        System.out.println();
    }
    //打印主窗口选择项
    public void notice(){
        System.out.println("-----------------------------");
        System.out.println("     1--插入数据");
        System.out.println("     2--显示所有数据");
        System.out.println("     3--在指定位置插入数据");
        System.out.println("     4--查询能被3整除的数据");
        System.out.println("     0--退出");
        System.out.println("-----------------------------");
    }
    public static void main(String[] args) {
        int [] intArry=null;
        int in=0,n,k;
        DataManage dm=new DataManage();
        Scanner sc = new Scanner(System.in);
        do {
            //打印主窗口选择项
            dm.notice();
            System.out.println("请输入对应的数字进行操作:");
            in = sc.nextInt();
            switch (in) {
                //0--退出
                case 0:
                    System.out.println("退出程序");
                    break;
                //1--插入数据，并展示插入数据后的数组
                case 1:
                    intArry = dm.insertData();
                    dm.showData(intArry, intArry.length);
                    break;
                //2--显示所有数据
                case 2:
                    dm.showData(intArry, intArry.length);
                    break;
                //3--在指定位置插入数据，并展示插入数据后的数组
                case 3:
                    System.out.println("请输入要插入的数：");
                    n=sc.nextInt();
                    System.out.println("请输入插入数据的位置：");
                    k=sc.nextInt();
                    dm.insertAtArray(intArry, n, k);
                    dm.showData(intArry, intArry.length);
                    break;
                //4--查询能被3整除的数据
                case 4:
                    dm.divThree(intArry);
                    break;
                default:
                    System.out.println("请输入正确的选项！");
                    break;
            }
        }while(in!=0);
    }
}
