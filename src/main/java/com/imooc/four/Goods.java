package com.imooc.four;

import java.util.Objects;

public class Goods {
    private String goodsId;
    private String goodsName;
    private double price;
    private String goodsDesp;
    public Goods(){}

    public Goods(String goodsId, String goodsName, double price, String goodsDesp) {
        this.goodsId = goodsId;
        this.goodsName = goodsName;
        this.price = price;
        this.goodsDesp = goodsDesp;
    }

    public String getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(String goodsId) {
        this.goodsId = goodsId;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGoodsDesp() {
        return goodsDesp;
    }

    public void setGoodsDesp(String goodsDesp) {
        this.goodsDesp = goodsDesp;
    }

    @Override
    public String toString() {
        return "商品信息[" +
                "商品ID:" + goodsId+
                ",商品名称：" + goodsName+
                ",商品价格：" + price +
                ",商品描述：" + goodsDesp +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(goodsId, goods.goodsId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(goodsId);
    }

}
