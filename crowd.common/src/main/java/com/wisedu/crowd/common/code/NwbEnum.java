package com.wisedu.crowd.common.code;

/**
 * 内外不标志
 * @author wisedu
 *
 */
public enum NwbEnum {
		/**
		 * 外部
		 */
		WB("1","外部"),
		/**
		 * 内部
		 */
	    NB("2","内部");
	    private String    code;

	    private String name;

	    NwbEnum(String code, String name) {
	        this.code = code;
	        this.name = name;
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
