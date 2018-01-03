/**
 * Project Name:59-18
 * File Name:YiChang.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午3:30:44
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;

import java.util.Scanner;

import org.apache.log4j.Logger;


/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午3:30:44 <br/>
 * @author   11324
 * @version
 * @see
 */
public class YiChang {
        private final static Logger LOG = Logger.getLogger(YiChang.class);
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       
      LOG.info("请输入形状的长：");
    
      try{
          int a = input.nextInt();
          LOG.info("请输入形状的宽：");
          int b = input.nextInt();
      if(a == b){
          LOG.info("正方形");
      }else{
          LOG.info("长方形");
      }
      
      } catch(Exception e){
          LOG.info("输入有错误，需输入整形变量");
      }

    }

}

