package xyz.ruhshan.mtdemo.multitenancy;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class TenantSchemaFilter implements Filter {
    private static final String TENANT_HEADER = "x-tenant-id";
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String tenant = request.getHeader(TENANT_HEADER);
        TenantSchemaContext.setCurrentTenant(tenant);
        filterChain.doFilter(servletRequest, servletResponse);
        TenantSchemaContext.clear();
    }
}
