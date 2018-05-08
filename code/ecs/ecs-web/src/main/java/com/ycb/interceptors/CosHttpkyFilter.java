package com.ycb.interceptors;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class CosHttpkyFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub/ TODO Auto-generated method stub
			System.out.println("跨域问题!!!!!!");
		HttpServletResponse res = (HttpServletResponse) response;

		res.setContentType("text/html;charset=UTF-8");

		res.setHeader("Access-Control-Allow-Origin", "*");

		res.setHeader("Access-Control-Allow-Methods",
				"POST, GET, OPTIONS, DELETE");

		res.setHeader("Access-Control-Max-Age", "0");

		res.setHeader(
				"Access-Control-Allow-Headers",
				"Origin, No-Cache, X-Requested-With, If-Modified-Since, Pragma, Last-Modified, Cache-Control, Expires, Content-Type, X-E4M-With,userId,token");

		res.setHeader("Access-Control-Allow-Credentials", "true");

		res.setHeader("XDomainRequestAllowed", "1");

		arg2.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
