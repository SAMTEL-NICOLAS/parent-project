package co.com.samtel.repo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name = "ROL")
public class RoleEntity {
	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	
	@NaturalId
	@Column(name = "NAME_ROLE")
	private String nameRol;
	
	@Column(name = "ACCES")
	private String acces;
	
	@ManyToMany(mappedBy = "rol")
	private Set<UserEntity> user;
}
