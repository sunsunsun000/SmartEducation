package com.hhit.entity;

import java.sql.Timestamp;
import java.util.Set;

//
//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : Role.java
//  @ Date : 2016/3/25
//  @ Author : 
//
//

public class Role implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String roleName;
	private String description;
	private Timestamp addTime;

	private Set<Privilege> privileges;
	private Set<Teacher> teachers;

	/**
	 * 默认构造函数,用户初始化，有重载则不可缺少
	 */
	public Role() {

	}

	public Role(String rN, String desc, Timestamp aD) {
		roleName = rN;
		description = desc;
		addTime = aD;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<Privilege> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(Set<Privilege> privileges) {
		this.privileges = privileges;
	}

	public Timestamp getAddTime() {
		return addTime;
	}

	public void setAddTime(Timestamp addTime) {
		this.addTime = addTime;
	}

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

}
