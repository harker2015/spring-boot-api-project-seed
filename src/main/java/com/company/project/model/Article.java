package com.company.project.model;

import com.company.project.component.annotation.IsMobile;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

@Table(name = "tbl_article")
public class Article {
    /**
     * 文章编号
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 文章标题
     */
    @Min(value = 3, message = "最小值不能小于山")
    @NotNull(message = "不能为空，大佬")
    private String title;

    /**
     * 0：未发布 1：已发布
     */
    private Byte status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Integer createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Integer updateTime;

    /**
     * 是否删除(0:否,1:是)
     */
    @Column(name = "is_deleted")
    private Byte isDeleted;

    /**
     * 文章内容
     */
    @IsMobile
    private String content;

    /**
     * 获取文章编号
     *
     * @return id - 文章编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置文章编号
     *
     * @param id 文章编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取文章标题
     *
     * @return title - 文章标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置文章标题
     *
     * @param title 文章标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取0：未发布 1：已发布
     *
     * @return status - 0：未发布 1：已发布
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置0：未发布 1：已发布
     *
     * @param status 0：未发布 1：已发布
     */
    public void setStatus(Byte status) {
        this.status = status;
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

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取是否删除(0:否,1:是)
     *
     * @return is_deleted - 是否删除(0:否,1:是)
     */
    public Byte getIsDeleted() {
        return isDeleted;
    }

    /**
     * 设置是否删除(0:否,1:是)
     *
     * @param isDeleted 是否删除(0:否,1:是)
     */
    public void setIsDeleted(Byte isDeleted) {
        this.isDeleted = isDeleted;
    }

    /**
     * 获取文章内容
     *
     * @return content - 文章内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置文章内容
     *
     * @param content 文章内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}