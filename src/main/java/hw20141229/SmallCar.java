/**
 * Project Name:59-18
 * File Name:SmallCar.java
 * Package Name:hw20141229
 * Date:2017年12月29日下午3:40:27
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20141229;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午3:40:27 <br/>
 * @author   11324
 * @version
 * @see
 */
public class SmallCar extends Car{
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    void xinXi(){
        summary();
        dongneng();
        System.out.println(color);
        
    }
    
    
}

