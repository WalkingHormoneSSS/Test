package org.wqc.pattern.template;

/**
 * @Auther: wangqc1576331@163.com
 * @Date: 2018/8/9 12:00
 * @Description:
 */
public class Cricket extends Game{
    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Cricket Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Cricket Game Started. Enjoy the game!");
    }
}
