/**
 * Project Name:59-18
 * File Name:StringDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:06:33
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import org.apache.log4j.Logger;

import hw20180103.YiChang;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午2:06:33 <br/>
 * @author   11324
 * @version
 * @see
 */
public class StringDemo {
        private final static Logger LOG = Logger.getLogger(StringDemo.class);
    public static void main(String[] args) {
       
       String str = "qwertyuiop";
       
        int f =str.length();
        LOG.info("字符串的长度："+f);
        
         char a = str.charAt(6);
        LOG.info("角标为6的索引的值："+a);
        
        int b =str.codePointAt(6);
        LOG.info("角标为6的索引的阿斯克码值："+b);
        
        int c = str.codePointCount(1, 8);
        LOG.info("角标为8减去角标1的值"+c);
        
        boolean d = str.contains("u");
        LOG.info("字符串中是否存在这个指定的字符串："+d);
        
        String e = str.concat("bbbbb");
        LOG.info("在末尾添加指定字符串后："+e);
        
        int g = str.indexOf("u");
        LOG.info("在此字符串中第一次出现指定字符的角标："+g);
        
        
        
    }

}

