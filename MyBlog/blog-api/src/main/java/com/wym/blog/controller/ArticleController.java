package com.wym.blog.controller;

import com.wym.blog.service.ArticleService;
import com.wym.blog.vo.Result;
import com.wym.blog.vo.params.PageParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//json数据进行交互
@RestController
@RequestMapping("articles")
public class ArticleController {

	@Autowired
	private ArticleService articleService;

	/**
	 * 首页 文章列表
	 *
	 * @param pageParams
	 */

	@PostMapping
	public Result listArticle(@RequestBody PageParams pageParams) {
		return articleService.listArticle(pageParams);
	}
}