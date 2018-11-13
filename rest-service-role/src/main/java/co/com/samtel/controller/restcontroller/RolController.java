package co.com.samtel.controller.restcontroller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.samtel.bussines.dto.RoleDto;
import co.com.samtel.bussines.service.IRoleService;
import co.com.samtel.repo.entity.RoleEntity;

@Controller
@RestController
@RequestMapping("/v.1/role")
public class RolController {
	

	@Autowired
	ModelMapper modelMapper;
	@Autowired
	IRoleService roleService;
	
	@GetMapping(value="/")
	public ResponseEntity<RoleDto[]> getRol() {
		return new ResponseEntity<RoleDto[]>(modelMapper.map(roleService.getAllRoles(), RoleDto[].class), HttpStatus.OK);
	}
	
	@PostMapping(value="/")
	public ResponseEntity<RoleDto> save(@RequestBody RoleDto role){
		return new ResponseEntity<RoleDto>(modelMapper.map(roleService.saveRole(modelMapper.map(role,RoleEntity.class)), RoleDto.class),  HttpStatus.OK);
	}

}
