/**
 * Project Name:59-18
 * File Name:KeTang1.java
 * Package Name:lianxi
 * Date:2017年12月25日上午11:02:29
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package lianxi;
/**
 * Description:   <br/>
 * Date:     2017年12月25日 上午11:02:29 <br/>
 * @author   11324
 * @version
 * @see
 */
public class School {
    String name = "李老师";
    String teacher = "张老师";

    public static void main(String[] args) {

        //  Auto-generated method stub
     School a = new School();
      a.class1();
      a.class2();
    }
    
    void class1(){
        String name = "李同学";
        System.out.println(this.name+name);
    }
    void class2(){
        String name = "张同学";
        System.out.println(teacher+name);    
    }
  
}

