/**
 * Project Name:59-18
 * File Name:MaxText.java
 * Package Name:hw20141225
 * Date:2017年12月25日下午5:13:03
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20141225;
/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午5:13:03 <br/>
 * @author   11324
 * @version
 * @see
 */
public class MaxText {

    public static void main(String[] args) {

        //  Auto-generated method stub
        
        MaxText max = new MaxText();
        int x =max.Max(6,8);
        System.out.println("最大值："+x);
    }
    
    int Max(int a,int b){
        if(a>=b){
            return a;
        }else{
            return b;
        }
    }

}

