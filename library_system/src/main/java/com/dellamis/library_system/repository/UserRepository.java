package com.dellamis.library_system.repository;

import com.dellamis.library_system.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {
}
