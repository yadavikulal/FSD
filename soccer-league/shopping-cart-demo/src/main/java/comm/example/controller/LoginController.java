package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login.do")
public class LoginController extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doPost(HttpServletRequest request,
         HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String un = request.getParameter("uname");
      @SuppressWarnings("unused")
	String pwd = request.getParameter("pass");
      if (un.equals("yadavi")) {
         out.print("Welcome, " + un);
         HttpSession session = request.getSession(true); // reuse existing
                                             // session if exist
                                             // or create one
         session.setAttribute("user", un);
         session.setMaxInactiveInterval(30); // 30 seconds
         response.sendRedirect("ModelList.jsp");
      } else {
         RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
        
         rd.include(request, response);
      } // TODO Auto-generated method stub
   }
}