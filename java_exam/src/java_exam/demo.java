package java_exam;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

public class demo {
	public static void main(String[] args) throws IOException {
		File src=new File("F:\\72IO_2016-11-03_104235.wmv");
		File desk=new File("F:\\72IO_2016-11-03_104235copy.wmv");
		desk.createNewFile();
		InputStream inputStream=new FileInputStream(src);
		BufferedInputStream inputStream2=new BufferedInputStream(inputStream);
		OutputStream outputStream=new FileOutputStream(desk);
		BufferedOutputStream outputStream2=new BufferedOutputStream(outputStream);
		int num=(int)src.length()/(1024*1024);
		
		for(int i=0;i<=num;i++)
		{
		byte buffer []=new byte[1024*1024];
		inputStream2.read(buffer);
		outputStream2.write(buffer);
		inputStream2.mark(i*1024*1024);
		//copy文件变在此处标记
		if(inputStream2.available()<1024*1024)
			//当输入文件没有定义的空间大时
		{
			byte buffer2[]=new byte[inputStream2.available()];
			//重新定义一个新的空间，空间大小和剩余的一样大
			inputStream2.read(buffer2);
			outputStream2.write(buffer2);
			break;
		}
		}
		outputStream.close();
		inputStream.close();
		
	}
}
