<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script type="text/javascript" src="js/jquery-2.1.4.min.js"></script>
<script type="text/javascript" src="js/index.js"></script>
</head>
<body>
<h2>Hello World!</h2>
<div id="data"></div>

<table>
	<tr><td>id:</td><td><input type="text" id="id" value=""/></td></tr>
	<tr><td>name:</td><td><input type="text" id="name" value=""/></td></tr>
	<tr><td>age:</td><td><input type="text" id="age" value=""/></td></tr>
	<tr><td>password:</td><td><input type="text" id="password" value=""/></td></tr>
	<tr><td>status:</td><td><input type="text" id="status" value=""/></td></tr>
	<tr><td>createtime:</td><td><input type="text" id="createtime" value=""/></td></tr>
</table>


<button id="btn_add" onclick="Sys_user.add(Sys_user.baseInfo);">新增</button><br />
<button id="btn_add" onclick="Sys_user.upd(Sys_user.baseInfo);">修改</button><br />
<button id="btn_add" onclick="Sys_user.del(Sys_user.baseInfo);">删除</button>
<input type="text" id="delid"/>
<br />
<button id="btn_add" onclick="Sys_user.selectone();">单查</button>
<input type="text" id="oneid"/>
<br />
<button id="btn_add" onclick="Sys_user.selectall();">全查</button><br />
<button id="btn_add" onclick="Sys_user.search();">搜索</button><br />
</body>
</html>
