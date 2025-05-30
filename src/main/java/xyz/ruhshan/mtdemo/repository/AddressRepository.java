package xyz.ruhshan.mtdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.ruhshan.mtdemo.entity.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {
}
