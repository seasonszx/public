package com.zx.platform.zanadu.manager.dto;

import java.io.Serializable;


public class Sys_userDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private int age;
	private int status;
	private String createtime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getStatusname() {
		return status==1?"正常":"失效";
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}

}
