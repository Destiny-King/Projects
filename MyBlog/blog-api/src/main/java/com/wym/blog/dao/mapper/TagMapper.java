package com.wym.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wym.blog.dao.pojo.Tag;

import java.util.List;

public interface TagMapper extends BaseMapper<Tag> {
	/**
	 * 根据文章id查询标签标签
	 *
	 * @param articleId
	 * @return
	 */
	List<Tag> findTagsByArticleId(Long articleId);
}
