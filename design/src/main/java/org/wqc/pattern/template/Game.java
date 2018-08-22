package org.wqc.pattern.template;

/**
 * @Auther: wangqc1576331@163.com
 * @Date: 2018/8/9 11:59
 * @Description:
 */
public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    //模板
    public final void play(){

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }
}
