/** 
 * <pre>项目名称:maven 
 * 文件名称:UserService.java 
 * 包名:com.jk.fs.service.user 
 * 创建日期:2019年4月1日下午3:18:48 
 * Copyright (c) 2019, yuxy123@gmail.com All Rights Reserved.</pre> 
 */  
package com.jk.service.user;

import java.util.List;

import com.jk.model.area.AreaBean;
import com.jk.model.dept.DeptBean;
import com.jk.model.user.PowerMenuBean;
import com.jk.model.user.RoleBean;
import com.jk.model.user.UserBean;
import com.jk.utils.PageResult;
import com.jk.utils.PageUtilEasyui;

/** 
 * <pre>项目名称：maven    
 * 类名称：UserService    
 * 类描述：    
 * 创建人：封帅
 * 创建时间：2019年4月1日 下午3:18:48    
 * 修改人：封帅 1848123832@qq.om
 * 修改时间：2019年4月1日 下午3:18:48    
 * 修改备注：       
 * @version </pre>    
 */
public interface UserService {

	/** <pre>userCount(这里用一句话描述这个方法的作用)   
	 * 创建人：封帅 1848123832@qq.om
	 * 创建时间：2019年4月1日 下午3:26:37    
	 * 修改人：封帅 1848123832@qq.om
	 * 修改时间：2019年4月1日 下午3:26:37    
	 * 修改备注： 
	 * @return</pre>    
	 */
	int userCount();

	/** <pre>queryDeptpid(这里用一句话描述这个方法的作用)   
	 * 创建人：封帅 1848123832@qq.om
	 * 创建时间：2019年4月2日 上午11:46:44    
	 * 修改人：封帅 1848123832@qq.om
	 * 修改时间：2019年4月2日 上午11:46:44    
	 * 修改备注： 
	 * @param id
	 * @return</pre>    
	 */
	List<DeptBean> queryDeptpid(int id);

	/** <pre>queryArea(这里用一句话描述这个方法的作用)   
	 * 创建人：封帅 1848123832@qq.om
	 * 创建时间：2019年4月2日 下午2:03:50    
	 * 修改人：封帅 1848123832@qq.om
	 * 修改时间：2019年4月2日 下午2:03:50    
	 * 修改备注： 
	 * @param pid 
	 * @return</pre>    
	 */
	List<AreaBean> queryArea(int pid);

	/** <pre>queryRole(这里用一句话描述这个方法的作用)   
	 * 创建人：封帅 1848123832@qq.om
	 * 创建时间：2019年4月2日 下午3:09:57    
	 * 修改人：封帅 1848123832@qq.om
	 * 修改时间：2019年4月2日 下午3:09:57    
	 * 修改备注： 
	 * @return</pre>    
	 */
	List<RoleBean> queryRole();

	/** <pre>addUser(这里用一句话描述这个方法的作用)   
	 * 创建人：封帅 1848123832@qq.om
	 * 创建时间：2019年4月2日 下午3:44:13    
	 * 修改人：封帅 1848123832@qq.om
	 * 修改时间：2019年4月2日 下午3:44:13    
	 * 修改备注： 
	 * @param userBean</pre>    
	 */
	void addUser(UserBean userBean);

	/** <pre>queryUser(这里用一句话描述这个方法的作用)   
	 * 创建人：封帅 1848123832@qq.om
	 * 创建时间：2019年4月2日 下午5:53:46    
	 * 修改人：封帅 1848123832@qq.om
	 * 修改时间：2019年4月2日 下午5:53:46    
	 * 修改备注： 
	 * @param userBean
	 * @param pageUtilEasyui 
	 * @return</pre>    
	 */
	PageResult queryUser(PageUtilEasyui<UserBean> pageUtilEasyui);

	/** <pre>queryUserOne(这里用一句话描述这个方法的作用)   
	 * 创建人：封帅 1848123832@qq.om
	 * 创建时间：2019年4月3日 上午9:45:04    
	 * 修改人：封帅 1848123832@qq.om
	 * 修改时间：2019年4月3日 上午9:45:04    
	 * 修改备注： 
	 * @param id
	 * @return</pre>    
	 */
	UserBean queryUserOne(int id);

	/** <pre>updateUser(这里用一句话描述这个方法的作用)   
	 * 创建人：封帅 1848123832@qq.om
	 * 创建时间：2019年4月3日 上午10:17:11    
	 * 修改人：封帅 1848123832@qq.om
	 * 修改时间：2019年4月3日 上午10:17:11    
	 * 修改备注： 
	 * @param userBean</pre>    
	 */
	void updateUser(UserBean userBean);

	/** <pre>getUserInfoByLoginNumber(这里用一句话描述这个方法的作用)   
	 * 创建人：封帅 1848123832@qq.om
	 * 创建时间：2019年4月3日 下午1:42:00    
	 * 修改人：封帅 1848123832@qq.om
	 * 修改时间：2019年4月3日 下午1:42:00    
	 * 修改备注： 
	 * @param userBean
	 * @return</pre>    
	 */
	UserBean getUserInfoByLoginNumber(UserBean userBean);

	/** <pre>queryRole2(这里用一句话描述这个方法的作用)   
	 * 创建人：封帅 1848123832@qq.om
	 * 创建时间：2019年4月3日 下午2:59:24    
	 * 修改人：封帅 1848123832@qq.om
	 * 修改时间：2019年4月3日 下午2:59:24    
	 * 修改备注： 
	 * @param pageUtilEasyui
	 * @return</pre>    
	 */
	List<RoleBean> queryRole2(RoleBean roleBean);

	/** <pre>saveRolePower(这里用一句话描述这个方法的作用)   
	 * 创建人：封帅 1848123832@qq.om
	 * 创建时间：2019年4月4日 上午11:11:35    
	 * 修改人：封帅 1848123832@qq.om
	 * 修改时间：2019年4月4日 上午11:11:35    
	 * 修改备注： 
	 * @param roleId
	 * @param powerIds</pre>    
	 */
	void saveRolePower(Integer roleId, Integer[] powerIds);

	/** <pre>queryPowerMenuList(这里用一句话描述这个方法的作用)   
	 * 创建人：封帅 1848123832@qq.om
	 * 创建时间：2019年4月4日 下午3:10:15    
	 * 修改人：封帅 1848123832@qq.om
	 * 修改时间：2019年4月4日 下午3:10:15    
	 * 修改备注： 
	 * @param powerId
	 * @return</pre>    
	 */
	List<PowerMenuBean> queryPowerMenuList(Integer powerId);

	/** <pre>savePowerMenu(这里用一句话描述这个方法的作用)   
	 * 创建人：封帅 1848123832@qq.om
	 * 创建时间：2019年4月7日 下午2:44:54    
	 * 修改人：封帅 1848123832@qq.om
	 * 修改时间：2019年4月7日 下午2:44:54    
	 * 修改备注： 
	 * @param powerMenuBean</pre>    
	 */
	void savePowerMenu(PowerMenuBean powerMenuBean);

	

}
