package org.wqc.pattern.decorator;

/**
 * @Auther: wangqc1576331@163.com
 * @Date: 2018/8/2 16:47
 * @Description:
 */
public class Test
{



    public static void main(String[] args) {

        //创建被装饰者
        Me me = new Me() ;

        //裸体的人被装饰了帽子 ，具有了展示帽子的能力
        Hat hat = new Hat( me ) ;

        // 带了帽子的人被装饰了鞋子，具有了展示鞋子的本领
        Shoes shoes = new Shoes( hat ) ;

        shoes.show();
    }

}
