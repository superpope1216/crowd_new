package com.wisedu.crowd.entity.yhgl;

import java.io.Serializable;

public class XqfxxScoreLog implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * WID
     */
    private String wid;

    /**
     * 需求方ID
     */
    private String xqfid;

    /**
     * 分类
     */
    private String classify;

    /**
     * 得分
     */
    private Integer score;

    /**
     * 原分数
     */
    private Integer yscore;

    /**
     * 现分数
     */
    private Integer xscore;

    /**
     * 创建时间
     */
    private String cjsj;

    /**
     * 说明
     */
    private String content;

    /**
     * WID
     * @return WID WID
     */
    public String getWid() {
        return wid;
    }

    /**
     * WID
     * @param wid WID
     */
    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    /**
     * 需求方ID
     * @return XQFID 需求方ID
     */
    public String getXqfid() {
        return xqfid;
    }

    /**
     * 需求方ID
     * @param xqfid 需求方ID
     */
    public void setXqfid(String xqfid) {
        this.xqfid = xqfid == null ? null : xqfid.trim();
    }

    /**
     * 分类
     * @return CLASSIFY 分类
     */
    public String getClassify() {
        return classify;
    }

    /**
     * 分类
     * @param classify 分类
     */
    public void setClassify(String classify) {
        this.classify = classify == null ? null : classify.trim();
    }

    /**
     * 得分
     * @return SCORE 得分
     */
    public Integer getScore() {
        return score;
    }

    /**
     * 得分
     * @param score 得分
     */
    public void setScore(Integer score) {
        this.score = score;
    }

    /**
     * 原分数
     * @return YSCORE 原分数
     */
    public Integer getYscore() {
        return yscore;
    }

    /**
     * 原分数
     * @param yscore 原分数
     */
    public void setYscore(Integer yscore) {
        this.yscore = yscore;
    }

    /**
     * 现分数
     * @return XSCORE 现分数
     */
    public Integer getXscore() {
        return xscore;
    }

    /**
     * 现分数
     * @param xscore 现分数
     */
    public void setXscore(Integer xscore) {
        this.xscore = xscore;
    }

    /**
     * 创建时间
     * @return CJSJ 创建时间
     */
    public String getCjsj() {
        return cjsj;
    }

    /**
     * 创建时间
     * @param cjsj 创建时间
     */
    public void setCjsj(String cjsj) {
        this.cjsj = cjsj == null ? null : cjsj.trim();
    }

    /**
     * 说明
     * @return CONTENT 说明
     */
    public String getContent() {
        return content;
    }

    /**
     * 说明
     * @param content 说明
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     *
     * @mbggenerated 2017-11-23
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", xqfid=").append(xqfid);
        sb.append(", classify=").append(classify);
        sb.append(", score=").append(score);
        sb.append(", yscore=").append(yscore);
        sb.append(", xscore=").append(xscore);
        sb.append(", cjsj=").append(cjsj);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}