/** 
 * <pre>项目名称:maven 
 * 文件名称:RoleBean.java 
 * 包名:com.jk.fs.model.user 
 * 创建日期:2019年4月2日下午2:54:02 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model.user;


import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：RoleBean    
 * 类描述：    
 * 创建人：刘玉娜
 * 创建时间：2019年4月2日 下午2:54:02    
 * 修改人：刘玉娜 1848123832@qq.om
 * 修改时间：2019年4月2日 下午2:54:02    
 * 修改备注：       
 * @version </pre>    
 */
public class RoleBean implements Serializable {

	
	private String id;
	private String name;
	private String beizhu;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBeizhu() {
		return beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	@Override
	public String toString() {
		return "RoleBean{" +
				"id='" + id + '\'' +
				", name='" + name + '\'' +
				", beizhu='" + beizhu + '\'' +
				'}';
	}
}
