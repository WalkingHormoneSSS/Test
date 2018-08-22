package org.wqc.pattern.template;

/**
 * @Auther: wangqc1576331@163.com
 * @Date: 2018/8/9 12:02
 * @Description:
 */
public class Test {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
