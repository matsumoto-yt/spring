package jp.co.internous.ecsite.model.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Table (name="user")

public class User {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="id_admin")
	private int idAdmin;
	
	
	private void setId(long id) {
		this.id = id;
	}
	
	public long getId() {
		return id;
	}
	
	private void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	private void setPassoword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	private void setIdAdmin(int idAdmin) {
		this.idAdmin = idAdmin;
	}
	
	public int getIdAdmin() {
		return idAdmin;
	}
	
	

}
