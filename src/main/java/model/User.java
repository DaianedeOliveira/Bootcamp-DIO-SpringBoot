package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tab_user")
public class User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
		
	private Integer id;
	@Column(length = 50, nullable = false)
	private String user;
	@Column(length = 20, nullable = false)
	private String username;
	@Column(length = 100, nullable = false)
	private String password;
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	
	@Override
	public String toString() {
		return "BootcampSpring [id=" + id + ", user=" + user + ", username=" + username + ", password=" + password
				+ ", getId()=" + getId() + ", getPassword()=" + getPassword() + ", getUser()=" + getUser()
				+ ", getUsername()=" + getUsername() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
