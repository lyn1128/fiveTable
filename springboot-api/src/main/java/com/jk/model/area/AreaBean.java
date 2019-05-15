/** 
 * <pre>项目名称:maven 
 * 文件名称:AreaBean.java 
 * 包名:com.jk.fs.model.area 
 * 创建日期:2019年4月2日下午1:46:54 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model.area;


import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：AreaBean    
 * 类描述：    
 * 创建人：刘玉娜
 * 创建时间：2019年4月2日 下午1:46:54    
 * 修改人：刘玉娜 1848123832@qq.om
 * 修改时间：2019年4月2日 下午1:46:54    
 * 修改备注：       
 * @version </pre>    
 */

public class AreaBean implements Serializable {

	private Integer id;
	private String name;
	private Integer pid;

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

	public Integer getPid() {
		return pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Override
	public String toString() {
		return "AreaBean{" +
				"id=" + id +
				", name='" + name + '\'' +
				", pid=" + pid +
				'}';
	}
}
