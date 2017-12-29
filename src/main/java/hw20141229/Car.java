/**
 * Project Name:59-18
 * File Name:Car.java
 * Package Name:hw20141229
 * Date:2017年12月29日下午3:27:06
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20141229;
/**
 * Description:   <br/>
 * Date:     2017年12月29日 下午3:27:06 <br/>
 * @author   11324
 * @version
 * @see
 */
public abstract class  Car {
        Car summary(){
            System.out.println("可以带人开的飞快");
            return null;
        }
        
       private int wheel;
       private String fuel = "汽油";
       
    public int getSize() {
        return wheel;
    }
    public void setSize(int size) {
        this.wheel = size;
    }
     public void dongneng(){
         System.out.println(fuel);
     }
    
}

