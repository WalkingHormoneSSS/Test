package org.wqc.pattern.proxy.staticproxy;

/**
 * @Auther: wangqc1576331@163.com
 * @Date: 2018/8/9 10:27
 * @Description:
 */
//代理类
public class BuyHouseProxy implements BuyHouse{

    private  BuyHouse buyHouse;

    public BuyHouseProxy(BuyHouse buyHouse) {
        this.buyHouse = buyHouse;
    }

    @Override
    public void buyhosue() {
        System.out.println("买房子前的准备");
        buyHouse.buyhosue();
        System.out.println("买房子需要装修什么的");
    }
}
