package com.wym.blog.service;

import com.wym.blog.vo.Result;
import com.wym.blog.vo.params.PageParams;

public interface ArticleService {

	/**
	 * 分页查询 文章列表
	 *
	 * @param pageParams
	 * @return
	 */
	Result listArticle(PageParams pageParams);
}
