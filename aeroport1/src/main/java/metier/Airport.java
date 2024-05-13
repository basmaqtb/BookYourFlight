package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Airport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
	private int id_airport;
	private String nom;
	private String ville_depart;
	private String ville_arrive;
	private String pays;
	
	
	public Airport() 
	{}

	
	 

	public Airport(String nom, String ville_depart, String ville_arrive, String pays) {
		
		this.nom = nom;
		this.ville_depart = ville_depart;
		this.ville_arrive = ville_arrive;
		this.pays = pays;
	}




	public Airport(int id_airport, String nom, String ville_depart, String ville_arrive, String pays) {
		
		this.id_airport = id_airport;
		this.nom = nom;
		this.ville_depart = ville_depart;
		this.ville_arrive = ville_arrive;
		this.pays = pays;
	}


	public int getId_airport() {
		return id_airport;
	}


	public void setId_airport(int id_airport) {
		this.id_airport = id_airport;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getVille_depart() {
		return ville_depart;
	}


	public void setVille_depart(String ville_depart) {
		this.ville_depart = ville_depart;
	}


	public String getVille_arrive() {
		return ville_arrive;
	}


	public void setVille_arrive(String ville_arrive) {
		this.ville_arrive = ville_arrive;
	}


	public String getPays() {
		return pays;
	}


	public void setPays(String pays) {
		this.pays = pays;
	}
	
	
	

}
