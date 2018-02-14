/**
 * Project Name:crowdcommon
 * File Name:DesUtil.java
 * Package Name:com.wisedu.emap.crowdcommon.util.encrypt
 * Date:2017年8月25日上午9:14:41
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.common.util.encrypt;

import org.apache.commons.lang3.StringUtils;

/**
 * ClassName:DesUtil <br/>
 * Function: TODO Des加密解密公共类. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月25日 上午9:14:41 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class DesUtil {

    /**
     * 
     * strEnc:(加密). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * TODO(这里描述这个方法的执行流程 – 可选).<br/>
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>
     *
     * @author dell
     * @param data
     * @return
     * @since JDK 1.6
     */
    public static String strEnc(String data) {
        if (StringUtils.isBlank(data))
            return "";

        Des desObj = new Des();
        return desObj.strEnc(data);
    }

    /**
     * 
     * strDec:(解密). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * TODO(这里描述这个方法的执行流程 – 可选).<br/>
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>
     *
     * @author dell
     * @param data
     * @return
     * @since JDK 1.6
     */
    public static String strDec(String data) {
        if (StringUtils.isBlank(data))
            return "";

        Des desObj = new Des();
        return desObj.strDec(data);
    }
    
    public static void main(String[] args) {
        System.out.println(strEnc("51324fc1c4be49fe8cabd86f34c713c3&crowduserinfo&DQFZR"));
    }
}

