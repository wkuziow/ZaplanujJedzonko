package pl.coderslab.web;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/app/*")
public class AuthFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {

//        HttpServletResponse httpResponse = (HttpServletResponse) resp;
//        HttpServletRequest httpRequest = (HttpServletRequest) req;
        HttpSession sess = ((HttpServletRequest) req).getSession();
        String username = (String) sess.getAttribute("loged");
        if (username == null || username.isEmpty()) {
            ((HttpServletResponse) resp).sendRedirect("/login");
            return;
        }





        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
