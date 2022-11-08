package com.wym.blog.service;

import com.wym.blog.dao.pojo.SysUser;

public interface SysUserService {

	SysUser findUserById(Long id);
}
