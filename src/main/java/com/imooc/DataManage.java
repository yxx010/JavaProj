package com.imooc;

import java.util.Scanner;

public class DataManage {
    public int[] insertData() {
        int [] intArry=new int[10];
        for(int i=0;i<3;i++){
            System.out.println("请输入第"+(i+1)+"个数据：");
            Scanner sc=new Scanner(System.in);
            intArry[i]=sc.nextInt();
            if(intArry[i]==0){
                System.out.println("不能输入0！请重新输入！：");
                intArry[i]=sc.nextInt();
            }
            continue;
        }
        return intArry;

    }
    public void showData(int[] a, int length) {
        for(int i=0;i<length;i++){
            System.out.print(a[i]);
            System.out.print(" ");

        }
        System.out.println();
    }
    public void insertAtArray(int[] a, int n, int k) {
        System.out.println("请输入要插入的数：");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("请输入插入数据的位置：");
        k=sc.nextInt();
        a[k]=n;
    }
    public void divThree(int[] a) {
        System.out.print("能被3整除的数有：");
        for (int i=0;i<a.length;i++){
           if(a[i]%3==0)
               System.out.print(a[i]+" ");
        }
    }
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
        //int [] intArry=new int[10];
        int [] intArry= {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int in=0,n,k;
        DataManage dm=new DataManage();
        do {
            dm.notice();
            System.out.println("请输入对应的数字进行操作:");
            Scanner sc = new Scanner(System.in);
            in = sc.nextInt();
            switch (in) {
                //0--退出
                case 0:
                    break;
                //1--插入数据
                case 1:
                    intArry = dm.insertData();
                    dm.notice();
                    //break;
                    //2--显示所有数据
                case 2:
                    dm.showData(intArry, intArry.length);
                    break;
                //3--在指定位置插入数据
                case 3:
                    //System.out.println("请输入要插入的数：");
                    // n=sc.nextInt();
                    // System.out.println("请输入插入数据的位置：");
                    // k=sc.nextInt();
                    dm.insertAtArray(intArry, 2, 5);
                    break;
                //4--查询能被3整除的数据
                case 4:
                    dm.divThree(intArry);
                    break;
                default:
                    System.out.println("请输入正确的数字");
                    break;
            }
        }while(in!=0);
    }
}
