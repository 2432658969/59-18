/**
 * Project Name:59-18
 * File Name:ListDemo.java
 * Package Name:hw20180104
 * Date:2018年1月4日下午2:56:16
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180104;


import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.log4j.Logger;

/**
 * Description:   <br/>
 * Date:     2018年1月4日 下午2:56:16 <br/>
 * @author   11324
 * @version
 * @see
 */
public class ListDemo {
    private final static Logger LOG = Logger.getLogger(ListDemo.class);
    public static void main(String[] args) {
        
        List cp = new ArrayList();
        
        cp.add("haha01");
        cp.add("haha02");
        cp.add("haha03");
        cp.add("haha04");//添加
        
        LOG.info("现在有："+cp);
        
        cp.add(1, "nono");
        LOG.info("插入后的："+cp);//插入
        
        cp.remove(1);
        LOG.info("删除后的："+cp);//删除
        
        cp.set(1, "gogo");
        LOG.info("修改后的："+cp);//修改
        
        Object a =cp.get(1);
        LOG.info("查询的是："+a);//查询元素
        
        Object b =cp.subList(1, 3);
        LOG.info("查询的是："+b);//返回列表中指定的 fromIndex（包括 ）和 toIndex（不包括）之间的部分视图。
       
        Iterator n= cp.iterator();
        while(n.hasNext()){
            LOG.info(n.next()) ;//遍历
        }
        
      /*  for(Iterator n= cp.iterator();n.hasNext();){
            LOG.info(n.next()) ;
        }*/
        
       /* for(int i=0;i<cp.size();i++){
            if(n.hasNext()){
                LOG.info(n.next());
            }
        }*/
        
        
        

    }

}

