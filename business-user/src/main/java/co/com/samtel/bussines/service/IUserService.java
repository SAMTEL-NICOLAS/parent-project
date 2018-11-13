package co.com.samtel.bussines.service;

import java.util.List;

import co.com.samtel.repo.entity.UserEntity;

public interface IUserService {
	
	List<UserEntity> getAllUsers();
	
	UserEntity saveUser(UserEntity user);
	
	UserEntity updateUser(UserEntity user);
}
