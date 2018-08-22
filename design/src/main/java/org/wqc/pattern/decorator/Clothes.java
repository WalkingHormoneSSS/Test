package org.wqc.pattern.decorator;

/**
 * @Auther: wangqc1576331@163.com
 * @Date: 2018/8/2 16:44
 * @Description:
 */
public abstract class Clothes implements Proson{
    private Proson proson;

    public Clothes(Proson proson) {
        this.proson = proson;
    }

    @Override
    public void show() {
        proson.show();

    }
}
