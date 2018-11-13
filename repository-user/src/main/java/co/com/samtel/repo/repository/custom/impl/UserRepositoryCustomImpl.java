package co.com.samtel.repo.repository.custom.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import co.com.samtel.repo.entity.UserEntity;
import co.com.samtel.repo.repository.custom.UserRepositoryCustom;

@Repository
public class UserRepositoryCustomImpl implements UserRepositoryCustom{

    @PersistenceContext
    EntityManager entityManager;
    
	@Override
	public UserEntity updateUser(UserEntity user) {
		return entityManager.merge(user);
	}

}
