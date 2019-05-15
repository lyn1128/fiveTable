/** 
 * <pre>项目名称:maven 
 * 文件名称:Weather.java 
 * 包名:com.jk.model.weather
 * 创建日期:2019年4月12日下午1:28:36 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model.weather;

import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：Weather    
 * 类描述：    
 * 创建人：封帅
 * 创建时间：2019年4月12日 下午1:28:36    
 * 修改人：封帅 1848123832@qq.om
 * 修改时间：2019年4月12日 下午1:28:36    
 * 修改备注：       
 * @version </pre>    
 */
public class Weather implements Serializable {
	
	private String ymd;//日期
	private String week; //星期xx
	private String type; //天气type xx
	private String high; //高气温xx
	private String low; //最低气温xx
	private String fx; //风向xx,
	private String fl; //风力xx
	
	private String sunset;//日落
	private String sunrise;//日出
	private String parent;
	private String city;
	private String notice;

	public String getYmd() {
		return ymd;
	}

	public void setYmd(String ymd) {
		this.ymd = ymd;
	}

	public String getWeek() {
		return week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high;
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low;
	}

	public String getFx() {
		return fx;
	}

	public void setFx(String fx) {
		this.fx = fx;
	}

	public String getFl() {
		return fl;
	}

	public void setFl(String fl) {
		this.fl = fl;
	}

	public String getSunset() {
		return sunset;
	}

	public void setSunset(String sunset) {
		this.sunset = sunset;
	}

	public String getSunrise() {
		return sunrise;
	}

	public void setSunrise(String sunrise) {
		this.sunrise = sunrise;
	}

	public String getParent() {
		return parent;
	}

	public void setParent(String parent) {
		this.parent = parent;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}

	@Override
	public String toString() {
		return "Weather{" +
				"ymd='" + ymd + '\'' +
				", week='" + week + '\'' +
				", type='" + type + '\'' +
				", high='" + high + '\'' +
				", low='" + low + '\'' +
				", fx='" + fx + '\'' +
				", fl='" + fl + '\'' +
				", sunset='" + sunset + '\'' +
				", sunrise='" + sunrise + '\'' +
				", parent='" + parent + '\'' +
				", city='" + city + '\'' +
				", notice='" + notice + '\'' +
				'}';
	}
}
