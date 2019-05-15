/** 
 * <pre>项目名称:maven 
 * 文件名称:DeptBean.java 
 * 包名:com.jk.fs.model.dept 
 * 创建日期:2019年4月2日上午11:35:35 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model.dept;

import java.io.Serializable;
import java.util.List;

import com.jk.model.nav.NavBean;


/** 
 * <pre>项目名称：maven    
 * 类名称：DeptBean    
 * 类描述：    
 * 创建人：刘玉娜
 * 创建时间：2019年4月2日 上午11:35:35    
 * 修改人：刘玉娜 1848123832@qq.om
 * 修改时间：2019年4月2日 上午11:35:35    
 * 修改备注：       
 * @version </pre>    
 */

public class DeptBean implements Serializable {

	
	private Integer id;

    private String text;

    private Integer pid;
    
    private List<DeptBean> children;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public List<DeptBean> getChildren() {
        return children;
    }

    public void setChildren(List<DeptBean> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "DeptBean{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", pid=" + pid +
                ", children=" + children +
                '}';
    }
}
