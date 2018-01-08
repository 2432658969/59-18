/**
 * Project Name:59-18
 * File Name:RunnableDemo.java
 * Package Name:hw20180108
 * Date:2018年1月8日下午7:57:00
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180108;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月8日 下午7:57:00 <br/>
 * @author   11324
 * @version
 * @see
 */
public class RunnableDemo {
    private final static Logger LOG = Logger.getLogger(RunnableDemo.class);
    public static void main(String[] args) {
        PP p = new PP();
        Thread td1 = new Thread(p);
        Thread td2 = new Thread(p);
        td1.start();
        td1.setPriority(Thread.MIN_PRIORITY);
        td2.start();
        td2.setPriority(Thread.MAX_PRIORITY);
    }
}


class PP implements Runnable{
    private final static Logger LOG = Logger.getLogger(PP.class);
    
    public void run() {
        for(int i=0;i<60;i++){
            LOG.info(Thread.currentThread().getName()+":"+i);
        }
            
    }
    
}