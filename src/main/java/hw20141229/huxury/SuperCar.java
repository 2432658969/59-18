/**
 * Project Name:59-18
 * File Name:SuperCar.java
 * Package Name:hw20141229.huxury
 * Date:2017年12月29日下午4:02:19
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20141229.huxury;

import hw20141229.Car;

/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午4:02:19 <br/>
 * @author   11324
 * @version
 * @see
 */
public class SuperCar extends Car{
    private String style = "酷炫";
    Car summary(){
        System.out.println("我是豪车。。。");
        return null;
    }
    
    public void yangZi(){
        System.out.println(style);
    }
}

