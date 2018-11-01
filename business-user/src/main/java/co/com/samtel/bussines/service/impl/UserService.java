package co.com.samtel.bussines.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.samtel.bussines.service.IUserService;
import co.com.samtel.repo.entity.UserEntity;
import co.com.samtel.repo.repository.UserRepository;

@Service
public class UserService implements IUserService{
	@Autowired
	UserRepository userRepository;
	/**
	 * Metodo con el cual obtengo todos los usarios
	 */
	@Override
	public List<UserEntity> getAllUsers() {
		return userRepository.findAll();
	}
	
	@Override
	public UserEntity saveUser(UserEntity user) {
		return userRepository.save(user);
	}
	
	

}
