package com.jk.controller.page;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jk.service.user.UserService;

/**
 *
 * <pre>项目名称：maven
 * 类名称：PageController
 * 类描述：
 * 创建人：刘玉娜
 * 创建时间：2019年4月2日 上午8:25:45
 * 修改人：刘玉娜 1848123832@qq.om
 * 修改时间：2019年4月2日 上午8:25:45
 * 修改备注：
 * @version </pre>
 */
@Controller
@RequestMapping("page")
public class PageController {

	@Reference(version = "1.0.0")  //
	private UserService userService;

	//翻译
	@RequestMapping("toTranslation")
	public String toTranslation() {
		return "WEB-INF/view/fy/translation";
	}

	//全部日志
	@RequestMapping("towslog")
	public String towslog() {
		return "WEB-INF/view/log/wslog";
	}
	//进入机器人
	@RequestMapping("toRobot")
	public String toRobot() {
		return "WEB-INF/view/robot/robot";
	}

	//进 物流jsp
	@RequestMapping("toLogistics")
	public String toLogistics() {
		return "WEB-INF/view/logistics/logistics";
	}

	//进入全部日志
	@RequestMapping("toAllLoglist")
	public String toAllLoglist() {
		return "WEB-INF/view/log/alllog";
	}

	//j进我的日志
	@RequestMapping("toMyLoglist")
	public String toMyLoglist() {
		return "WEB-INF/view/log/mylog";
	}

	//进权限页面
	@RequestMapping("toRolePower")
	public String toRolePower() {
		return "rights";
	}
	//进权限页面
	@RequestMapping("tologin2")
	public String tologin2() {
		return "login2";
	}
	//进权限页面
	@RequestMapping("tologin")
	public String tologin() {
		return "login";
	}

	//进用户查询页面
	@RequestMapping("toUserList")
	public String toUserList() {
		return "WEB-INF/view/user/userlist";
	}

	//进首页
	@RequestMapping("toMain")
	public String toMain() {
		int i=userService.userCount();
		return "main";
	}
}