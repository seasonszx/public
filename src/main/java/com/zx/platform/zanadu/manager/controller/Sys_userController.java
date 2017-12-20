package com.zx.platform.zanadu.manager.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zx.platform.zanadu.manager.pojo.Sys_user;
import com.zx.platform.zanadu.manager.service.Sys_userService;

@Controller
@RequestMapping("/sys_user")
public class Sys_userController {
	
	@Autowired
	private Sys_userService sys_userService;
	
	// 基本信息新增
	@RequestMapping(value = "/add",
			method = {RequestMethod.POST})
	@ResponseBody
	public Map<String, Object> add(@RequestBody Sys_user info) {
		Map<String, Object> map = new HashMap<>();
		int count = sys_userService.insert(info);
		map.put("count", count);
		return map;
	}
	
	// 基本信息修改
	@RequestMapping(value = "/upd",
			method = {RequestMethod.POST})
	@ResponseBody
	public Map<String, Object> upd(@RequestBody Sys_user info) {
		Map<String, Object> map = new HashMap<>();
		int count = sys_userService.update(info);
		map.put("count", count);
		return map;
	}
	
	// 主键删除
	@RequestMapping(value = "/del",
			method = {RequestMethod.POST})
	@ResponseBody
	public Map<String, Object> del(String primarykey) {
		Map<String, Object> map = new HashMap<>();
		int count = sys_userService.deleteByPrimaryKey(primarykey);
		map.put("count", count);
		return map;
	}
	
	// 主键查询对象
	@RequestMapping(value = "/selectone",
			method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> selectone(String primarykey) {
		Map<String, Object> map = new HashMap<>();
		Sys_user info = sys_userService.selectByPrimaryKey(primarykey);
		map.put("info", info);
		return map;
	}
	
	// 全查集合
	@RequestMapping(value = "/selectall",
			method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> selectall(HttpServletRequest request,HttpServletResponse response) {
		response.setHeader("Access-Control-Allow-Origin", "*");// 允许跨域访问
		//response.setHeader("Access-Control-Allow-Origin", "http://www.client.com"); 允许指定域访问
		HttpSession session = request.getSession();
		
		Map<String, Object> map = new HashMap<>();
		List<Sys_user> list = sys_userService.selectAll();
		
		session.setAttribute("login_user", list.get(0));
		
		map.put("list", list);
		return map;
	}
	
	// 条件查询集合
	@RequestMapping(value = "/search",
			method = {RequestMethod.POST,RequestMethod.GET})
	@ResponseBody
	public Map<String, Object> search(@RequestBody Map<String, Object> paramap) {
		Map<String, Object> map = new HashMap<>();
		List<Sys_user> list = sys_userService.selectByCondition(paramap);
		map.put("list", list);
		return map;
	}

}
