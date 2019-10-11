package com.fullstackwebapp.springbootfileupload;

import javax.servlet.*;
import java.io.IOException;

public class HelloFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {
        System.out.println("Executing doFilter method");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("Done executing doFilter method");
    }
}