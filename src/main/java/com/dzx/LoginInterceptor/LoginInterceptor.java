package com.dzx.LoginInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.dzx.util.RedisService;

public class LoginInterceptor implements HandlerInterceptor {
	@Resource
	  private RedisService redisService;

	  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	      throws Exception {
	    String url=request.getServletPath();
	    Object uid=redisService.get("uid");
	    //设置缓存过期时间
	   // redisService.expire("uid", 60);
	  // System.out.println(uid);
	   //UTL:除了login是可以公开访问的，其他的URL都进行拦截控制 
	    if (url.indexOf("/login") >= 0) {
	        return true;
	      
	    }
	    //判断redis中是否有用户id，如果有，则返回true，继续向下执行 
		  if(uid!=null) { return true; }
		 
	    
	    
	  
	    return false;
	  }

	  public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
	      ModelAndView modelAndView) throws Exception {
	    // TODO Auto-generated method stub
	    
	  }

	  public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
	      throws Exception {
	    // TODO Auto-generated method stub
	    
	  }
}
