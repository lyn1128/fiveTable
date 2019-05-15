/** 
 * <pre>项目名称:maven 
 * 文件名称:PowerMenuBean.java 
 * 包名:com.jk.fs.model.user 
 * 创建日期:2019年4月4日下午3:02:14 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model.user;


import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：PowerMenuBean    
 * 类描述：    
 * 创建人：刘玉娜
 * 创建时间：2019年4月4日 下午3:02:14    
 * 修改人：刘玉娜 1848123832@qq.om
 * 修改时间：2019年4月4日 下午3:02:14    
 * 修改备注：       
 * @version </pre>    
 */
public class PowerMenuBean implements Serializable {

	private Integer id;
	private String name;
	private String path;
	private String remark;
	private Integer powerId;

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

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getPowerId() {
		return powerId;
	}

	public void setPowerId(Integer powerId) {
		this.powerId = powerId;
	}

	@Override
	public String toString() {
		return "PowerMenuBean{" +
				"id=" + id +
				", name='" + name + '\'' +
				", path='" + path + '\'' +
				", remark='" + remark + '\'' +
				", powerId=" + powerId +
				'}';
	}
}
