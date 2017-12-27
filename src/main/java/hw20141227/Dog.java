/**
 * Project Name:59-18
 * File Name:Dog.java
 * Package Name:hw20141227
 * Date:2017年12月27日下午2:53:14
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20141227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午2:53:14 <br/>
 * @author   11324
 * @version
 * @see
 */
public class Dog {
   private String name;
   private int age;
   
   public Dog(String name,int age){
       this.name = name;
       this.age = age;
   }
    

    public static void main(String[] args) {

        //  Auto-generated method stub
        Dog dog = new Dog("旺财",1);
        System.out.println(dog.name+","+dog.age);
    }

}

