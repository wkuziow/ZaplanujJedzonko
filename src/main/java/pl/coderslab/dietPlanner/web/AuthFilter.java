//package pl.coderslab.dietPlanner.web;
//
//import pl.coderslab.dietPlanner.user.User;
//
//import javax.servlet.*;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//
//@WebFilter("/app/*")
//public class AuthFilter implements Filter {
//    public void destroy() {
//    }
//
//    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
//        HttpSession sess = ((HttpServletRequest) req).getSession();
//        User user = (User) sess.getAttribute("loged");
//        if (user == null) {
//            ((HttpServletResponse) resp).sendRedirect("/login");
//            return;
//        }
//            chain.doFilter(req, resp);
//
//    }
//
//    public void init(FilterConfig config) throws ServletException {
//
//    }
//
//}
