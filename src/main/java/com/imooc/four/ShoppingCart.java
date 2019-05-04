package com.imooc.four;

import java.util.*;

public class ShoppingCart {
    private Map <String,GoodsInCart> shoppingCart=new HashMap<String, GoodsInCart>();
    Scanner sc=new Scanner(System.in);
    public ShoppingCart(){

    }
    public void addGoodsToCart(GoodsManage gm){
        gm.displayAllGoods();
        if(gm.getGoodsSet()!=null){
            System.out.println("请输入要添加的商品编号：");
            String goodId=sc.next();
        // 判断输入的是否是有效的编号
        boolean idFlag = false;
        Goods tempGoods = null;
        Iterator<Goods> it = gm.getGoodsSet().iterator();
        while (it.hasNext()) {
            tempGoods = it.next();
            if (tempGoods.getGoodsId().equals(goodId)) {
                idFlag = true;
                break;
            }
        }
            if (idFlag) {
                Goods goods = new Goods(tempGoods.getGoodsId(), tempGoods.getGoodsName(), tempGoods.getPrice(),tempGoods.getGoodsDesp());
                System.out.println("请输入要添加商品的数量：");
                int num = sc.nextInt();
                GoodsInCart goodsInCart = new GoodsInCart(goods, num);
                shoppingCart.put(goodId, goodsInCart);
            }else{
            System.out.println("输入商品编号不存在！");
            }
        }
    }

    public void updateNumInCart(){
        if(shoppingCart.size()==0){
            System.out.println("购物车是空的哦~不能修改~");
        }else{
        System.out.println("请输入要修改的商品编号：");
        String goodsId=sc.next();
        if(shoppingCart.get(goodsId)!=null){
            System.out.println("请输入要修改的数量：");
            int num=sc.nextInt();
            if(num==0) {
                System.out.println("已删除该商品");
                shoppingCart.remove(goodsId);
            }else
            {
                shoppingCart.get(goodsId).setNum(num);
            }
        }else{
            System.out.println("购物车里没有该编号的商品");
        }
        }
    }
    public void displayAllInCart(){
        if (shoppingCart.size()==0){
            System.out.println("购物车是空的哦，赶快装满吧~");
        }else {
            Iterator<GoodsInCart> it = shoppingCart.values().iterator();
            while (it.hasNext()) {
                System.out.println(it.next());
            }
        }
    }
    public void settleAccounts(){
        //结算为空，需要清空购物车
        if(shoppingCart.size()==0){
            System.out.println("购物车是空的哦，不需要结算~");
        }else{
        double sum=0;
        Set <String> keySet=shoppingCart.keySet();
        for(String key:keySet){
            sum+=shoppingCart.get(key).getNum()*shoppingCart.get(key).getGoods().getPrice();
            }
            System.out.println("商品的总价为："+sum);
            displayAllInCart();
            shoppingCart.clear();
    }}
}
