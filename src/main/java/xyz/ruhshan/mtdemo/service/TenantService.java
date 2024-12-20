package xyz.ruhshan.mtdemo.service;

import org.springframework.stereotype.Service;
import xyz.ruhshan.mtdemo.entity.Tenant;
import xyz.ruhshan.mtdemo.repository.TenantRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TenantService {
    private final TenantRepository tenantRepository;
    private final FlywayService flywayService;

    public TenantService(TenantRepository tenantRepository, FlywayService flywayService) {
        this.tenantRepository = tenantRepository;
        this.flywayService = flywayService;
    }

    public Tenant addTenant(Tenant tenant) {
        var response =  tenantRepository.save(tenant);

        flywayService.migrateTenantSchema(tenant.getName());

        return response;
    }

    public List<String> getAllTenantNames() {
        return tenantRepository.findAll().stream().map(Tenant::getName).collect(Collectors.toList());
    }
}
