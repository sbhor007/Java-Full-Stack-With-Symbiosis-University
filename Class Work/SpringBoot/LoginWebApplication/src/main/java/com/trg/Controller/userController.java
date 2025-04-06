package com.trg.Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.trg.Dao.UserDao;
import com.trg.Model.User;

/**
 * Servlet implementation class userController
 */
@WebServlet("/userController")
public class userController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public userController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		User user = new User();
		
		user.setUsername(request.getParameter("username"));
		user.setPassword(request.getParameter("password"));
		User u = UserDao.searchUser(user);
		if(u == null) {
			request.setAttribute("key", "Invalid Input");
			System.out.println("Invalid Input");
		}else {
			request.setAttribute("key", u.getUsername());
			System.out.println("login");
//			if(u.getUsername().equals(user.getUsername())  && u.getPassword().equals(user.getPassword()) ) {
//				request.setAttribute("key", u.getUsername());
//				System.out.println("login");
//				// <% String name = request.getAttributer("key") %>
//			}else {
//				request.setAttribute("key", "invalid creadentials");
//				System.out.println("invalid creadentials");
//			}
		}
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	

}
