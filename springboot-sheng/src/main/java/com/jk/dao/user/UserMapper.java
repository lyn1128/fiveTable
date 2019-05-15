/** 
 * <pre>项目名称:maven 
 * 文件名称:UserMapper.java 
 * 包名:com.jk.fs.mapper.user 
 * 创建日期:2019年4月1日下午3:20:11 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.dao.user;

import com.jk.model.area.AreaBean;
import com.jk.model.dept.DeptBean;
import com.jk.model.user.*;
import com.jk.model.area.AreaBean;
import com.jk.model.dept.DeptBean;
import com.jk.model.user.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/** 
 * <pre>项目名称：maven    
 * 类名称：UserMapper    
 * 类描述：    
 * 创建人：刘玉娜
 * 创建时间：2019年4月1日 下午3:20:11    
 * 修改人：刘玉娜 1848123832@qq.om
 * 修改时间：2019年4月1日 下午3:20:11    
 * 修改备注：       
 * @version </pre>    
 */
public interface UserMapper {


	int userCount();

	List<DeptBean> queryDeptpid(int id);


	List<AreaBean> queryArea(int pid);


	List<RoleBean> queryRole();


	void addUser(UserBean userBean);


	void addUserRole(ArrayList<UserRoleBean> params);


	int queryUserCount(HashMap<String, Object> params);


	List<UserBean> queryUser(HashMap<String, Object> params);


	UserBean queryUserOne(int id);


	void updateUser(UserBean userBean);


	void deleteUserRoleByUserId(Integer id);


	UserBean getUserInfoByLoginNumber(UserBean userBean);


	int queryRole2Count(HashMap<String, Object> params);


	List<RoleBean> queryRole2(HashMap<String, Object> params);


	void saveRolePower(ArrayList<RolePowerBean> params);


	void deleteRolePower(Integer roleId);


	List<PowerMenuBean> queryPowerMenuList(Integer powerId);


	void savePowerMenu(PowerMenuBean powerMenuBean);

}
