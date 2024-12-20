package xyz.ruhshan.mtdemo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xyz.ruhshan.mtdemo.entity.Tenant;
import xyz.ruhshan.mtdemo.service.TenantService;

@RestController
@RequestMapping("/api/tenants")
public class TenantController {

    private final TenantService tenantService;

    public TenantController(TenantService tenantService) {
        this.tenantService = tenantService;
    }


    @PostMapping
    public Tenant addTenant(@RequestBody Tenant tenant) {
        return tenantService.addTenant(tenant);
    }
}
