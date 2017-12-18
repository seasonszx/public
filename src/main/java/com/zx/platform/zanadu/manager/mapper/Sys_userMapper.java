package com.zx.platform.zanadu.manager.mapper;

import java.util.List;
import java.util.Map;

import com.zx.platform.zanadu.manager.pojo.Sys_user;

public interface Sys_userMapper {

	// 基本信息新增
	int insert(Sys_user info);

	// 基本信息修改
	int update(Sys_user info);

	// 主键删除
	int deleteByPrimaryKey(String primarykey);

	// 主键查询对象
	Sys_user selectByPrimaryKey(String primarykey);

	// 全查集合
	List<Sys_user> selectAll();

	// 条件查询集合
	List<Sys_user> selectByCondition(Map<String, Object> map);

}
