/** 
 * <pre>项目名称:maven 
 * 文件名称:Express.java 
 * 包名:com.jk.fs.model.express 
 * 创建日期:2019年4月11日下午10:12:52 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model.express;


import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：Express    
 * 类描述：    
 * 创建人：封帅
 * 创建时间：2019年4月11日 下午10:12:52    
 * 修改人：封帅 1848123832@qq.om
 * 修改时间：2019年4月11日 下午10:12:52    
 * 修改备注：       
 * @version </pre>    
 */
public class ExpressBean implements Serializable {

	private String time;
	private String ftime;
	private String context;
	private String location;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getFtime() {
		return ftime;
	}

	public void setFtime(String ftime) {
		this.ftime = ftime;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "ExpressBean{" +
				"time='" + time + '\'' +
				", ftime='" + ftime + '\'' +
				", context='" + context + '\'' +
				", location='" + location + '\'' +
				'}';
	}
}
