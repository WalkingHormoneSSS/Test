package org.wqc.pattern.proxy.cglibproxy;


import org.aopalliance.intercept.MethodInvocation;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Auther: wangqc1576331@163.com
 * @Date: 2018/8/9 11:00
 * @Description:
 */
public class cglibProxy implements MethodInterceptor {

    private Object target;

    public Object getInstance(final Object target) {
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("买房前的准备");
        Object invoke = methodProxy.invoke(o, objects);
        System.out.println("买房子后装修什么的。。。");
        return invoke;
    }
}
