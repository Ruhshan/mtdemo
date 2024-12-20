package xyz.ruhshan.mtdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.ruhshan.mtdemo.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
