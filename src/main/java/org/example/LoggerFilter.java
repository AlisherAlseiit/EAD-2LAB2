package org.example;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import static com.sun.activation.registries.LogSupport.log;

public class LoggerFilter implements Filter {

    public void init(FilterConfig arg0) throws ServletException {}

    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) resp;

        HttpSession session = httpRequest.getSession();

        session.setAttribute("imitation", "yes");


        Cookie cookie1 = new Cookie("some_id", httpRequest.getParameter("email"));

        cookie1.setMaxAge(30 * 60);

        httpResponse.addCookie(cookie1);


        log(req.getParameter("email"));
        log(req.getParameter("password"));
        log( cookie1.getName() + " " + cookie1.getValue());

        chain.doFilter(req,resp);

    }
    public void destroy() {}

}






