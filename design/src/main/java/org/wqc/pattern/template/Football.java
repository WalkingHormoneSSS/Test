package org.wqc.pattern.template;

/**
 * @Auther: wangqc1576331@163.com
 * @Date: 2018/8/9 12:01
 * @Description:
 */
public class Football extends Game {
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
