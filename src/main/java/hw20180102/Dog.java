/**
 * Project Name:59-18
 * File Name:Dog.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午4:48:20
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午4:48:20 <br/>
 * @author   11324
 * @version
 * @see
 */
public class Dog extends Animal{
    private String name;
    
    void eat() {
        
        System.out.println("吃骨头");
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
   
}

