package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Siege {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) //auto-increment
	private int id_siege;
	
	@ManyToOne
	@JoinColumn(name = "id_vol")
	private Vol vol;
	
	private int num_siege;
	
    private boolean available;

	
	
	
	
	

	public Siege() {
	}


	
	
	public Siege(Vol vol, int num_siege, boolean available) {

		this.vol = vol;
		this.num_siege = num_siege;
		this.available = available;
	}




	public Siege(int id_siege, Vol vol, int num_siege, boolean available) {
		this.id_siege = id_siege;
		this.vol = vol;
		this.num_siege = num_siege;
		this.available = available;
	}




	public int getId_siege() {
		return id_siege;
	}

	public void setId_siege(int id_siege) {
		this.id_siege = id_siege;
	}

	public Vol getVol() {
		return vol;
	}

	public void setVol(Vol vol) {
		this.vol = vol;
	}

	public int getNum_siege() {
		return num_siege;
	}

	public void setNum_siege(int num_siege) {
		this.num_siege = num_siege;
	}




	public boolean isAvailable() {
		return available;
	}




	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	
	

}
