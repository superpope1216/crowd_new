package com.wisedu.crowd.entity.yhgl;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class KfzxxInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;
    /**
     * 
     */
    private String wid;

    /**
     * 
     */
    private String yhid;

    /**
     * 姓名
     */
    private String xm;

    /**
     * 昵称
     */
    private String nc;

    /**
     * 身份证号
     */
    private String sfzjh;

    /**
     * 性别
     */
    private String xb;

    /**
     * 生日
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date csrq;

    /**
     * 所在地区
     */
    private String szdq;

    /**
     * 邮箱
     */
    private String dzyx;

    /**
     * QQ号
     */
    private String qq;

    /**
     * 微信号
     */
    private String wxh;

    /**
     * 支付宝账号
     */
    private String zfbzh;

    /**
     * 工作类别代码
     */
    private String gzlbdm;

    /**
     * 工作类别名称
     */
    private String gzlbmc;

    /**
     * 擅长技术代码
     */
    private String scjsdm;

    /**
     * 擅长技术名称
     */
    private String scjsmc;

    /**
     * 是否接受推荐
     */
    private Integer sfjstj;

    /**
     * 工作年限
     */
    private String gznx;

    /**
     * 工作经历
     */
    private String gzjl;

    /**
     * 项目经验
     */
    private String xmjy;

    /**
     * 作品展示链接
     */
    private String zslj;

    /**
     * 空闲时间
     */
    private String kxsjid;

    /**
     * 工作现状
     */
    private String gzxz;

    /**
     * 
     */
    private String shzt;

    /**
     * 审核意见
     */
    private String shyj;

    /**
     * 身份证正面照附件ID
     */
    private String sfzzmztjid;

    /**
     * 身份证反面照附件ID
     */
    private String sfzfmztjid;

    /**
     * 授权书照片附件ID
     */
    private String sqszpfjid;

    /**
     * 个人照片附件ID
     */
    private String grzpfjid;

    /**
     * 是否有团队
     */
    private Integer sfytd;

    /**
     * 是否同意开发者协议
     */
    private Integer sftykfzxy;

    /**
     * 团队人数
     */
    private Integer tdrs;

    /**
     * 操作时间
     */
    private Date czsj;

    /**
     * 
     */
    private String czzip;

    /**
     * 账户余额
     */
    private BigDecimal zhye;

    /**
     * 开发者类别
     */
    private String kfzlb;

    /**
     * 其他技能
     */
    private String qtjn;

    /**
     * 冻结余额
     */
    private BigDecimal djye;

    /**
     * 教育工作年限
     */
    private String jygznx;

    /**
     * 所属业务线
     */
    private Integer ssywx;

    /**
     * 工号
     */
    private String gh;

    /**
     * 所属分公司
     */
    private String ssfgs;

    /**
     * 开发者类型
     */
    private String kfzlx;

    /**
     * 是否参与工资结算
     */
    private String sfcygzjs;

    /**
     * 所属开发中心
     */
    private String sskfzx;

    /**
     * 人员性质
     */
    private String ryxz;

    /**
     * PER_PROVINCE
     */
    private String perProvince;

    /**
     * 常住市
     */
    private String perCity;

    /**
     * 常住区
     */
    private String perArea;

    /**
     * 
     */
    private Integer version;

    /**
     * 是否有发票
     */
    private Integer sfyfp;

    /**
     * 任务形式
     */
    private String rwxs;

    /**
     * 
     */
    private String rwkfkj;

    /**
     * 企业法人名称(公司名称)
     */
    private String companyMc;

    /**
     * 企业资质类型
     */
    private String enterpriseQualificateType;

    /**
     * 营业执照扫描件
     */
    private String businessLicenceScanner;

    /**
     * 营业执照号
     */
    private String businessLicenceNo;

    /**
     * 组织机构代码扫描件
     */
    private String organizateCodeScanner;

    /**
     * 组织机构代码
     */
    private String organizateCodeNo;

    /**
     * 税务登记扫描件
     */
    private String taxRegistrationScanner;

    /**
     * 税务登记证号
     */
    private String taxRegistrationNo;

    /**
     * 统一社会信用代码
     */
    private String socialCreditCode;

    /**
     * 
     * @return WID 
     */
    public String getWid() {
        return wid;
    }

    /**
     * 
     * @param wid 
     */
    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    /**
     * 
     * @return YHID 
     */
    public String getYhid() {
        return yhid;
    }

    /**
     * 
     * @param yhid 
     */
    public void setYhid(String yhid) {
        this.yhid = yhid == null ? null : yhid.trim();
    }

    /**
     * 姓名
     * @return XM 姓名
     */
    public String getXm() {
        return xm;
    }

    /**
     * 姓名
     * @param xm 姓名
     */
    public void setXm(String xm) {
        this.xm = xm == null ? null : xm.trim();
    }

    /**
     * 昵称
     * @return NC 昵称
     */
    public String getNc() {
        return nc;
    }

    /**
     * 昵称
     * @param nc 昵称
     */
    public void setNc(String nc) {
        this.nc = nc == null ? null : nc.trim();
    }

    /**
     * 身份证号
     * @return SFZJH 身份证号
     */
    public String getSfzjh() {
        return sfzjh;
    }

    /**
     * 身份证号
     * @param sfzjh 身份证号
     */
    public void setSfzjh(String sfzjh) {
        this.sfzjh = sfzjh == null ? null : sfzjh.trim();
    }

    /**
     * 性别
     * @return XB 性别
     */
    public String getXb() {
        return xb;
    }

    /**
     * 性别
     * @param xb 性别
     */
    public void setXb(String xb) {
        this.xb = xb == null ? null : xb.trim();
    }

    /**
     * 生日
     * @return CSRQ 生日
     */
    public Date getCsrq() {
        return csrq;
    }

    /**
     * 生日
     * @param csrq 生日
     */
    public void setCsrq(Date csrq) {
        this.csrq = csrq;
    }

    /**
     * 所在地区
     * @return SZDQ 所在地区
     */
    public String getSzdq() {
        return szdq;
    }

    /**
     * 所在地区
     * @param szdq 所在地区
     */
    public void setSzdq(String szdq) {
        this.szdq = szdq == null ? null : szdq.trim();
    }

    /**
     * 邮箱
     * @return DZYX 邮箱
     */
    public String getDzyx() {
        return dzyx;
    }

    /**
     * 邮箱
     * @param dzyx 邮箱
     */
    public void setDzyx(String dzyx) {
        this.dzyx = dzyx == null ? null : dzyx.trim();
    }

    /**
     * QQ号
     * @return QQ QQ号
     */
    public String getQq() {
        return qq;
    }

    /**
     * QQ号
     * @param qq QQ号
     */
    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    /**
     * 微信号
     * @return WXH 微信号
     */
    public String getWxh() {
        return wxh;
    }

    /**
     * 微信号
     * @param wxh 微信号
     */
    public void setWxh(String wxh) {
        this.wxh = wxh == null ? null : wxh.trim();
    }

    /**
     * 支付宝账号
     * @return ZFBZH 支付宝账号
     */
    public String getZfbzh() {
        return zfbzh;
    }

    /**
     * 支付宝账号
     * @param zfbzh 支付宝账号
     */
    public void setZfbzh(String zfbzh) {
        this.zfbzh = zfbzh == null ? null : zfbzh.trim();
    }

    /**
     * 工作类别代码
     * @return GZLBDM 工作类别代码
     */
    public String getGzlbdm() {
        return gzlbdm;
    }

    /**
     * 工作类别代码
     * @param gzlbdm 工作类别代码
     */
    public void setGzlbdm(String gzlbdm) {
        this.gzlbdm = gzlbdm == null ? null : gzlbdm.trim();
    }

    /**
     * 工作类别名称
     * @return GZLBMC 工作类别名称
     */
    public String getGzlbmc() {
        return gzlbmc;
    }

    /**
     * 工作类别名称
     * @param gzlbmc 工作类别名称
     */
    public void setGzlbmc(String gzlbmc) {
        this.gzlbmc = gzlbmc == null ? null : gzlbmc.trim();
    }

    /**
     * 擅长技术代码
     * @return SCJSDM 擅长技术代码
     */
    public String getScjsdm() {
        return scjsdm;
    }

    /**
     * 擅长技术代码
     * @param scjsdm 擅长技术代码
     */
    public void setScjsdm(String scjsdm) {
        this.scjsdm = scjsdm == null ? null : scjsdm.trim();
    }

    /**
     * 擅长技术名称
     * @return SCJSMC 擅长技术名称
     */
    public String getScjsmc() {
        return scjsmc;
    }

    /**
     * 擅长技术名称
     * @param scjsmc 擅长技术名称
     */
    public void setScjsmc(String scjsmc) {
        this.scjsmc = scjsmc == null ? null : scjsmc.trim();
    }

    /**
     * 是否接受推荐
     * @return SFJSTJ 是否接受推荐
     */
    public Integer getSfjstj() {
        return sfjstj;
    }

    /**
     * 是否接受推荐
     * @param sfjstj 是否接受推荐
     */
    public void setSfjstj(Integer sfjstj) {
        this.sfjstj = sfjstj;
    }

    /**
     * 工作年限
     * @return GZNX 工作年限
     */
    public String getGznx() {
        return gznx;
    }

    /**
     * 工作年限
     * @param gznx 工作年限
     */
    public void setGznx(String gznx) {
        this.gznx = gznx == null ? null : gznx.trim();
    }

    /**
     * 工作经历
     * @return GZJL 工作经历
     */
    public String getGzjl() {
        return gzjl;
    }

    /**
     * 工作经历
     * @param gzjl 工作经历
     */
    public void setGzjl(String gzjl) {
        this.gzjl = gzjl == null ? null : gzjl.trim();
    }

    /**
     * 项目经验
     * @return XMJY 项目经验
     */
    public String getXmjy() {
        return xmjy;
    }

    /**
     * 项目经验
     * @param xmjy 项目经验
     */
    public void setXmjy(String xmjy) {
        this.xmjy = xmjy == null ? null : xmjy.trim();
    }

    /**
     * 作品展示链接
     * @return ZSLJ 作品展示链接
     */
    public String getZslj() {
        return zslj;
    }

    /**
     * 作品展示链接
     * @param zslj 作品展示链接
     */
    public void setZslj(String zslj) {
        this.zslj = zslj == null ? null : zslj.trim();
    }

    /**
     * 空闲时间
     * @return KXSJID 空闲时间
     */
    public String getKxsjid() {
        return kxsjid;
    }

    /**
     * 空闲时间
     * @param kxsjid 空闲时间
     */
    public void setKxsjid(String kxsjid) {
        this.kxsjid = kxsjid == null ? null : kxsjid.trim();
    }

    /**
     * 工作现状
     * @return GZXZ 工作现状
     */
    public String getGzxz() {
        return gzxz;
    }

    /**
     * 工作现状
     * @param gzxz 工作现状
     */
    public void setGzxz(String gzxz) {
        this.gzxz = gzxz == null ? null : gzxz.trim();
    }

    /**
     * 
     * @return SHZT 
     */
    public String getShzt() {
        return shzt;
    }

    /**
     * 
     * @param shzt 
     */
    public void setShzt(String shzt) {
        this.shzt = shzt == null ? null : shzt.trim();
    }

    /**
     * 审核意见
     * @return SHYJ 审核意见
     */
    public String getShyj() {
        return shyj;
    }

    /**
     * 审核意见
     * @param shyj 审核意见
     */
    public void setShyj(String shyj) {
        this.shyj = shyj == null ? null : shyj.trim();
    }

    /**
     * 身份证正面照附件ID
     * @return SFZZMZTJID 身份证正面照附件ID
     */
    public String getSfzzmztjid() {
        return sfzzmztjid;
    }

    /**
     * 身份证正面照附件ID
     * @param sfzzmztjid 身份证正面照附件ID
     */
    public void setSfzzmztjid(String sfzzmztjid) {
        this.sfzzmztjid = sfzzmztjid == null ? null : sfzzmztjid.trim();
    }

    /**
     * 身份证反面照附件ID
     * @return SFZFMZTJID 身份证反面照附件ID
     */
    public String getSfzfmztjid() {
        return sfzfmztjid;
    }

    /**
     * 身份证反面照附件ID
     * @param sfzfmztjid 身份证反面照附件ID
     */
    public void setSfzfmztjid(String sfzfmztjid) {
        this.sfzfmztjid = sfzfmztjid == null ? null : sfzfmztjid.trim();
    }

    /**
     * 授权书照片附件ID
     * @return SQSZPFJID 授权书照片附件ID
     */
    public String getSqszpfjid() {
        return sqszpfjid;
    }

    /**
     * 授权书照片附件ID
     * @param sqszpfjid 授权书照片附件ID
     */
    public void setSqszpfjid(String sqszpfjid) {
        this.sqszpfjid = sqszpfjid == null ? null : sqszpfjid.trim();
    }

    /**
     * 个人照片附件ID
     * @return GRZPFJID 个人照片附件ID
     */
    public String getGrzpfjid() {
        return grzpfjid;
    }

    /**
     * 个人照片附件ID
     * @param grzpfjid 个人照片附件ID
     */
    public void setGrzpfjid(String grzpfjid) {
        this.grzpfjid = grzpfjid == null ? null : grzpfjid.trim();
    }

    /**
     * 是否有团队
     * @return SFYTD 是否有团队
     */
    public Integer getSfytd() {
        return sfytd;
    }

    /**
     * 是否有团队
     * @param sfytd 是否有团队
     */
    public void setSfytd(Integer sfytd) {
        this.sfytd = sfytd;
    }

    /**
     * 是否同意开发者协议
     * @return SFTYKFZXY 是否同意开发者协议
     */
    public Integer getSftykfzxy() {
        return sftykfzxy;
    }

    /**
     * 是否同意开发者协议
     * @param sftykfzxy 是否同意开发者协议
     */
    public void setSftykfzxy(Integer sftykfzxy) {
        this.sftykfzxy = sftykfzxy;
    }

    /**
     * 团队人数
     * @return TDRS 团队人数
     */
    public Integer getTdrs() {
        return tdrs;
    }

    /**
     * 团队人数
     * @param tdrs 团队人数
     */
    public void setTdrs(Integer tdrs) {
        this.tdrs = tdrs;
    }

    /**
     * 操作时间
     * @return CZSJ 操作时间
     */
    public Date getCzsj() {
        return czsj;
    }

    /**
     * 操作时间
     * @param czsj 操作时间
     */
    public void setCzsj(Date czsj) {
        this.czsj = czsj;
    }

    /**
     * 
     * @return CZZIP 
     */
    public String getCzzip() {
        return czzip;
    }

    /**
     * 
     * @param czzip 
     */
    public void setCzzip(String czzip) {
        this.czzip = czzip == null ? null : czzip.trim();
    }

    /**
     * 账户余额
     * @return ZHYE 账户余额
     */
    public BigDecimal getZhye() {
        return zhye;
    }

    /**
     * 账户余额
     * @param zhye 账户余额
     */
    public void setZhye(BigDecimal zhye) {
        this.zhye = zhye;
    }

    /**
     * 开发者类别
     * @return KFZLB 开发者类别
     */
    public String getKfzlb() {
        return kfzlb;
    }

    /**
     * 开发者类别
     * @param kfzlb 开发者类别
     */
    public void setKfzlb(String kfzlb) {
        this.kfzlb = kfzlb == null ? null : kfzlb.trim();
    }

    /**
     * 其他技能
     * @return QTJN 其他技能
     */
    public String getQtjn() {
        return qtjn;
    }

    /**
     * 其他技能
     * @param qtjn 其他技能
     */
    public void setQtjn(String qtjn) {
        this.qtjn = qtjn == null ? null : qtjn.trim();
    }

    /**
     * 冻结余额
     * @return DJYE 冻结余额
     */
    public BigDecimal getDjye() {
        return djye;
    }

    /**
     * 冻结余额
     * @param djye 冻结余额
     */
    public void setDjye(BigDecimal djye) {
        this.djye = djye;
    }

    /**
     * 教育工作年限
     * @return JYGZNX 教育工作年限
     */
    public String getJygznx() {
        return jygznx;
    }

    /**
     * 教育工作年限
     * @param jygznx 教育工作年限
     */
    public void setJygznx(String jygznx) {
        this.jygznx = jygznx == null ? null : jygznx.trim();
    }

    /**
     * 所属业务线
     * @return SSYWX 所属业务线
     */
    public Integer getSsywx() {
        return ssywx;
    }

    /**
     * 所属业务线
     * @param ssywx 所属业务线
     */
    public void setSsywx(Integer ssywx) {
        this.ssywx = ssywx;
    }

    /**
     * 工号
     * @return GH 工号
     */
    public String getGh() {
        return gh;
    }

    /**
     * 工号
     * @param gh 工号
     */
    public void setGh(String gh) {
        this.gh = gh == null ? null : gh.trim();
    }

    /**
     * 所属分公司
     * @return SSFGS 所属分公司
     */
    public String getSsfgs() {
        return ssfgs;
    }

    /**
     * 所属分公司
     * @param ssfgs 所属分公司
     */
    public void setSsfgs(String ssfgs) {
        this.ssfgs = ssfgs == null ? null : ssfgs.trim();
    }

    /**
     * 开发者类型
     * @return KFZLX 开发者类型
     */
    public String getKfzlx() {
        return kfzlx;
    }

    /**
     * 开发者类型
     * @param kfzlx 开发者类型
     */
    public void setKfzlx(String kfzlx) {
        this.kfzlx = kfzlx == null ? null : kfzlx.trim();
    }

    /**
     * 是否参与工资结算
     * @return SFCYGZJS 是否参与工资结算
     */
    public String getSfcygzjs() {
        return sfcygzjs;
    }

    /**
     * 是否参与工资结算
     * @param sfcygzjs 是否参与工资结算
     */
    public void setSfcygzjs(String sfcygzjs) {
        this.sfcygzjs = sfcygzjs == null ? null : sfcygzjs.trim();
    }

    /**
     * 所属开发中心
     * @return SSKFZX 所属开发中心
     */
    public String getSskfzx() {
        return sskfzx;
    }

    /**
     * 所属开发中心
     * @param sskfzx 所属开发中心
     */
    public void setSskfzx(String sskfzx) {
        this.sskfzx = sskfzx == null ? null : sskfzx.trim();
    }

    /**
     * 人员性质
     * @return RYXZ 人员性质
     */
    public String getRyxz() {
        return ryxz;
    }

    /**
     * 人员性质
     * @param ryxz 人员性质
     */
    public void setRyxz(String ryxz) {
        this.ryxz = ryxz == null ? null : ryxz.trim();
    }

    /**
     * PER_PROVINCE
     * @return PER_PROVINCE PER_PROVINCE
     */
    public String getPerProvince() {
        return perProvince;
    }

    /**
     * PER_PROVINCE
     * @param perProvince PER_PROVINCE
     */
    public void setPerProvince(String perProvince) {
        this.perProvince = perProvince == null ? null : perProvince.trim();
    }

    /**
     * 常住市
     * @return PER_CITY 常住市
     */
    public String getPerCity() {
        return perCity;
    }

    /**
     * 常住市
     * @param perCity 常住市
     */
    public void setPerCity(String perCity) {
        this.perCity = perCity == null ? null : perCity.trim();
    }

    /**
     * 常住区
     * @return PER_AREA 常住区
     */
    public String getPerArea() {
        return perArea;
    }

    /**
     * 常住区
     * @param perArea 常住区
     */
    public void setPerArea(String perArea) {
        this.perArea = perArea == null ? null : perArea.trim();
    }

    /**
     * 
     * @return VERSION 
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * 
     * @param version 
     */
    public void setVersion(Integer version) {
        this.version = version;
    }

    /**
     * 是否有发票
     * @return SFYFP 是否有发票
     */
    public Integer getSfyfp() {
        return sfyfp;
    }

    /**
     * 是否有发票
     * @param sfyfp 是否有发票
     */
    public void setSfyfp(Integer sfyfp) {
        this.sfyfp = sfyfp;
    }

    /**
     * 任务形式
     * @return RWXS 任务形式
     */
    public String getRwxs() {
        return rwxs;
    }

    /**
     * 任务形式
     * @param rwxs 任务形式
     */
    public void setRwxs(String rwxs) {
        this.rwxs = rwxs == null ? null : rwxs.trim();
    }

    /**
     * 
     * @return RWKFKJ 
     */
    public String getRwkfkj() {
        return rwkfkj;
    }

    /**
     * 
     * @param rwkfkj 
     */
    public void setRwkfkj(String rwkfkj) {
        this.rwkfkj = rwkfkj == null ? null : rwkfkj.trim();
    }

    /**
     * 企业法人名称(公司名称)
     * @return COMPANY_MC 企业法人名称(公司名称)
     */
    public String getCompanyMc() {
        return companyMc;
    }

    /**
     * 企业法人名称(公司名称)
     * @param companyMc 企业法人名称(公司名称)
     */
    public void setCompanyMc(String companyMc) {
        this.companyMc = companyMc == null ? null : companyMc.trim();
    }

    /**
     * 企业资质类型
     * @return ENTERPRISE_QUALIFICATE_TYPE 企业资质类型
     */
    public String getEnterpriseQualificateType() {
        return enterpriseQualificateType;
    }

    /**
     * 企业资质类型
     * @param enterpriseQualificateType 企业资质类型
     */
    public void setEnterpriseQualificateType(String enterpriseQualificateType) {
        this.enterpriseQualificateType = enterpriseQualificateType == null ? null : enterpriseQualificateType.trim();
    }

    /**
     * 营业执照扫描件
     * @return BUSINESS_LICENCE_SCANNER 营业执照扫描件
     */
    public String getBusinessLicenceScanner() {
        return businessLicenceScanner;
    }

    /**
     * 营业执照扫描件
     * @param businessLicenceScanner 营业执照扫描件
     */
    public void setBusinessLicenceScanner(String businessLicenceScanner) {
        this.businessLicenceScanner = businessLicenceScanner == null ? null : businessLicenceScanner.trim();
    }

    /**
     * 营业执照号
     * @return BUSINESS_LICENCE_NO 营业执照号
     */
    public String getBusinessLicenceNo() {
        return businessLicenceNo;
    }

    /**
     * 营业执照号
     * @param businessLicenceNo 营业执照号
     */
    public void setBusinessLicenceNo(String businessLicenceNo) {
        this.businessLicenceNo = businessLicenceNo == null ? null : businessLicenceNo.trim();
    }

    /**
     * 组织机构代码扫描件
     * @return ORGANIZATE_CODE_SCANNER 组织机构代码扫描件
     */
    public String getOrganizateCodeScanner() {
        return organizateCodeScanner;
    }

    /**
     * 组织机构代码扫描件
     * @param organizateCodeScanner 组织机构代码扫描件
     */
    public void setOrganizateCodeScanner(String organizateCodeScanner) {
        this.organizateCodeScanner = organizateCodeScanner == null ? null : organizateCodeScanner.trim();
    }

    /**
     * 组织机构代码
     * @return ORGANIZATE_CODE_NO 组织机构代码
     */
    public String getOrganizateCodeNo() {
        return organizateCodeNo;
    }

    /**
     * 组织机构代码
     * @param organizateCodeNo 组织机构代码
     */
    public void setOrganizateCodeNo(String organizateCodeNo) {
        this.organizateCodeNo = organizateCodeNo == null ? null : organizateCodeNo.trim();
    }

    /**
     * 税务登记扫描件
     * @return TAX_REGISTRATION_SCANNER 税务登记扫描件
     */
    public String getTaxRegistrationScanner() {
        return taxRegistrationScanner;
    }

    /**
     * 税务登记扫描件
     * @param taxRegistrationScanner 税务登记扫描件
     */
    public void setTaxRegistrationScanner(String taxRegistrationScanner) {
        this.taxRegistrationScanner = taxRegistrationScanner == null ? null : taxRegistrationScanner.trim();
    }

    /**
     * 税务登记证号
     * @return TAX_REGISTRATION_NO 税务登记证号
     */
    public String getTaxRegistrationNo() {
        return taxRegistrationNo;
    }

    /**
     * 税务登记证号
     * @param taxRegistrationNo 税务登记证号
     */
    public void setTaxRegistrationNo(String taxRegistrationNo) {
        this.taxRegistrationNo = taxRegistrationNo == null ? null : taxRegistrationNo.trim();
    }

    /**
     * 统一社会信用代码
     * @return SOCIAL_CREDIT_CODE 统一社会信用代码
     */
    public String getSocialCreditCode() {
        return socialCreditCode;
    }

    /**
     * 统一社会信用代码
     * @param socialCreditCode 统一社会信用代码
     */
    public void setSocialCreditCode(String socialCreditCode) {
        this.socialCreditCode = socialCreditCode == null ? null : socialCreditCode.trim();
    }

    /**
     *
     * @mbggenerated 2018-01-11
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", yhid=").append(yhid);
        sb.append(", xm=").append(xm);
        sb.append(", nc=").append(nc);
        sb.append(", sfzjh=").append(sfzjh);
        sb.append(", xb=").append(xb);
        sb.append(", csrq=").append(csrq);
        sb.append(", szdq=").append(szdq);
        sb.append(", dzyx=").append(dzyx);
        sb.append(", qq=").append(qq);
        sb.append(", wxh=").append(wxh);
        sb.append(", zfbzh=").append(zfbzh);
        sb.append(", gzlbdm=").append(gzlbdm);
        sb.append(", gzlbmc=").append(gzlbmc);
        sb.append(", scjsdm=").append(scjsdm);
        sb.append(", scjsmc=").append(scjsmc);
        sb.append(", sfjstj=").append(sfjstj);
        sb.append(", gznx=").append(gznx);
        sb.append(", gzjl=").append(gzjl);
        sb.append(", xmjy=").append(xmjy);
        sb.append(", zslj=").append(zslj);
        sb.append(", kxsjid=").append(kxsjid);
        sb.append(", gzxz=").append(gzxz);
        sb.append(", shzt=").append(shzt);
        sb.append(", shyj=").append(shyj);
        sb.append(", sfzzmztjid=").append(sfzzmztjid);
        sb.append(", sfzfmztjid=").append(sfzfmztjid);
        sb.append(", sqszpfjid=").append(sqszpfjid);
        sb.append(", grzpfjid=").append(grzpfjid);
        sb.append(", sfytd=").append(sfytd);
        sb.append(", sftykfzxy=").append(sftykfzxy);
        sb.append(", tdrs=").append(tdrs);
        sb.append(", czsj=").append(czsj);
        sb.append(", czzip=").append(czzip);
        sb.append(", zhye=").append(zhye);
        sb.append(", kfzlb=").append(kfzlb);
        sb.append(", qtjn=").append(qtjn);
        sb.append(", djye=").append(djye);
        sb.append(", jygznx=").append(jygznx);
        sb.append(", ssywx=").append(ssywx);
        sb.append(", gh=").append(gh);
        sb.append(", ssfgs=").append(ssfgs);
        sb.append(", kfzlx=").append(kfzlx);
        sb.append(", sfcygzjs=").append(sfcygzjs);
        sb.append(", sskfzx=").append(sskfzx);
        sb.append(", ryxz=").append(ryxz);
        sb.append(", perProvince=").append(perProvince);
        sb.append(", perCity=").append(perCity);
        sb.append(", perArea=").append(perArea);
        sb.append(", version=").append(version);
        sb.append(", sfyfp=").append(sfyfp);
        sb.append(", rwxs=").append(rwxs);
        sb.append(", rwkfkj=").append(rwkfkj);
        sb.append(", companyMc=").append(companyMc);
        sb.append(", enterpriseQualificateType=").append(enterpriseQualificateType);
        sb.append(", businessLicenceScanner=").append(businessLicenceScanner);
        sb.append(", businessLicenceNo=").append(businessLicenceNo);
        sb.append(", organizateCodeScanner=").append(organizateCodeScanner);
        sb.append(", organizateCodeNo=").append(organizateCodeNo);
        sb.append(", taxRegistrationScanner=").append(taxRegistrationScanner);
        sb.append(", taxRegistrationNo=").append(taxRegistrationNo);
        sb.append(", socialCreditCode=").append(socialCreditCode);
        sb.append("]");
        return sb.toString();
    }
}