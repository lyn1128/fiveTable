/** 
 * <pre>项目名称:maven 
 * 文件名称:UserBean.java 
 * 包名:com.jk.fs.model.user 
 * 创建日期:2019年4月1日下午7:54:51 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.model.user;


import java.io.Serializable;

/** 
 * <pre>项目名称：maven    
 * 类名称：UserBean    
 * 类描述：    
 * 创建人：刘玉娜
 * 创建时间：2019年4月1日 下午7:54:51    
 * 修改人：刘玉娜 1848123832@qq.om
 * 修改时间：2019年4月1日 下午7:54:51    
 * 修改备注：
 *
 * @version </pre>
 */
public class UserBean implements Serializable {

	private Integer id;
	private String name;
	private String loginNumber;
	private String password;
	private Integer sex;
	private String birthday;
	
	private Integer deptId; //部门id
	private String deptName; //部门name
	
	private Integer status;//状态 1锁定 0正常
	private String detail;//简介
	private String email;
	private String handImg;
	
	private Integer province;//省id
	private String provinceName;//省name
	private Integer city;//城市id
	private String cityName;//城市name
	
	private String roleId;//角色id
	private String roleName;//角色name
	
	
	private String loginIp;

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

	public String getLoginNumber() {
		return loginNumber;
	}

	public void setLoginNumber(String loginNumber) {
		this.loginNumber = loginNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHandImg() {
		return handImg;
	}

	public void setHandImg(String handImg) {
		this.handImg = handImg;
	}

	public Integer getProvince() {
		return province;
	}

	public void setProvince(Integer province) {
		this.province = province;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

	public Integer getCity() {
		return city;
	}

	public void setCity(Integer city) {
		this.city = city;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getLoginIp() {
		return loginIp;
	}

	public void setLoginIp(String loginIp) {
		this.loginIp = loginIp;
	}

	@Override
	public String toString() {
		return "UserBean{" +
				"id=" + id +
				", name='" + name + '\'' +
				", loginNumber='" + loginNumber + '\'' +
				", password='" + password + '\'' +
				", sex=" + sex +
				", birthday='" + birthday + '\'' +
				", deptId=" + deptId +
				", deptName='" + deptName + '\'' +
				", status=" + status +
				", detail='" + detail + '\'' +
				", email='" + email + '\'' +
				", handImg='" + handImg + '\'' +
				", province=" + province +
				", provinceName='" + provinceName + '\'' +
				", city=" + city +
				", cityName='" + cityName + '\'' +
				", roleId='" + roleId + '\'' +
				", roleName='" + roleName + '\'' +
				", loginIp='" + loginIp + '\'' +
				'}';
	}
}
