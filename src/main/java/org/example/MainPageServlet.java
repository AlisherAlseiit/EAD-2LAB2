package org.example;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/MainPage")
public class MainPageServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<h1>");
        out.println("email:" + request.getParameter("email") + "\n");
        out.println("</h1>");
        out.println("<h1>");
        out.println("password:" + request.getParameter("password"));
        out.println("</h1>");
        out.println("<a href=\"Login\">" + "Go to Login" + "</a>" + "<br>");
        out.println("<a href=\"register\">" + "Go to registration" + "</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
