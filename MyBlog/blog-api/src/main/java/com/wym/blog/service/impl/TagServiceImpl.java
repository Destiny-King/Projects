package com.wym.blog.service.impl;

import com.wym.blog.dao.mapper.TagMapper;
import com.wym.blog.dao.pojo.Tag;
import com.wym.blog.service.TagService;
import com.wym.blog.vo.TagVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TagServiceImpl implements TagService {

	@Autowired
	private TagMapper tagMapper;

	public TagVo copy(Tag tag) {
		TagVo tagVo = new TagVo();
		BeanUtils.copyProperties(tag, tagVo);
		return tagVo;
	}

	public List<TagVo> copyList(List<Tag> tagList) {
		List<TagVo> tagVoList = new ArrayList<>();
		for (Tag tag : tagList) {
			tagVoList.add(copy(tag));
		}
		return tagVoList;
	}

	@Override
	public List<TagVo> findTagsByArticleId(Long articleId) {
		List<Tag> tags = tagMapper.findTagsByArticleId(articleId);
		return copyList(tags);
	}
}
