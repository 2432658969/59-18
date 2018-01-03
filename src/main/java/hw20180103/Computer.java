/**
 * Project Name:59-18
 * File Name:Computer.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:19:15
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午3:19:15 <br/>
 * @author   11324
 * @version
 * @see
 */
public class Computer {

    public static void main(String[] args) {

        ZhuBan zb = new ZhuBan();
        zb.run(new WangKa());
        System.out.println("------------------");
        zb.run(new ShengKa());

    }

}

