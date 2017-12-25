/**
 * Project Name:59-18
 * File Name:Vip.java
 * Package Name:hw20141225
 * Date:2017年12月25日下午5:24:38
 * Copyright (c) 2017, bluemobi All Rights Reserved.
 */

package hw20141225;

import java.util.Scanner;

/**
 * Description:   <br/>
 * Date:     2017年12月25日 下午5:24:38 <br/>
 * @author   11324
 * @version
 * @see
 */
public class Vip {
    String vip1 = "至尊级";
    String vip2 = "砖石级";
    String vip3 = "铂金级";
    String vip4 = "黄金级";
    String vip5 = "白银级";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //  Auto-generated method stub
        
        System.out.print("请输入购物金额："); 
        float x = input.nextInt();
        
        while(true){
        System.out.print("请输入您的vip卡片等级（vip1~vip5）："); 
        String y = input.next();
         if(y.equals("vip1") || y.equals("vip2") || y.equals("vip3") || y.equals("vip4") || y.equals("vip5")){
        Vip vip = new Vip();
      
        String aa = vip.money(x, y);
        System.out.print(aa);
        break;
         }else{
             System.out.println("无法识别,请重新输入！");
         }
        }
    }
    
    String money(float a,String b){
        
        if(b.equals("vip1")){
            return "您是‘至尊级’用户，享受对应打折后金额为："+a*0.75;
        }else if(b.equals("vip2")){
            return "您是‘砖石级’用户，享受对应打折后金额为："+a*0.8;
        }else if(b.equals("vip3")){
            return "您是‘铂金级’用户，享受对应打折后金额为："+a*0.85;
        }else if(b.equals("vip4")){
            return "您是‘黄金级’用户，享受对应打折后金额为："+a*0.9;
        }else{
            return "您是‘白银级’用户，享受对应打折后金额为："+a*0.95;
        }
       
       
    }
    

}

