package com.wisedu.crowd.entity.yhgl;

import java.io.Serializable;
import java.math.BigDecimal;

public class KfzxyjfxqInfo implements Serializable{
    /**
	 * serialVersionUID:TODO(用一句话描述这个变量表示什么).
	 * @since JDK 1.6
	 */
	private static final long serialVersionUID = 1L;

	/**
     * null
     */
    private String wid;

    /**
     * null
     */
    private String kfzid;

    /**
     * null
     */
    private String rwid;

    /**
     * null
     */
    private String scoreClassify;

    /**
     * null
     */
    private BigDecimal score;

    /**
     * null
     */
    private String content;

    /**
     * null
     */
    private BigDecimal totalScore;

    /**
     * null
     */
    private String cjsj;

    /**
     * null
     * @return WID null
     */
    public String getWid() {
        return wid;
    }

    /**
     * null
     * @param wid null
     */
    public void setWid(String wid) {
        this.wid = wid == null ? null : wid.trim();
    }

    /**
     * null
     * @return KFZID null
     */
    public String getKfzid() {
        return kfzid;
    }

    /**
     * null
     * @param kfzid null
     */
    public void setKfzid(String kfzid) {
        this.kfzid = kfzid == null ? null : kfzid.trim();
    }

    /**
     * null
     * @return RWID null
     */
    public String getRwid() {
        return rwid;
    }

    /**
     * null
     * @param rwid null
     */
    public void setRwid(String rwid) {
        this.rwid = rwid == null ? null : rwid.trim();
    }

    /**
     * null
     * @return SCORE_CLASSIFY null
     */
    public String getScoreClassify() {
        return scoreClassify;
    }

    /**
     * null
     * @param scoreClassify null
     */
    public void setScoreClassify(String scoreClassify) {
        this.scoreClassify = scoreClassify == null ? null : scoreClassify.trim();
    }

    /**
     * null
     * @return SCORE null
     */
    public BigDecimal getScore() {
        return score;
    }

    /**
     * null
     * @param score null
     */
    public void setScore(BigDecimal score) {
        this.score = score;
    }

    /**
     * null
     * @return CONTENT null
     */
    public String getContent() {
        return content;
    }

    /**
     * null
     * @param content null
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * null
     * @return TOTAL_SCORE null
     */
    public BigDecimal getTotalScore() {
        return totalScore;
    }

    /**
     * null
     * @param totalScore null
     */
    public void setTotalScore(BigDecimal totalScore) {
        this.totalScore = totalScore;
    }

    /**
     * null
     * @return CJSJ null
     */
    public String getCjsj() {
        return cjsj;
    }

    /**
     * null
     * @param cjsj null
     */
    public void setCjsj(String cjsj) {
        this.cjsj = cjsj == null ? null : cjsj.trim();
    }

    /**
     *
     * @mbggenerated 2018-01-24
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", wid=").append(wid);
        sb.append(", kfzid=").append(kfzid);
        sb.append(", rwid=").append(rwid);
        sb.append(", scoreClassify=").append(scoreClassify);
        sb.append(", score=").append(score);
        sb.append(", content=").append(content);
        sb.append(", totalScore=").append(totalScore);
        sb.append(", cjsj=").append(cjsj);
        sb.append("]");
        return sb.toString();
    }
}