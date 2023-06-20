package FileHandle;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File file_obj=new File("/home/siva/Videos/Siva.txt");
//		System.out.println(file_obj.createNewFile());
//		System.out.println(file_obj.exists());
		System.out.println(file_obj.lastModified());
		Date dd = new Date(file_obj.lastModified());
		System.out.println(dd);
		System.out.println(file_obj.isDirectory());
		System.out.println(file_obj.isFile());
        System.out.println(file_obj.getName());
        System.out.println(file_obj.mkdir());
		System.out.println(file_obj.isDirectory());
		System.out.println(file_obj.mkdirs());
		System.out.println(file_obj.isDirectory());
	}

}
