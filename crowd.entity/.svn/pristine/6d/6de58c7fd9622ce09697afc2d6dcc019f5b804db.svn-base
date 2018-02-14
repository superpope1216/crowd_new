/**
 * Project Name:crowd-entity
 * File Name:TaskMessage.java
 * Package Name:crowd.wisedu.crowd.entity.message
 * Date:2017年8月23日下午1:57:04
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package crowd.wisedu.crowd.entity.message.mq;

import java.io.Serializable;

import com.wisedu.crowd.entity.datacode.project.DemandStateEnum;

/**
 * ClassName:任务消息队列发送过程中的消息组装体 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月23日 下午1:57:04 <br/>
 * @author   de
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class DemandMqMessage extends MqMessage implements Serializable{

    /**
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).
     * @since JDK 1.6
     */
    private static final long serialVersionUID = 1L;

    /**
     * 任务编号
     */
    private String wid;
    
    
    /**
     * 任务状态
     */
    private int code;

  

    public int getCode() {
        return code;
    }


    public void setCode(int code) {
        this.code = code;
    }


    public DemandMqMessage(){
        
    }
    /**
     * 
     * Creates a new instance of DemandMqMessage.
     *
     * @param messageId
     * @param wid
     * @param code  请用DemandStateEnum
     */
    public DemandMqMessage(String messageId,String wid,int code){
        this.messageId=messageId;
        this.wid=wid;
        this.code=code;
    }
    
    
    public String getWid() {
        return wid;
    }
    public void setWid(String wid) {
        this.wid = wid;
    }
    
}

