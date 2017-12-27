/**
 * Project Name:59-18
 * File Name:Demo.java
 * Package Name:hw20141227
 * Date:2017年12月27日下午4:01:22
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20141227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午4:01:22 <br/>
 * @author   11324
 * @version
 * @see
 */
public class DemoStatic {

    public static void main(String[] args) {

        System.out.println(StaticDemo.age);//加了static的age不用创建实例对象，可以直接通过类调用对象输出age
        StaticDemo.color();// 也可以通过创建实例对象，来调用方法
        
         StaticDemo td = new StaticDemo();
         System.out.println(td.name);//只能通过创建实例对象，用实例对象调用输出name
         System.out.println(td.age);//也可以通过创建实例对象，用实例对象调用输出age
         td.voice();//只能通过创建实例对象，来调用方法
         td.color();//可以通过创建实例对象，来调用方法

    }

}

