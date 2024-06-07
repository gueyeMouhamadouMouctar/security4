package sn.xarandev.security4.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sn.xarandev.security4.dto.UserDto;

@WebServlet(name = "admin", value = "/admin")
public class AdminServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		List<UserDto> users = new ArrayList<UserDto>() ;
		
    	UserDto user1 = new UserDto(1, "Abdoulaye", "Gueye", "abdoul@gmail.com", "abdoul") ;
    	UserDto user2 = new UserDto(1, "Ouleye", "Gueye", "abdoul@gmail.com", "abdoul") ;
    	UserDto user3 = new UserDto(1, "Slay", "Laye", "saly@gmail.com", "abdoul") ;
    	
    	users.add(user1) ;
    	users.add(user2) ;
    	users.add(user3) ;
    	System.out.println(users) ;
    	
    	req.setAttribute("users", users);
    	req.getRequestDispatcher("WEB-INF/jsp/users/list.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	}

}
