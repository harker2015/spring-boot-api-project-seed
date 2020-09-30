package com.company.project.web.v1;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.ArticleLog;
import com.company.project.service.ArticleLogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator on 2020/09/27.
*/
@RestController
@RequestMapping("/article/log")
public class ArticleLogController {
    @Resource
    private ArticleLogService articleLogService;

    @PostMapping("/add")
    public Result add(ArticleLog articleLog) {
        articleLogService.save(articleLog);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        articleLogService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ArticleLog articleLog) {
        articleLogService.update(articleLog);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ArticleLog articleLog = articleLogService.findById(id);
        return ResultGenerator.genSuccessResult(articleLog);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<ArticleLog> list = articleLogService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
