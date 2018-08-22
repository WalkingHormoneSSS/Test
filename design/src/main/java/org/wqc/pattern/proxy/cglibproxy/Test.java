package org.wqc.pattern.proxy.cglibproxy;

import org.wqc.pattern.proxy.staticproxy.BuyHouse;
import org.wqc.pattern.proxy.staticproxy.BuyHouseImpl;

/**
 * @Auther: wangqc1576331@163.com
 * @Date: 2018/8/9 11:35
 * @Description:
 */
public class Test {


    public static void main(String[] args) {
        BuyHouse buyHouse = new BuyHouseImpl();
        cglibProxy cglibProxy = new cglibProxy();
        BuyHouseImpl instance = (BuyHouseImpl) cglibProxy.getInstance(buyHouse);
        instance.buyhosue();
    }
}
