
package co.com.samtel.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.com.samtel.bussines.dto.UserDto;
import co.com.samtel.bussines.service.impl.UserService;
import co.com.samtel.repo.entity.UserEntity;

@Controller
@RestController
@RequestMapping("/v.1/user")
public class UserController {
	@Autowired
	UserService userService;
	
	@Autowired
	ModelMapper modelMapper;
	
	@GetMapping(value="/")
	public ResponseEntity<List<UserDto>> getUser() {
		return new ResponseEntity(modelMapper.map(userService.getAllUsers(), UserDto[].class), HttpStatus.OK);
	}
	
	@GetMapping(value="/{name}/{surname}")
	public ResponseEntity<UserDto> save(@PathVariable("name")String name, @PathVariable("surname")String surname){
		UserDto user = new UserDto();
		user.setName(name);
		user.setUsername(surname);
		return new ResponseEntity<UserDto>(modelMapper.map(userService.saveUser(modelMapper.map(user,UserEntity.class)), UserDto.class),  HttpStatus.OK);
	}
 }
