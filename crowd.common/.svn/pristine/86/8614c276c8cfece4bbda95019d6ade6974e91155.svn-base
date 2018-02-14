/**
 * Project Name:crowdcommon
 * File Name:StringEncrypt.java
 * Package Name:com.wisedu.emap.crowdcommon.util.encrypt
 * Date:2017年8月25日上午9:16:11
 * Copyright (c) 2017, 01113232@wisedu.com All Rights Reserved.
 *
*/

package com.wisedu.crowd.common.util.encrypt;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * ClassName:StringEncrypt <br/>
 * Function: TODO 字符加密（该加密不可逆）. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年8月25日 上午9:16:11 <br/>
 * @author   dell
 * @version  
 * @since    JDK 1.6
 * @see 	 
 */
public class StringEncrypt {

    /**
     * 
     * encrypt:(对字符串加密，SHA-256方式). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * TODO(这里描述这个方法的执行流程 – 可选).<br/>
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>
     *
     * @author dell
     * @param strSrc
     * @return
     * @since JDK 1.6
     */
    public static String encrypt(String strSrc) {
        return encrypt(strSrc, null);
    }

    /**
     * 
     * encrypt:(对字符串加密,加密算法使用MD5,SHA-1,SHA-256,默认使用SHA-256). <br/>
     * TODO(这里描述这个方法适用条件 – 可选).<br/>
     * TODO(这里描述这个方法的执行流程 – 可选).<br/>
     * TODO(这里描述这个方法的使用方法 – 可选).<br/>
     * TODO(这里描述这个方法的注意事项 – 可选).<br/>
     *
     * @author dell
     * @param strSrc 要加密的字符串
     * @param encName 加密类型
     * @return
     * @since JDK 1.6
     */
    public static String encrypt(String strSrc, String encName) {
        if (strSrc == null)
            return "";

        MessageDigest md = null;
        String strDes = null;

        byte[] bt = strSrc.getBytes();
        try {
            if (encName == null || encName.equals("")) {
                encName = "SHA-256";
            }
            md = MessageDigest.getInstance(encName);
            md.update(bt);
            strDes = bytes2Hex(md.digest()); // to HexString
        } catch (NoSuchAlgorithmException e) {
            return null;
        }
        return strDes;
    }

    public static String bytes2Hex(byte[] bts) {
        String des = "";
        String tmp = null;
        for (int i = 0; i < bts.length; i++) {
            tmp = (Integer.toHexString(bts[i] & 0xFF));
            if (tmp.length() == 1) {
                des += "0";
            }
            des += tmp;
        }
        return des;
    }

    public static void main(String args[]) {
        String s = StringEncrypt.encrypt("51324fc1c4be49fe8cabd86f34c713c3&crowduserinfo&DQFZR");
        System.out.println(s);
    }
}

