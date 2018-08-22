package org.wqc.pattern.proxy.staticproxy;

/**
 * @Auther: wangqc1576331@163.com
 * @Date: 2018/8/9 10:30
 * @Description:
 */
public class Test {


    public static void main(String[] args) {


        BuyHouse buyHouse = new BuyHouseImpl();
        buyHouse.buyhosue();

        BuyHouseProxy buyHouseProxy = new BuyHouseProxy(buyHouse);
        buyHouseProxy.buyhosue();


//        静态代理总结：
//
//        优点：可以做到在符合开闭原则的情况下对目标对象进行功能扩展。
//
//        缺点：我们得为每一个服务都得创建代理类，工作量太大，不易管理。同时接口一旦发生改变，代理类也得相应修改。
    }
}
