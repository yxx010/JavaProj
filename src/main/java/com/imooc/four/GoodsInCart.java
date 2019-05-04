package com.imooc.four;

public class GoodsInCart {
    private Goods goods;
    private int num;

    public GoodsInCart(Goods goods, int num) {
        this.goods = goods;
        this.num = num;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "商品名称：" + goods.getGoodsName() +
                ",商品价格：" + goods.getPrice() +
                ",商品描述：" + goods.getGoodsDesp() +
                ",数量：" + num;
    }
}
