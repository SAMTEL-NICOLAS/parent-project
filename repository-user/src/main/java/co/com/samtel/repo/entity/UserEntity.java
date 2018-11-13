package co.com.samtel.repo.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.NaturalId;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity {

	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;
	@NaturalId
	@Column(name = "NAME")
	private String name;

	@Column(name = "USERNAME")
	private String username;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="user_rol",
	joinColumns = @JoinColumn(name = "user_id"),
	inverseJoinColumns = @JoinColumn(name = "rol_id"))
	private Set<RoleEntity> rol;

}
