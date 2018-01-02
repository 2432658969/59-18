/**
 * Project Name:59-18
 * File Name:Test.java
 * Package Name:hw20180102
 * Date:2018年1月2日下午4:49:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180102;
/**
 * Description:   <br/>
 * Date:     2018年1月2日 下午4:49:04 <br/>
 * @author   11324
 * @version
 * @see
 */
public class Test {

    public static void main(String[] args) {
        
       biJiao(new Cat());
       biJiao(new Dog());

    }
    
    public static void biJiao(Animal a){
        a.eat();
        if(a instanceof Cat){
            Cat b = (Cat)a;
            b.speak();
        }
        if(a instanceof Dog){
            Dog b = (Dog)a;
            b.setName("旺财");
            System.out.println(b.getName());
        }
    }
}

