/**
 * Project Name:crowd-entity
 * File Name:UserMessage.java
 * Package Name:crowd.wisedu.crowd.entity.message
 * Date:2017年8月23日下午2:18:57
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package crowd.wisedu.crowd.entity.message.mq;

import java.io.Serializable;

import com.wisedu.crowd.entity.datacode.UserMessageStateEnum;

/**
 * ClassName:UserMessage <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月23日 下午2:18:57 <br/>
 * @author   de
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class UserMqMessage extends MqMessage implements Serializable{

    /**
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).
     * @since JDK 1.6
     */
    
    
    private static final long serialVersionUID = 1L;
    
    public UserMqMessage(){
        
    }
    /**
     * 
     * Creates a new instance of UserMqMessage.
     *
     * @param messageId
     * @param target
     * @param code  请用UserMessageState
     */
    public UserMqMessage(String messageId,String target, int code,String content){
        this.messageId=messageId;
        this.target=target;
        this.code=code;
        this.content=content;
    }
    private String target;
    
    /**
     * 内容
     */
    private String content;
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }
    
    @Override
    public String toString(){
        return "==UserMqMessage.class====messageId="+messageId+"===target"+target+"===code=="+code+"====content===";
        
    }

}

