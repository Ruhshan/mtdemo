package xyz.ruhshan.mtdemo.service;

import org.flywaydb.core.Flyway;
import org.springframework.stereotype.Service;

@Service
public class FlywayService {
    public void migrateTenantSchema(String tenantSchemaName) {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:postgresql://localhost:5440/mtdemo-db", "postgres", "postgres")
                .baselineOnMigrate(true)
                .schemas(tenantSchemaName)
                .locations("classpath:db/migration/tenant")
                .load();

        flyway.migrate();
    }
}
