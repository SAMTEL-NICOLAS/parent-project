package co.com.samtel.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.samtel.repo.entity.UserEntity;
import co.com.samtel.repo.repository.custom.UserRepositoryCustom;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>, CrudRepository<UserEntity, Long>, UserRepositoryCustom{
	
	UserEntity findByUsername(String username);
	
}
