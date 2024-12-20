package xyz.ruhshan.mtdemo.multitenancy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import xyz.ruhshan.mtdemo.service.FlywayService;
import xyz.ruhshan.mtdemo.service.TenantService;

@Component
public class TenantSchemaMigrator implements CommandLineRunner {
    private final TenantService tenantService;
    private final FlywayService flywayService;

    public TenantSchemaMigrator(TenantService tenantService, FlywayService flywayService) {
        this.tenantService = tenantService;
        this.flywayService = flywayService;
    }
    @Override
    public void run(String... args) throws Exception {
        tenantService.getAllTenantNames().forEach(flywayService::migrateTenantSchema);
    }
}
