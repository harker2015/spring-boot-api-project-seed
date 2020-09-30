package com.company.project.service;
import com.company.project.model.Article;
import com.company.project.core.Service;


/**
 * Created by CodeGenerator on 2020/09/27.
 */
public interface ArticleService extends Service<Article> {
    public static final Byte STATUS_UNPUB = 0;//未发布
    public static final Byte STATUS_PUBED = 1;//已发布
}
