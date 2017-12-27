/**
 * Project Name:59-18
 * File Name:PigTest.java
 * Package Name:hw20141227
 * Date:2017年12月27日下午3:28:21
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20141227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午3:28:21 <br/>
 * @author   11324
 * @version
 * @see
 */
public class PigTest {

    public static void main(String[] args) {

        //  Auto-generated method stub
        Pig pig = new Pig();
        
        pig.setName("小猪猪");
        System.out.println(pig.getName());
        
        pig.setAge(3);
        System.out.println(pig.getAge()+"岁");
        
        pig.setWeight(60);
        System.out.println("体重："+pig.getWeight()+"kg");
    }

}

