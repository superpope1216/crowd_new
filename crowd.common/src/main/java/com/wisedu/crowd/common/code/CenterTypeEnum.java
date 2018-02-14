package com.wisedu.crowd.common.code;

public enum CenterTypeEnum {
	NORMAL("0","1"),
	
	NEW("1","1"),
	
	OLD("2","2");
    private String code;

    private String name;

    CenterTypeEnum(String code, String name) {
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
