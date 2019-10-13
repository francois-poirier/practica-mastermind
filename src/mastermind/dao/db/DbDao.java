package mastermind.dao.db;

import java.sql.Connection;

public interface DbDao {
	void save (String name, Connection connection, Boolean exists);
	void load (String name, Connection connection);
}
