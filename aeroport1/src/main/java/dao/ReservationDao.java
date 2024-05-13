package dao;

import java.sql.SQLException;
import java.util.List;

import metier.Reservation;

public interface ReservationDao {
	
	public void saveReservation(Reservation res) throws SQLException;
    public void updateReservation(Reservation res) throws SQLException;
    public void deleteReservation(int id_reservation) throws SQLException;
    
    // Récupérer toutes les réservations
    public List<Reservation> getAllReservations() throws SQLException;
}
