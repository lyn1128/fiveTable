/** 
 * <pre>项目名称:maven 
 * 文件名称:RolePowerBean.java 
 * 包名:com.jk.fs.model.user 
 * 创建日期:2019年4月4日上午11:14:37 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model.user;


import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：RolePowerBean    
 * 类描述：    
 * 创建人：刘玉娜
 * 创建时间：2019年4月4日 上午11:14:37    
 * 修改人：刘玉娜 1848123832@qq.om
 * 修改时间：2019年4月4日 上午11:14:37    
 * 修改备注：       
 * @version </pre>    
 */
public class RolePowerBean implements Serializable {

	private Integer id;
	private Integer roleId;
	private Integer powerId;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getPowerId() {
		return powerId;
	}

	public void setPowerId(Integer powerId) {
		this.powerId = powerId;
	}

	@Override
	public String toString() {
		return "RolePowerBean{" +
				"id=" + id +
				", roleId=" + roleId +
				", powerId=" + powerId +
				'}';
	}
}
