package com.wisedu.crowd.entity.datacode.xtgl;

/**
 * 系统参数  列表 
 * @author 11651
 *
 */
public enum XtcsbTypeEnum {

	XMGL_XMYSJDFKBL("XMGL_XMYSJDFKBL","项目验收时付款比例"),
	XMGL_SHJSXTZDPJSJJG("XMGL_SHJSXTZDPJSJJG","售后结束多少天系统自动评价"),
	XMGL_TBJGHDBL("XMGL_TBJGHDBL","投标价格上下浮动比例"),
	XMGL_YYPTYJSQBL("XMGL_YYPTYJSQBL"," 运营平台佣金收取比例"),
	XTGL_FJLJ("XTGL_FJLJ","附件路径"),
	/**
	 * 个人所得税起征点
	 */
	GRSDS_QZZ("GRSDS_QZZ","个人所得税起征点");

	private String code;
	private String name;
	XtcsbTypeEnum(String code,String name){
		this.code=code;	
		this.name=name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}