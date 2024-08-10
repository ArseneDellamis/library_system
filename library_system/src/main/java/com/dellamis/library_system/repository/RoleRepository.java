package com.dellamis.library_system.repository;

import com.dellamis.library_system.user.RoleList;
import com.dellamis.library_system.user.UserRole;
import com.dellamis.library_system.user.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<UserRole, Long> {

    Optional<UserRole> findByName(RoleList name);
}
