/**
 * Project Name:59-18
 * File Name:MapDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:56:36
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午2:56:36 <br/>
 * @author   11324
 * @version
 * @see
 */
public class MapDemo {
    private final static Logger LOG = Logger.getLogger(MapDemo.class);
    public static void main(String[] args) {

        Map<Integer,String> mp = new HashMap<Integer,String>();
        
        mp.put(1, "aa01"); 
        mp.put(2, "aa02");
        mp.put(3, "aa03");
        mp.put(4, "aa04");//添加
        LOG.info(mp);
        
       mp.remove(2);//删除
       LOG.info(mp);
       
         Object a = mp.get(3);//查询
         LOG.info(a);
         
         Set keySet = mp.keySet();
         Iterator<Integer> aa =keySet.iterator();//迭代
         
         while(aa.hasNext()){
             Integer x = aa.next();
             String y = mp.get(x);
             LOG.info(x+":"+y);  
         }
        
       
        

    }

}

