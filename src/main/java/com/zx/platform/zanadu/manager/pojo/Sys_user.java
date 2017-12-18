/***
 * @title: sys_user 
 * @author: seasonszx dev
 * @datetime: 2017-12-12 16:45:25
 * @version: 1.0.0
 */
package com.zx.platform.zanadu.manager.pojo;

import java.io.Serializable;

public class Sys_user implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;// 主键
	private String name;// 名称
	private Integer age;// 年龄
	private String password;// 密码
	private Integer status;// 状态
	private java.util.Date createtime;// 创建时间

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public java.util.Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(java.util.Date createtime) {
		this.createtime = createtime;
	}


	@Override
	public String toString() {
		return "Sys_user ["
					+ "id=" + id + " "
					+ "name=" + name + " "
					+ "age=" + age + " "
					+ "password=" + password + " "
					+ "status=" + status + " "
					+ "createtime=" + createtime + ", "
					+ "]";
	}

}
