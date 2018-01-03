/**
 * Project Name:59-18
 * File Name:Teacher.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午2:32:35
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午2:32:35 <br/>
 * @author   11324
 * @version
 * @see
 */
public class ZhuBan {
    void run(JieKou a){
        a.open();
        a.close();
        if(a instanceof WangKa){
            WangKa a1 = (WangKa)a;
            a1.shangWang();
        }
        if(a instanceof ShengKa){
            ShengKa a1 = (ShengKa)a;
            a1.ting();
        }
    }
        
}

