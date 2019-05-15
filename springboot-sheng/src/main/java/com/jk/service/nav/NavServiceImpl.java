package com.jk.service.nav;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.dao.nav.NavMapper;
import com.jk.model.nav.NavBean;
import com.jk.model.user.RolePowerBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.HashMap;
import java.util.List;

@Service(version = "1.0.0")
public class NavServiceImpl implements NavService {

	@Autowired
	private NavMapper navMapper;

	//查询权限树
	@Override
	public List<NavBean> queryNavAll(HashMap<String, Object> params) {
		//查询所有的权限树节点
				List<NavBean> navList = navMapper.queryNavAll();
				//查询传过来角色所拥有的权限
				List<RolePowerBean> rolePowerBeans = navMapper.queryRolePowerByRoleId(params);
				for (NavBean navBean : navList) {
					for (RolePowerBean rolePowerBean : rolePowerBeans) {
						if (navBean.getId() == rolePowerBean.getPowerId()) {
							navBean.setChecked(true);
						}
					}
				}
		//new一个新对象 （赋 根节点）
		NavBean navBean = new NavBean();
		//分别赋值
		navBean.setId(0);
		navBean.setText("根节点");
		navBean.setPid(-1);
		//最后再存到list
		navList.add(navBean);
		return navList;
	}
	
	//左侧菜单树
	@Override
	public List<NavBean> getNavList(int id) {
		HashMap<String, Object> params = new HashMap<>();
		params.put("id", id);
		return navMapper.getNavList(params);
	}

	//根据用户id查询出用户所拥有的权限地址列表
	@Override
	public List<NavBean> findUserPowerUrl(Integer userId) {
		
		return navMapper.findUserPowerUrl(userId);
	}

}
