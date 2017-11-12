package cn.zx.pojo;

import java.util.Date;

public class Article {
    private Integer id;

    private String title;

    private Date pdate;

    private Integer comment;

    private Integer userid;

    private String cont;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Date pdate) {
        this.pdate = pdate;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getCont() {
        return cont;
    }

    public void setCont(String cont) {
        this.cont = cont == null ? null : cont.trim();
    }
}