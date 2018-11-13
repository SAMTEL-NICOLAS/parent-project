package co.com.samtel.bussines.service;

import java.util.List;

import co.com.samtel.repo.entity.RoleEntity;

public interface IRoleService {
	
	List<RoleEntity> getAllRoles();
	
	RoleEntity saveRole(RoleEntity role);
}
