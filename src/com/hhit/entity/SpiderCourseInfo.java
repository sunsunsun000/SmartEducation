package com.hhit.entity;

//  Generated by StarUML(tm) Java Add-In
//
//  @ Project : Untitled
//  @ File Name : SpiderCourseInfo.java
//  @ Date : 2016/5/1
//  @ Author : 
//
//

public class SpiderCourseInfo {
	private Integer id;
	private String courseDesc;
	private SpiderCourse spiderCourse;

	/**
	 * 默认构造函数
	 */
	public SpiderCourseInfo() {

	}

	/**
	 * 构造函数
	 */
	public SpiderCourseInfo(String cd, SpiderCourse sc) {
		courseDesc = cd;
		spiderCourse = sc;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCourseDesc() {
		return courseDesc;
	}

	public void setCourseDesc(String courseDesc) {
		this.courseDesc = courseDesc;
	}

	public SpiderCourse getSpiderCourse() {
		return spiderCourse;
	}

	public void setSpiderCourse(SpiderCourse spiderCourse) {
		this.spiderCourse = spiderCourse;
	}

}
