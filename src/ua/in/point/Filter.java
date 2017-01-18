package ua.in.point;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/*
        Question for java senior engineer:
        Write a WebService or jsp page. Users input their email address and
        password to get registered. Check legitimacy of the email and password.
        Regarding the password rules, please refer to Apple’s password rules (It must
        satisfy all the following four terms.)
        A) It must include numbers, letters, uppercase and lowercase letters.
        B) It can only be visible symbols of ASCII
        C) The number of letters and numbers in a row must be smaller than 4.(e.g.
        both 1234 and dcba are not allowed)
        D) The number of same characters are no more than 3. (e.g. both aaaa and
        0000 are not allowed)
*/

@WebFilter(urlPatterns = {"/hello"})
public class Filter implements javax.servlet.Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws ServletException, IOException {
        if (request instanceof HttpServletRequest) {
            HttpServletRequest httpServletRequest = (HttpServletRequest) request;
            System.out.println("Incoming request: " + httpServletRequest.getRequestURL().toString());

            String password = request.getParameter("password");
            System.out.println("Password is " + password);

            request.getRequestDispatcher("/hello").forward(request, response);
            //request.getRequestDispatcher("/error").forward(request, response);

        }
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
    }

    @Override
    public void init(FilterConfig config) throws ServletException {
    }
}