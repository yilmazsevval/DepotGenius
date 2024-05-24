package com.depotgenius.dataAccess;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.depotgenius.entities.concretes.Role;

public interface RoleRepository extends JpaRepository<Role, UUID> {

}
