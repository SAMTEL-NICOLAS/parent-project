package co.com.samtel.bussines.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.samtel.bussines.service.IRoleService;
import co.com.samtel.repo.entity.RoleEntity;
import co.com.samtel.repo.repository.RoleRepository;
@Service
public class RoleService implements IRoleService {
	
	@Autowired
	RoleRepository roleRepository;

	@Override
	public List<RoleEntity> getAllRoles() {
		return roleRepository.findAll();
	}

	@Override
	public RoleEntity saveRole(RoleEntity role) {
		return roleRepository.save(role);
	}

}
