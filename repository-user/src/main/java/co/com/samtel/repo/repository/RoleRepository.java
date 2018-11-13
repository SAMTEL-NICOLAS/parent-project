package co.com.samtel.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import co.com.samtel.repo.entity.RoleEntity;

public interface RoleRepository extends JpaRepository<RoleEntity, Long>, CrudRepository<RoleEntity, Long> {

}