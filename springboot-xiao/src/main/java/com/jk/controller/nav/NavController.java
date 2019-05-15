package com.jk.controller.nav;

import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.model.nav.NavBean;
import com.jk.model.user.UserBean;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.jk.model.nav.NavBean;
import com.jk.model.user.UserBean;
import com.jk.service.nav.NavService;

@Controller
@RequestMapping("nav")
public class NavController {

	@Reference(version = "1.0.0")  //
	private NavService navService;

	/**
	 * 查询权限树
	 * @return
	 */
	@RequestMapping("queryNavAll")
	@ResponseBody
	public List<NavBean> queryNavAll(String id){
		HashMap<String, Object> params = new HashMap<>();
		params.put("roleId", id);
		return navService.queryNavAll(params);
	}
	
	/**
	 * 查询左侧导航树
	 * @return
	 */
	@RequestMapping("getNavListCommon")
	@ResponseBody
	public List<NavBean> getNavListCommon(HttpServletRequest request){
		HttpSession session = request.getSession();
		UserBean attribute = (UserBean) session.getAttribute("user");
		List<NavBean> navList = navService.getNavList(attribute.getId());
			return navList;
	}

	
}
