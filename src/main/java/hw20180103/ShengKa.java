/**
 * Project Name:59-18
 * File Name:Worker.java
 * Package Name:hw20180103
 * Date:2018年1月3日下午2:31:04
 * Copyright (c) 2018, bluemobi All Rights Reserved.
 */

package hw20180103;
/**
 * Description:   <br/>
 * Date:     2018年1月3日 下午2:31:04 <br/>
 * @author   11324
 * @version
 * @see
 */
public class ShengKa implements JieKou{

   
    public void open() {
        
        System.out.println("声卡打开");
        
    }

   
    public void close() {
        
        System.out.println("声卡关闭");
        
    }
    
    public void ting(){
        System.out.println("听音乐");
    }

}

