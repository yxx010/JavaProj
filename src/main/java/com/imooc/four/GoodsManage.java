package com.imooc.four;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GoodsManage {

    private Set goodsSet;
    public GoodsManage(){
    }

    public GoodsManage(Set goodsSet) {
        this.goodsSet = goodsSet;
    }

    public Set getGoodsSet() {
        return goodsSet;
    }

    public void setGoodsSet(Set goodsSet) {
        this.goodsSet = goodsSet;
    }

    public void importGoods(){
        Goods gd1=new Goods("goods001","水杯",56,"不锈钢水杯");
        Goods gd2=new Goods("goods002","饮水机",299,"带净化功能的饮水机");
        Goods gd3=new Goods("goods003","笔记本电脑",4999,"15寸笔记本电脑");
        Goods gd4=new Goods("goods004","手机",2300,"android手机");
        goodsSet=new HashSet();
        goodsSet.add(gd1);
        goodsSet.add(gd2);
        goodsSet.add(gd3);
        goodsSet.add(gd4);
        setGoodsSet(goodsSet);
        System.out.println("导入成功");
    }
    public void displayAllGoods(){
        if(goodsSet!=null){
            Iterator it=goodsSet.iterator();
            while (it.hasNext()){
                System.out.println(it.next());
            }
        }
        else {
            System.out.println("商品管理为空，请先导入商品！");
        }
    }
}
