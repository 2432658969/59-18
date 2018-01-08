/**
 * Project Name:59-18
 * File Name:ThreadDemo.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午7:11:24
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import org.apache.log4j.Logger;

import hw20180104.StringDemo;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午7:11:24 <br/>
 * @author   11324
 * @version
 * @see
 */
public class ThreadDemo {
    private final static Logger LOG = Logger.getLogger(ThreadDemo.class);
    public static void main(String[] args) {
       HH h1 = new HH();
       HH h2 = new HH();
       h1.start();
       h2.start();
       for(int j=0;j<60;j++){
           LOG.info("HHHHHH"+j);
       }
    }
}

class HH extends Thread{
    private final static Logger LOG = Logger.getLogger(HH.class);
    public void run(){
        for(int i=0;i<60;i++){
          LOG.info(Thread.currentThread().getName()+"：李林"+i);
        }
    }
}
