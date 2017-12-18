package com.zx.platform.zanadu.manager.serviceimpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zx.platform.zanadu.manager.mapper.Sys_userMapper;
import com.zx.platform.zanadu.manager.pojo.Sys_user;
import com.zx.platform.zanadu.manager.service.Sys_userService;

@Service
public class Sys_userServiceImpl implements Sys_userService {

	@Autowired
	private Sys_userMapper sys_userMapper;
	
	// 基本信息新增服务
	@Override
	public int insert(Sys_user info) {
		return sys_userMapper.insert(info);
	}
	
	// 基本信息修改服务
	@Override
	public int update(Sys_user info) {
		return sys_userMapper.update(info);
	}

	// 主键删除服务
	@Override
	public int deleteByPrimaryKey(String primarykey) {
		return sys_userMapper.deleteByPrimaryKey(primarykey);
	}

	// 主键查询对象服务
	@Override
	public Sys_user selectByPrimaryKey(String primarykey) {
		return sys_userMapper.selectByPrimaryKey(primarykey);
	}

	// 全查集合服务
	@Override
	public List<Sys_user> selectAll() {
		return sys_userMapper.selectAll();
	}

	// 条件查询集合
	@Override
	public List<Sys_user> selectByCondition(Map<String, Object> map) {
		return sys_userMapper.selectByCondition(map);
	}
	

}
