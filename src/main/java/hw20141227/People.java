/**
 * Project Name:59-18
 * File Name:People.java
 * Package Name:hw20141227
 * Date:2017年12月27日下午2:31:17
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20141227;
/**
 * Description:   <br/>
 * Date:     2017年12月27日 下午2:31:17 <br/>
 * @author   11324
 * @version
 * @see
 */
public class People {
    
    String name = "李林";
    int age = 20;
    double weight = 60;
   
   public People(){ 
      System.out.println(name);
      System.out.println(age);
      System.out.println(weight);
      name = "haha";
      age = 21;
      weight = 61;
   }

    public static void main(String[] args) {

        //  Auto-generated method stub
           new People();
           
        

    }

}

