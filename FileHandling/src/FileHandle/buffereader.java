package FileHandle;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class buffereader {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file= new File("/home/siva/Videos/ashus/ashwini/test.txt");
		FileReader reader = new FileReader(file);
		BufferedReader bufReader = new BufferedReader(reader);
		String i = bufReader.readLine();
		  int no_of_lines = 0; 
		  int no_of_letters =0;
		  while(i!=null)
		  {
		  System.out.println(i + " " + i.length());
		  no_of_letters = no_of_letters + i.length();
		  i = bufReader.readLine();
		  no_of_lines++; 
		  }
		System.out.println(no_of_lines);
		System.out.println(no_of_letters);
	}

}
