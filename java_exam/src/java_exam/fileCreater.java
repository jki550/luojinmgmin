package java_exam;

import java.io.File;
import java.io.IOException;

public class fileCreater {

	public static void main(String[] args) throws IOException {
		File f= new File("D:\\Test.txt");
		if(f.exists()){
			System.out.println("已有，请使用");
		}else{
			f.createNewFile();
		}
		

	}

}
