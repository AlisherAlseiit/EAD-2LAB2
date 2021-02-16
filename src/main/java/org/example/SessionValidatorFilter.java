package org.example;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

import static com.sun.activation.registries.LogSupport.log;

public class SessionValidatorFilter implements Filter {

    public void init(FilterConfig arg0) throws ServletException {}

    public void doFilter(ServletRequest req, ServletResponse resp,
                         FilterChain chain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) req;

        PrintWriter out=resp.getWriter();
        HttpSession session = httpRequest.getSession();

        if(!session.getAttribute("imitation").equals("") || session.getAttribute("imitation").equals(null)){
            out.print("no session attribute");
            RequestDispatcher rd=req.getRequestDispatcher("index.html");
            rd.include(req, resp);
        }



            chain.doFilter(req,resp);




    }
    public void destroy() {}

}
