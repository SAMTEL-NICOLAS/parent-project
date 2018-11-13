package co.com.samtel.bussines.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor//Crea un constructor con los parametros que estan marcados con @nonnull
@NoArgsConstructor
public class RoleDto {
	@NonNull
	private Long id;

	private String nameRol;
	
	private String acces;
}