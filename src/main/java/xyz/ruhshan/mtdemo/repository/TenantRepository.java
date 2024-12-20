package xyz.ruhshan.mtdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.ruhshan.mtdemo.entity.Tenant;

@Repository
public interface TenantRepository extends JpaRepository<Tenant, Long> {
}
