package dao;

import java.sql.SQLException;
import java.util.List;

import metier.Vol;

public interface VolDao {
	
	// Récupérer tous les vols de la base de données
    List<Vol> getAllVols() throws SQLException;
    
    // Rechercher des vols par titre (ou d'autres critères)
    List<Vol> searchVolsByCriteria(String criteria) throws SQLException;
    
    // Trier les vols par critères tels que le prix, l'heure de départ, etc.
    List<Vol> sortVolsByCriteria(String criteria) throws SQLException;
    
    // Réserver un siège sur un vol spécifique
    void reserveSeat(int idVol, int numSiege);
    
    // Vérifier la disponibilité des sièges sur un vol
    boolean checkSeatAvailability(int idVol, int numSiege);
    
    // Obtenir tous les sièges réservés sur un vol spécifique
    List<Integer> getReservedSeats(int idVol);
}


