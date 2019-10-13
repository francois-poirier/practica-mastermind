package mastermind.dao.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import mastermind.dao.SessionImplementationDao;
import mastermind.models.StateValue;

public class SessionImplementationFileDao extends SessionImplementationDao {
	
	public static final String EXTENSION = ".mastermind";
    public static final String DIRECTORY = System.getProperty("user.dir") + "/partidas";
    
    private static File directory;
    
    static {
    	SessionImplementationFileDao.directory = new File(SessionImplementationFileDao.DIRECTORY);
        if (!SessionImplementationFileDao.directory.exists()) {
        	SessionImplementationFileDao.directory.mkdir();
        }
    }

	private GameFileDao gameFileDao;
	
	@Override
	public void load(String name) {
		this.sessionImplementation.setName(name);
		File file = new File(SessionImplementationFileDao.directory, name);
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
			this.gameFileDao.load(bufferedReader);
			this.sessionImplementation.resetRegistry();
			bufferedReader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		this.sessionImplementation.setStateValue(StateValue.IN_GAME);
		if (this.sessionImplementation.isLooser() || this.sessionImplementation.isWinner()) {
			this.sessionImplementation.setStateValue(StateValue.FINAL);
		}
	}

	@Override
	public String[] getGamesNames() {
		return SessionImplementationFileDao.directory.list();
	}

	@Override
	public void save(String name) {
		if (name.endsWith(SessionImplementationFileDao.EXTENSION)) {
			name = name.replace(SessionImplementationFileDao.EXTENSION, "");
		}
		File file = new File(SessionImplementationFileDao.directory, name + SessionImplementationFileDao.EXTENSION);
		try {
			FileWriter fileWriter = new FileWriter(file);
			this.gameFileDao.save(fileWriter);
			fileWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public boolean exists(String name) {
		for (String auxName : this.getGamesNames()) {
			if (auxName.equals(name + SessionImplementationFileDao.EXTENSION)) {
				return true;
			}
		}
		return false;
	}

}
