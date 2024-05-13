package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vol {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
	private int id_vol;
	
	@ManyToOne
	@JoinColumn(name = "id_airport")
	private Airport airport;
	
	
	private String compagnie;
	private String date_depart;
	private String date_arrive;
	private int prix;
	
	
	public Vol() {
		
	}


	public Vol(int id_vol, Airport airport, String compagnie, String date_depart, String date_arrive, int prix) {
		
		this.id_vol = id_vol;
		this.airport = airport;
		this.compagnie = compagnie;
		this.date_depart = date_depart;
		this.date_arrive = date_arrive;
		this.prix = prix;
	}


	public Vol(Airport airport, String compagnie, String date_depart, String date_arrive, int prix) {
		
		this.airport = airport;
		this.compagnie = compagnie;
		this.date_depart = date_depart;
		this.date_arrive = date_arrive;
		this.prix = prix;
	}


	public int getId_vol() {
		return id_vol;
	}


	public void setId_vol(int id_vol) {
		this.id_vol = id_vol;
	}


	public Airport getAirport() {
		return airport;
	}


	public void setAirport(Airport airport) {
		this.airport = airport;
	}


	public String getCompagnie() {
		return compagnie;
	}


	public void setCompagnie(String compagnie) {
		this.compagnie = compagnie;
	}


	public String getDate_depart() {
		return date_depart;
	}


	public void setDate_depart(String date_depart) {
		this.date_depart = date_depart;
	}


	public String getDate_arrive() {
		return date_arrive;
	}


	public void setDate_arrive(String date_arrive) {
		this.date_arrive = date_arrive;
	}


	public int getPrix() {
		return prix;
	}


	public void setPrix(int prix) {
		this.prix = prix;
	} 
	
	
	
	
	
	
	
	
	
	
	
	
}
