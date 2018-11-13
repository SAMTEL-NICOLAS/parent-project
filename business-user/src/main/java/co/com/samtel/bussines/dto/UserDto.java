package co.com.samtel.bussines.dto;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDto {
	
	
	private Long id;
	
	private String name;
	
	private String username;
	
	private List<RoleDto> rol;
}
