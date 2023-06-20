package FileHandle;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class bufferedwriter {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file= new File("/home/siva/Videos/ashus/ashwini/test.txt");
		FileWriter pen = new FileWriter(file, true);
		BufferedWriter bufWriter = new BufferedWriter(pen);

		bufWriter.write("ajitha ");
		bufWriter.newLine();
		bufWriter.write("sabaribala");
		bufWriter.newLine();
		bufWriter.write("yogesh balaji ");
		bufWriter.newLine();
		bufWriter.flush();
		bufWriter.close();
	}

}
