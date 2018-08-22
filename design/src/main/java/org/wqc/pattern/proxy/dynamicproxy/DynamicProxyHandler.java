package org.wqc.pattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Auther: wangqc1576331@163.com
 * @Date: 2018/8/9 10:48
 * @Description:
 */
//动态代理处理器
public class DynamicProxyHandler implements InvocationHandler {
    private Object object;

    public DynamicProxyHandler(Object object) {

        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("买房子前的准备。。。");
        Object invoke = method.invoke(object, args);
        System.out.println("买房子后需要装修什么的。。。");
        return invoke;
    }
}
