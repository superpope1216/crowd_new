package com.wisedu.crowd.common.code;

public enum DictionaryEnum {

	T_CROWD_SJZD_RWKFKJ("T_CROWD_SJZD_RWKFKJ","开发框架"),
	
	T_CROWD_SJZD_RWXS("T_CROWD_SJZD_RWXS","需求形式"),
	
	T_CROWD_XMGL_ZJRWLX("T_CROWD_XMGL_ZJRWLX","需求类型"),
	T_CROWD_XMGL_YWX("T_CROWD_XMGL_YWX","产品业务线"),
	
	T_CROWD_SJZD_BOOLEAN("T_CROWD_SJZD_BOOLEAN","是否字典表"),
	T_CROWD_SJZD_GZXZ("T_CROWD_SJZD_GZXZ","工作现状"),
	T_CROWD_SJZD_KFZGZLX("T_CROWD_SJZD_KFZGZLX","开发者工作类别"),
	T_CROWD_SJZD_KFZSCJS("T_CROWD_SJZD_KFZSCJS","开发者擅长技术"),
	T_CROWD_SJZD_KFZGZNX("T_CROWD_SJZD_KFZGZNX","开发者工作年限"),
	T_CROWD_SJZD_KFZKXSJ("T_CROWD_SJZD_KFZKXSJ","开发者空闲时间"),
	T_CROWD_SJZD_USER_RANGE("T_CROWD_SJZD_USER_RANGE","用户类型表(个人,企业)"),
	T_CROWD_SJZD_SJD("T_CROWD_SJZD_SJD","时间段"),
	T_CROWD_SJZD_YWXLB("T_CROWD_SJZD_YWXLB","部门业务线"),
	T_CROWD_SJZD_RWJD_NEW("T_CROWD_SJZD_RWJD_NEW","任务进度"),
	T_CROWD_SJZD_JJRW("T_CROWD_SJZD_JJRW","任务紧急度"),
	T_CROWD_SJZD_PTJYJNFL("T_CROWD_SJZD_PTJYJNFL","平台建议技能分类"),
	T_CROWD_SJZD_PTJYZT("T_CROWD_SJZD_PTJYZT","建议状态"),
	
	T_CROWD_SJZD_PXKC("T_CROWD_SJZD_PXKC","培训课程"),
	T_CROWD_SJZD_KHJG("T_CROWD_SJZD_KHJG","培训考核结果"),
	
	T_CROWD_SJZD_NLPG("T_CROWD_SJZD_NLPG","能力评估"),
	
	T_CROWD_SJZD_BMZT("T_CROWD_SJZD_BMZT","报名状态"),
	
	T_CROWD_SJZD_YYKHZT("T_CROWD_SJZD_YYKHZT","预约考核状态"),
	
	T_CROWD_SJZD_PXZT("T_CROWD_SJZD_PXZT","培训状态"),
	
	T_CROWD_SJZD_PXRS("T_CROWD_SJZD_PXRS","培训人数"),
	
	T_CROWD_SJZD_PXLX("T_CROWD_SJZD_PXLX","培训类型"),
	T_CROWD_SJZD_PXFS("T_CROWD_SJZD_PXFS","培训方式"),
	T_CROWD_SJZD_PXBMZT("T_CROWD_SJZD_PXBMZT","培训报名状态"),
	
	T_CROWD_SJZD_RWLB("T_CROWD_SJZD_RWLB","任务类别"),
	T_CROWD_SJZD_ZYLB("T_CROWD_SJZD_ZYLB", "资源类别"),
	
	T_CROWD_SJZD_AREA("T_CROWD_SJZD_AREA","区域"),
	
	T_CROWD_SJZD_KFZZHSZLB("T_CROWD_SJZD_KFZZHSZLB","支付类别");
	
	
	
	
    private String code;

    private String name;

    DictionaryEnum(String code, String name) {
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
