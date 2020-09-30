package com.company.project.model;

import javax.persistence.*;

@Table(name = "tbl_article_log")
public class ArticleLog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 文章编号
     */
    @Column(name = "article_id")
    private Long articleId;

    /**
     * 日志标题
     */
    private String title;

    /**
     * 日志内容
     */
    private String content;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Integer createTime;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取文章编号
     *
     * @return article_id - 文章编号
     */
    public Long getArticleId() {
        return articleId;
    }

    /**
     * 设置文章编号
     *
     * @param articleId 文章编号
     */
    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    /**
     * 获取日志标题
     *
     * @return title - 日志标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置日志标题
     *
     * @param title 日志标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取日志内容
     *
     * @return content - 日志内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置日志内容
     *
     * @param content 日志内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }
}