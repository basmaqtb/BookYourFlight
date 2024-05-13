package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Passager {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_passager;
	private String Nom;
	
	
	
	

	public Passager() {
		
	}

	public Passager(String nom) {
		
		Nom = nom;
	}

	public Passager(int id_passager, String nom) {
		
		this.id_passager = id_passager;
		Nom = nom;
	}

	public int getId_passager() {
		return id_passager;
	}

	public void setId_passager(int id_passager) {
		this.id_passager = id_passager;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}
	
	

}
