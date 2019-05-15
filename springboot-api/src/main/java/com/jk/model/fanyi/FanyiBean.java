/** 
 * <pre>项目名称:maven 
 * 文件名称:FanyiBean.java 
 * 包名:com.jk.fs.model.fanyi 
 * 创建日期:2019年4月17日下午8:15:30 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model.fanyi;


import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：FanyiBean    
 * 类描述：    
 * 创建人：刘玉娜
 * 创建时间：2019年4月17日 下午8:15:30    
 * 修改人：刘玉娜 1848123832@qq.om
 * 修改时间：2019年4月17日 下午8:15:30    
 * 修改备注：       
 * @version </pre>    
 */
public class FanyiBean implements Serializable {

	private String src;
	
	private String tgt;

	public String getSrc() {
		return src;
	}

	public void setSrc(String src) {
		this.src = src;
	}

	public String getTgt() {
		return tgt;
	}

	public void setTgt(String tgt) {
		this.tgt = tgt;
	}

	@Override
	public String toString() {
		return "FanyiBean{" +
				"src='" + src + '\'' +
				", tgt='" + tgt + '\'' +
				'}';
	}
}
