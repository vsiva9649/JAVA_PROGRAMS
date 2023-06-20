package FileHandle;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file= new File("/home/siva/Videos/ashus/ashwini/test.txt");
//		System.out.println(filefolder.createNewFile());
		FileWriter pen = new FileWriter(file, true);
		pen.write("sabaribala \n");
		pen.write("yogesh balaji ");
		pen.write("ajitha ");
		pen.flush();
		pen.close();
		
	}

}
