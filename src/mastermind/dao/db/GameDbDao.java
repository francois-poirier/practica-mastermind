package mastermind.dao.db;

import java.sql.Connection;

import mastermind.dao.GameDao;
import mastermind.models.Game;

public class GameDbDao extends GameDao implements DbDao {

	public GameDbDao(Game game) {
		super(game);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(String name, Connection connection, Boolean exists) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void load(String name, Connection connection) {
		// TODO Auto-generated method stub
		
	}

}
