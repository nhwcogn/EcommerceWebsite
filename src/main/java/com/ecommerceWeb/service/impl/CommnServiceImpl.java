package com.ecommerceWeb.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.ecommerceWeb.service.CommnService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Service
public class CommnServiceImpl implements CommnService {
	
	@Override
	public void removeSessionMessage() {
		HttpServletRequest request = ((ServletRequestAttributes) (RequestContextHolder.getRequestAttributes())).getRequest();
		HttpSession session = request.getSession();
		session.removeAttribute("succMsg");
		session.removeAttribute("errorMsg");
	}

}

