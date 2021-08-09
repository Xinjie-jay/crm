package com.bjpowernode.crm.settings.web.controller;

import com.bjpowernode.crm.settings.domain.User;
import com.bjpowernode.crm.settings.service.Impl.UserServiceImpl;
import com.bjpowernode.crm.settings.service.UserService;
import com.bjpowernode.crm.utils.MD5Util;
import com.bjpowernode.crm.utils.PrintJson;
import com.bjpowernode.crm.utils.ServiceFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * @author jackson
 * @date 2021/8/7
 */
public class UserController extends HttpServlet {

	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		System.out.println("进入到用户控制器");

		String path = request.getServletPath();

		if ("/settings/user/login.do".equals(path)) {

			login(request, response);

		} else if ("".equals(path)) {

			//xxx(request,response);

		} else if ("".equals(path)) {

			//xxx(request,response);
		}


	}

	private void login(HttpServletRequest request, HttpServletResponse response) {

		System.out.println("进入到验证登录的操作");

		//参数接收
		String loginAct = request.getParameter("loginAct");
		String loginPwd = request.getParameter("loginPwd");

		//将密码的明文形式转换为密文形式
		loginPwd = MD5Util.getMD5(loginPwd);

		//获取用户登录IP
		String ip = request.getRemoteAddr();
		System.out.println("======ip======:" + ip);


		//未来业务层开发，统一使用代理类形态的接口对象
		UserService userService = (UserService) ServiceFactory.getService(new UserServiceImpl());

		try {
			User user = userService.login(loginAct, loginPwd, ip);
			//	将对象保存到Session域对象中
			request.getSession().setAttribute("user", user);
			//如果程序执行到此处 执行到这步说明业务层没有抛异常
			//表示登陆成功
			/*
			 {"success:true"}
			*/
			//给前端响应信息
			PrintJson.printJsonFlag(response, true);
		} catch (Exception e) {
			e.printStackTrace();
			//	一旦执行了catch块信息， 说明业务层为我们验证登录失败，为controller抛出了异常
			//	表示登录失败
			/*
			  {"success:false"}
			 */
			String msg = e.getMessage();

			/*
				我们现在作为controller，需要为ajax请求提供多项信息

				可以有两种手段来处理
					（1）将多项信息打包成map，将map解析为json串
					（2）创建一个VO
							private boolean success;
							private String msg;
					注意：如果对于展现的信息将来还会大量的使用，可以创建一个vo类方便使用
						 如果对于展现的信息 只有在这个需求能够使用，使用map就可以了 减少资源消耗
			 */
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("success", false);
			map.put("msg",msg);
			PrintJson.printJsonObj(response, map);
		}
	}
}
