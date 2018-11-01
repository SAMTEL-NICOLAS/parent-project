package co.com.samtel.repo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.samtel.repo.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long>, CrudRepository<UserEntity, Long>{

}
