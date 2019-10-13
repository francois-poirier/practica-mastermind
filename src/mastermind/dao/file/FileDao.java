package mastermind.dao.file;

import java.io.BufferedReader;
import java.io.FileWriter;

public interface FileDao {
	public void save (FileWriter fileWriter);
	public void load (BufferedReader bufferedReader);
}
