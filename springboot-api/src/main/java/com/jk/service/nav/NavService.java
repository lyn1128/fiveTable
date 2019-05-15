package com.jk.service.nav;

import java.util.HashMap;
import java.util.List;

import com.jk.model.nav.NavBean;
import com.jk.model.nav.NavBean;

public interface NavService {

	List<NavBean> getNavList(int id);

	List<NavBean> queryNavAll(HashMap<String, Object> params);

	/** <pre>findUserPowerUrl(这里用一句话描述这个方法的作用)   
	 * 创建人：封帅 1848123832@qq.om
	 * 创建时间：2019年4月7日 下午7:35:55    
	 * 修改人：封帅 1848123832@qq.om
	 * 修改时间：2019年4月7日 下午7:35:55    
	 * 修改备注： //根据用户id查询出用户所拥有的权限地址列表
	 * @param userId
	 * @return</pre>    
	 */
	List<NavBean> findUserPowerUrl(Integer userId);

}
