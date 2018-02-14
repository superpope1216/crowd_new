/**
 * Project Name:crowd-entity
 * File Name:SmsMessageTempleate.java
 * Package Name:com.wisedu.crowd.entity.datacode
 * Date:2017年8月24日下午4:25:53
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.common.code;

/**
 * ClassName:短信通知模板 <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON. <br/>
 * Date: 2017年8月24日 下午4:25:53 <br/>
 * 
 * @author de
 * @version
 * @since JDK 1.6
 * @see
 */
public enum SmsMessageTempleateEnum {
    TITLE(0,"【智慧校园云工场】"),
    REGISTER(1, "(%s) （5分钟内有效，请尽快填写！）"),
    /**
     * 投标
     */
    TB(2,"您发布的任务[%s]已有投标，请尽快确认"),
    /**
     * 选标
     */
    XB(3,"您好，恭喜您被需求方选择成为[%s]任务的中标开发者！"),
    /**
     * 申请验收
     */
    APPLY_YS(4,"您好，开发者已完成需求[%s]，申请您验收确认，请及时处理。"),
    /**
     * 申请售后结束
     */
    APPLY_SQSHJS(5,"您好，开发者申请[%s]售后结束，请及时处理。"),
    /**
     * 验收不通过
     */
    YS_NOTPASS(6,"您参与开发的任务[%s]被需求方验收不通过，具体原因请和任务需求方沟通。"),
    /**
     * 验收通过
     */
    YS_PASS(7,"您参与开发的任务[%s]已被需求方验收通过！"),
    /**
     * 售后部通过
     */
    SH_NOTPASS(8,"您参与开发的任务[%s]售后结束审核不通过，具体原因请和任务需求方沟通。"),
    /**
     * 售后通过
     */
    SH_PASS(9,"恭喜您参与开发的任务[%s]售后服务通过需求方验收！"),
    
    AUTO_YS_PASS(10,"您发布的需求[%s]验收已到期，已被平台自动验收通过！"),
    
    AUTO_YS_NOT_PASS(10,"您参与的需求[%s]由于其关联的问题还没有处理结束，无法自动验收通过！");
    
    private int    code;

    private String name;

    SmsMessageTempleateEnum(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
