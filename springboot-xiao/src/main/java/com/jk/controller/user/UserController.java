/** 
 * <pre>项目名称:maven 
 * 文件名称:UserController.java 
 * 包名:com.jk.controller.user
 * 创建日期:2019年4月2日上午11:32:05 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.controller.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.area.AreaBean;
import com.jk.model.dept.DeptBean;
import com.jk.model.user.PowerMenuBean;
import com.jk.model.user.RoleBean;
import com.jk.model.user.UserBean;
import com.jk.utils.Md5Util;
import com.jk.utils.PageResult;
import com.jk.utils.PageUtilEasyui;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.jk.model.area.AreaBean;
import com.jk.model.dept.DeptBean;
import com.jk.model.express.ExpressBean;
import com.jk.model.user.PowerMenuBean;
import com.jk.model.user.RoleBean;
import com.jk.model.user.UserBean;

import com.jk.service.user.UserService;

import com.jk.utils.Md5Util;
import com.jk.utils.PageResult;
import com.jk.utils.PageUtilEasyui;
import com.jk.utils.TimeUtil;



//import org.apache.commons.BeanUtils;



/** 
 * <pre>项目名称：maven    
 * 类名称：UserController    
 * 类描述：    
 * 创建人：刘玉娜
 * 创建时间：2019年4月2日 上午11:32:05    
 * 修改人：刘玉娜
 * 修改时间：2019年4月2日 上午11:32:05    
 * 修改备注：       
 * @version </pre>    
 */
@Controller
@RequestMapping("user")
public class UserController {

	@Reference(version = "1.0.0")
	private UserService userService;

	//查询部门树
	@RequestMapping("queryDept")
	@ResponseBody
	public List<DeptBean> queryDept(){
		int id=0;
		List<DeptBean> deptNode = deptNode(id);
		return deptNode;
	}
	//查询部门树
	private List<DeptBean> deptNode(int id) {
		List<DeptBean> list=userService.queryDeptpid(id);
		for (DeptBean deptBean : list) {
			Integer id2 = deptBean.getId();
			List<DeptBean> deptNode = deptNode(id2);
			deptBean.setChildren(deptNode);
		}
		return list;
	}
	
	//二级联动
	@RequestMapping("queryArea")
	@ResponseBody
	public List<AreaBean> queryArea(int pid){
		List<AreaBean> list=userService.queryArea(pid);
		return list;
	}
	
	//加载角色(新增中的  动态加载)
	@RequestMapping("queryRole")
	@ResponseBody
	public 	List<RoleBean> queryRole() {
		List<RoleBean> list=userService.queryRole();
		return list;
	}
	//权限页面  分页查询角色queryRole2
	@RequestMapping("queryRole2")
	@ResponseBody
	public List<RoleBean> queryRole2(RoleBean roleBean) {
		List<RoleBean> pageResult = userService.queryRole2(roleBean);
		return pageResult;
	}
	
	//新增用户  user表
	@RequestMapping("addUser")
	@ResponseBody
	public Boolean addUser(UserBean userBean) {
		try {
			if(userBean.getId()==null) {
				userService.addUser(userBean);
			}else {
				userService.updateUser(userBean);
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	//分页查询
	@RequestMapping("queryUser")
	@ResponseBody
	public PageResult queryUser(UserBean userBean, PageUtilEasyui<UserBean> pageUtilEasyui) {
		pageUtilEasyui.setT(userBean);
		return userService.queryUser(pageUtilEasyui);
	}
	
	//查询一条  回显 user
	@RequestMapping("queryUserOne")
	@ResponseBody
	public UserBean queryUserOne(int id) {
		UserBean userBean=userService.queryUserOne(id);
		return userBean;
	}
	
	//保存权限
	@RequestMapping("saveRolePower")
	@ResponseBody
	public Boolean saveRolePower(Integer roleId,Integer[] powerIds) {
		try {
			userService.saveRolePower(roleId,powerIds);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	//查询详细菜单
	@RequestMapping("queryPowerMenuList")
	@ResponseBody
	public List<PowerMenuBean> queryPowerMenuList(Integer powerId) {

		return userService.queryPowerMenuList(powerId);
	}
	
	//保存权限菜单
	@RequestMapping("savePowerMenu")
	@ResponseBody
    public Boolean savePowerMenu(PowerMenuBean powerMenuBean) {
		try {
			userService.savePowerMenu(powerMenuBean);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
    }

	/**
	 * 登录
	 * @param userBean 接收账号密码
	 * @param veriftyCode 接收图片验证码
	 * @param request
	 * @return
	 * code msg
	 * 	0：登录成功
	 * 	1：验证码错误
	 * 	2: 账号不存在
	 * 	3：账号被锁定
	 * 	4：密码错误
	 */
	@RequestMapping("login")
	@ResponseBody
	public HashMap<String, Object> login(UserBean userBean, String veriftyCode,HttpServletRequest request){
		HashMap<String, Object> result = new HashMap<>();
		HttpSession session = request.getSession();
		
		//String imgcode = session.getAttribute("imgcode").toString();
		//判断验证码是否正确
//		if (imgcode ==null || !imgcode.equals(veriftyCode) ) {
//			result.put("code", 1);
//			result.put("msg","验证码错误");
//			return result;
//		}
		//通过前台登录账号查询用户信息
		UserBean userInfo = userService.getUserInfoByLoginNumber(userBean);
		//外部webservice接口获取
		//com.jk.service.webservice.UserBean userInfo = userServiceImpl.queryUserInfoLoginNumber(userBean.getLoginNumber());

		if (userInfo == null) {
			result.put("code", 2);
			result.put("msg","账号不存在");
			return result;
		}
		//判断账号状态是否正常
		if(userInfo.getStatus() != 0) {
			result.put("code", 3);
			result.put("msg","账号被锁定，请联系管理员");
			return result;
		}
		//判断密码是否正确
		String password = userBean.getPassword();
		String md516 = Md5Util.getMd516(password);
		System.out.println("正确密码"+md516);
		if (!userInfo.getPassword().equals(md516)) {
			result.put("code", 4);
			result.put("msg","密码错误");
			return result;
		}
		//把ip存到对象
		//userInfo.setLoginIp("11111111.2222.2333");
		//把userInfo对象 →userBean
		//BeanUtils.copyProperties(userInfo, userBean);
		//将用户信息存入到session当中
		session.setAttribute("user",userInfo);
		result.put("code", 0);
		result.put("msg","登录成功");
		return result;
	}
	
	//注销
	@RequestMapping("loginOut")
	@ResponseBody
	public Boolean loginOut(HttpServletRequest request) {
		 HttpSession session = request.getSession();
		 try {
			 session.invalidate();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
