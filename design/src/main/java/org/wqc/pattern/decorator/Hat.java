package org.wqc.pattern.decorator;

/**
 * @Auther: wangqc1576331@163.com
 * @Date: 2018/8/2 16:46
 * @Description:
 */
public class Hat extends Clothes {
    public Hat(Proson proson) {
        super(proson);
    }
    @Override
    public void show() {
        super.show();
        say();
    }

    public void say(){
        System.out.println( "我展示一个帽子");
    }
}
