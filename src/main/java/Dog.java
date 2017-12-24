/**
 * Project Name:59-18
 * File Name:Dog.java
 * Package Name:
 * Date:2017年12月24日下午12:21:52
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

/**
 * Description:   <br/>
 * Date:     2017年12月24日 下午12:21:52 <br/>
 * @author   11324
 * @version
 * @see
 */
public class Dog {
      String name;
      int age;
      double weight;
      
      void DJ(){
          System.out.print("汪汪！");
      }
      
      int S(){
          return 3;
      }
      
      int eat(){
          return 1;
      }
      
      
      public static void main(String[] args){
          Dog dog = new Dog();
          dog.name = "旺财";
          dog.age = 1;
          dog.weight = 2.6d;
          
          
          System.out.print("我有一条狗，叫"+dog.name);
          System.out.println("年龄"+dog.age+"岁,体重"+dog.weight+"kg");
          System.out.println("今天早上我给它吃了"+dog.eat()+"根骨头,在它吃骨头的时候有另一条狗走了过来也想吃，\n"+dog.name+"当然不会和别人分享自己的骨头,于是连叫"+dog.S()+"声，把它赶走了，自己独享了美食。");
          
      }
}

