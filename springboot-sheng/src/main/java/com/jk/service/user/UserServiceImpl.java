/**
 * <pre>项目名称:maven
 * 文件名称:UserServiceImpl.java
 * 包名:com.jk.service.user
 * 创建日期:2019年4月1日下午3:19:14
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre>
 */
package com.jk.service.user;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.user.UserMapper;
import com.jk.model.area.AreaBean;
import com.jk.model.dept.DeptBean;
import com.jk.model.user.*;

import com.jk.utils.Md5Util;
import com.jk.utils.PageResult;
import com.jk.utils.PageUtilEasyui;
import com.jk.utils.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * <pre>项目名称：maven
 * 类名称：UserServiceImpl
 * 类描述：
 * 创建人：刘玉娜
 * 创建时间：2019年4月1日 下午3:19:14
 * 修改人：刘玉娜 1848123832@qq.om
 * 修改时间：2019年4月1日 下午3:19:14
 * 修改备注：
 * @version </pre>
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public int userCount() {
		return userMapper.userCount();
	}

	//部门下拉树
	@Override
	public List<DeptBean> queryDeptpid(int id) {
		return userMapper.queryDeptpid(id);
	}

	//二级联动
	@Override
	public List<AreaBean> queryArea(int pid) {
		return userMapper.queryArea(pid);
	}

	//加载角色(新增页面)
	@Override
	public List<RoleBean> queryRole() {
		return userMapper.queryRole();
	}

	//新增  保存
	@Override
	public void addUser(UserBean userBean) {
		userBean.setPassword(Md5Util.getMd516(userBean.getPassword()));
		//保存用户信息
		userMapper.addUser(userBean);
		//保存用户角色信息
		ArrayList<UserRoleBean> params = new ArrayList<UserRoleBean>();
		String roleId = userBean.getRoleId();//取出角色
		String[] split = roleId.split(",");
		for (String string : split) {
			UserRoleBean userRoleBean = new UserRoleBean();

			userRoleBean.setId(StringUtil.getUUId());  //用户角色表里面的 id
			userRoleBean.setRoleId(string);//循环的角色id
			userRoleBean.setUserId(userBean.getId()); //用户id

			params.add(userRoleBean);//
		}
		userMapper.addUserRole(params);
	}


	//查询user
	@Override
	public PageResult queryUser(PageUtilEasyui<UserBean> pageUtilEasyui) {
		PageResult result = new PageResult();
		HashMap<String, Object> params = new HashMap<>();
		params.put("user", pageUtilEasyui.getT());
		//查询数据条数
		int count=userMapper.queryUserCount(params);
		result.setTotal(count);
		//查询数据
		params.put("startIndex", pageUtilEasyui.getStartIndex());
		params.put("rows", pageUtilEasyui.getRows());

		List<UserBean> list=userMapper.queryUser(params);
		result.setRows(list);
		return result;
	}


	//查询一条  回显
	@Override
	public UserBean queryUserOne(int id) {

		return userMapper.queryUserOne(id);
	}


	//修改
	@Override
	public void updateUser(UserBean userBean) {
		//一、修改用户表
		userMapper.updateUser(userBean);
		//二、修改用户角色关联表(其实是新增和删除)
		//1.删除用户原有的角色
		userMapper.deleteUserRoleByUserId(userBean.getId());
		//2.新增用户的新角色
		ArrayList<UserRoleBean> params = new ArrayList<UserRoleBean>();
		String roleId = userBean.getRoleId();//取出角色
		String[] split = roleId.split(",");
		for (String string : split) {
			UserRoleBean userRoleBean = new UserRoleBean();

			userRoleBean.setId(StringUtil.getUUId());  //用户角色表里面的 id
			userRoleBean.setRoleId(string);//循环的角色id
			userRoleBean.setUserId(userBean.getId()); //用户id

			params.add(userRoleBean);//
		}
		userMapper.addUserRole(params);
	}


	//登陆
	@Override
	public UserBean getUserInfoByLoginNumber(UserBean userBean) {
		UserBean userInfoByLoginNumber = userMapper.getUserInfoByLoginNumber(userBean);
		return userInfoByLoginNumber;
	}


	//权限页面  分页查询角色queryRole2
	@Override
	public List<RoleBean> queryRole2(RoleBean roleBean) {
		PageResult result = new PageResult();
		HashMap<String, Object> params = new HashMap<>();
		params.put("role", roleBean);
		//查询数据条数
		int count=userMapper.queryRole2Count(params);
		result.setTotal(count);
		//查询数据


		List<RoleBean> list=userMapper.queryRole2(params);
		result.setRows(list);
		return list;
	}


	//保存权限
	@Override
	public void saveRolePower(Integer roleId, Integer[] powerIds) {
		ArrayList<RolePowerBean> params = new ArrayList<RolePowerBean>();
		for (int i = 0; i < powerIds.length; i++) {
			RolePowerBean rolePowerBean = new RolePowerBean();
			rolePowerBean.setPowerId(powerIds[i]);//权限id
			rolePowerBean.setRoleId(roleId);//角色id
			params.add(rolePowerBean);
		}
		//先删掉原来的 (删除旧权限)
		userMapper.deleteRolePower(roleId);
		//新增角色权限表 t_role_power(绑定新权限)
		userMapper.saveRolePower(params);
	}


	//查询详细权限  权限页面第三个格
	@Override
	public List<PowerMenuBean> queryPowerMenuList(Integer powerId) {

		return userMapper.queryPowerMenuList(powerId);
	}


	//保存权限菜单
	@Override
	public void savePowerMenu(PowerMenuBean powerMenuBean) {

		userMapper.savePowerMenu(powerMenuBean);
	}




}
