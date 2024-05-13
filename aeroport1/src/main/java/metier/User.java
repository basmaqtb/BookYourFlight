package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_user;
	private String name;
	private String email;
	
	
	@ManyToOne
	@JoinColumn(name = "id_passager")
	private Passager passager;


	public int getId_user() {
		return id_user;
	}


	public void setId_user(int id_user) {
		this.id_user = id_user;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Passager getPassager() {
		return passager;
	}


	public void setPassager(Passager passager) {
		this.passager = passager;
	}


	public User(int id_user, String name, String email, Passager passager) {
		this.id_user = id_user;
		this.name = name;
		this.email = email;
		this.passager = passager;
	}


	public User() {
		
	}


	public User(String name, String email, Passager passager) {
		this.name = name;
		this.email = email;
		this.passager = passager;
	}
	
	

}
