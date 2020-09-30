package com.company.project.service.impl;

import com.company.project.dao.ArticleLogMapper;
import com.company.project.model.ArticleLog;
import com.company.project.service.ArticleLogService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2020/09/27.
 */
@Service
@Transactional
public class ArticleLogServiceImpl extends AbstractService<ArticleLog> implements ArticleLogService {
    @Resource
    private ArticleLogMapper tblArticleLogMapper;

}
