package dao;

import java.sql.SQLException;
import java.util.List;

import metier.Vol;

public class VolDaoImpl implements VolDao {

	@Override
	public List<Vol> getAllVols() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vol> searchVolsByCriteria(String criteria) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Vol> sortVolsByCriteria(String criteria) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void reserveSeat(int idVol, int numSiege) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean checkSeatAvailability(int idVol, int numSiege) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Integer> getReservedSeats(int idVol) {
		// TODO Auto-generated method stub
		return null;
	}

}
