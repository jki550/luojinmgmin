package java_exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class bufferDemo {


	public static void main(String[] args) throws IOException {
	File scr=new File("D:\\Test.txt");
	File dest=new File("F:\\TestCopy.txt");
	
	Reader in=new FileReader(scr);
	BufferedReader tem=new BufferedReader(in);
	
	Writer doc=new FileWriter(dest);
	BufferedWriter abc=new BufferedWriter(doc);
	
	String str=(String)tem.readLine();
	while(str!=null){
		abc.write(str);
		abc.newLine();
		str=tem.readLine();
		}
	tem.close();
	abc.close();
	System.out.println("adsa");
	}

}
