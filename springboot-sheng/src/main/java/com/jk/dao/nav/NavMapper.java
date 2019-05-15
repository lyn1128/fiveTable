package com.jk.dao.nav;

import com.jk.model.nav.NavBean;
import com.jk.model.user.RolePowerBean;

import java.util.HashMap;
import java.util.List;

public interface NavMapper {

	List<NavBean> getNavList(HashMap<String, Object> params);

	List<NavBean> queryNavAll();

	List<RolePowerBean> queryRolePowerByRoleId(HashMap<String, Object> params);

	List<NavBean> findUserPowerUrl(Integer userId);

}
