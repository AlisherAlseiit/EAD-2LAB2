package org.example;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.applet.Applet;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class CookieTimeFilter implements Filter {
    FilterConfig config;
    ServletContextListener contextListener;

    public void init(FilterConfig arg0) throws ServletException {}

    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpServletResponse httpResponse = (HttpServletResponse) resp;



        PrintWriter out=resp.getWriter();


        Cookie cookie = new Cookie("some_id", httpRequest.getParameter("email"));



                    cookie.setMaxAge(60 * 60);
                    httpResponse.addCookie(cookie);


            chain.doFilter(req, resp);





    }
    public void destroy(Cookie cookie) {

    }

}
