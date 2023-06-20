package FileHandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class filereader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file= new File("/home/siva/Videos/ashus/ashwini/test.txt");
		FileReader reader = new FileReader(file);
		BufferedReader bufReader = new BufferedReader(reader);
//		System.out.println(reader.read());
//			int i = reader.read();
//			while (i!=-1) {
//			char ch = (char)i; 
//			System.out.print(ch);
//			i = reader.read();
//		}
		String i = bufReader.readLine();
		while(i!=null)
		{
		System.out.println(i);
		i = bufReader.readLine();
		}
		
	}

}
