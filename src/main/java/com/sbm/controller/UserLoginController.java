package com.sbm.controller;

import javax.annotation.Resource;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sbm.pojo.User;
import com.sbm.service.UserService;
import com.sbm.util.ExecuteResult;

@Controller
@RequestMapping("/login")
public class UserLoginController {

	@Resource
	private UserService UserService;
	
	/**
	 * 登录
	 * @param userName
	 * @param password
	 * @param response
	 * @param request
	 * @return
	 */
	@RequestMapping("/userLogin.do")
	@ResponseBody
	public ExecuteResult<User> login(String userName,String password,HttpServletResponse response, HttpServletRequest request) {
		ExecuteResult<User> result = new ExecuteResult<>();
		Cookie [] cookies = request.getCookies();
		String verCodeIfPass = null;
		if(cookies!=null && cookies.length>0) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals("verCode")) {
					verCodeIfPass = cookie.getValue();
				}
			}
		}
		if(verCodeIfPass==null) {
			result.addErrorMessage("请拖动验证码验证登录");
			cleanCookie("verCode",response,request);
			return result;
		}
		if(userName==null) {
			result.addErrorMessage("用户登录名不能为空");
			cleanCookie("verCode",response,request);
			return result;
		}
		if(password==null) {
			result.addErrorMessage("用户登录密码不能为空");
			cleanCookie("verCode",response,request);
			return result;
		}
		
		if(verCodeIfPass.equals("Y")) {
			 User user = UserService.getUserByName(userName);
			 if(user==null) {
				 result.addErrorMessage("用户名与密码不匹配");
				 cleanCookie("verCode",response,request);
				 return result;
			 }
			 if(!user.getUserPwd().equals(password)) {
				 result.addErrorMessage("用户名与密码不匹配");
				 cleanCookie("verCode",response,request);
				 return result;
			 }
			 if(user.getUserPwd().equals(password)) {
				 result.setResult(user);
				 result.setSuccessMessage(userName+"登录成功");
				 cleanCookie("verCode",response,request);
				 //创建session对象
			     HttpSession session = request.getSession();
			     session.setAttribute("userId", user.getUserId());
				 return result;
			 }		
		}else if(verCodeIfPass.equals("N")){
			result.addErrorMessage("请拖动验证码验证登录");
			cleanCookie("verCode",response,request);
			return result;
		}else {
			result.addErrorMessage("登录异常");
			cleanCookie("verCode",response,request);
			return result;
		}
		return result;
	}
	
	
	/**
	 * 登出
	 * @param userId
	 * @return
	 */
	@RequestMapping("/userLoginOut.do")
	@ResponseBody
	public ExecuteResult<Boolean>loginOut(String userId){
		ExecuteResult<Boolean> result = new ExecuteResult<>();
		if(userId==null || userId.equals("")) {
			result.setResult(false);
			result.addErrorMessage("用户未登录");
		}
		User user = UserService.getUserByUserId(userId);
		if(user==null) {
			result.setResult(false);
			result.addErrorMessage("用户不存在");
		}
		result.setResult(true);
		result.setSuccessMessage("退出成功");
		return result;
		
	}
	
	
	
	
	
	/**
	 * 清空指定cookie
	 * @param cookieName
	 * @param response
	 * @param request
	 */
	public void cleanCookie(String cookieName,HttpServletResponse response, HttpServletRequest request) {
		Cookie []cookies = request.getCookies();
		if(cookies!=null && cookies.length>0) {
			for(Cookie cookie : cookies) {
				if(cookie.getName().equals(cookieName)) {
					cookie.setValue("null");
					cookie.setMaxAge(0);
					cookie.setPath("/");
					response.addCookie(cookie);
				}
			}
		}
	}
	
	
}
