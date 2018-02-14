/**
 * Project Name:crowd-entity
 * File Name:Message.java
 * Package Name:crowd.wisedu.crowd.entity.message
 * Date:2017年8月23日下午2:17:38
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package crowd.wisedu.crowd.entity.message.mq;

import java.io.Serializable;

/**
 * ClassName:Message <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月23日 下午2:17:38 <br/>
 * @author   de
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public  class MqMessage implements Serializable {

    /**
     * serialVersionUID:TODO(用一句话描述这个变量表示什么).
     * @since JDK 1.6
     */
    private static final long serialVersionUID = 1L;
    protected String messageId;
    

  
    public MqMessage(){
        
    }
    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
}

