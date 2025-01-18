package com.example.EventCenter.Repository;

import com.example.EventCenter.Entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByid(Long id);
    @Query("SELECT r.roleName FROM Role r WHERE r.id = :roleId")
    String findRoleNameById(@Param("roleId") Long roleId);
}

