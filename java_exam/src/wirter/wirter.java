package wirter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;

public class wirter {

	public static void main(String[] args) throws IOException {
		File fe=new File("F:\\xiti.txt");
		if (fe.exists()) {
			fe.delete();
			System.out.println("原文件删除，建立新文件");
		} 
        
 		fe.createNewFile();
		OutputStream out=new FileOutputStream(fe,true);
		OutputStreamWriter w=new OutputStreamWriter(out,"utf-8");
		w.write("只是一个java上机的文档文件：\r\n");
		w.write("一个正整数，它加上100后是一个完全平方数，再加上168又是一个完全平方数，请问该数是多少？\r\n");
		w.write("需要参数如下：通过程序读取文本文件解析下面字符串得到需要的数值\r\n");
		w.write("100#168#1000\r\n");
		w.flush();
		System.out.println("题目写入完毕");
		
		InputStream in=new FileInputStream(fe);
		Reader re=new InputStreamReader(in, "utf-8");
		char[] array=new char[(int) fe.length()];
		re.read(array);
		System.out.println("读取文本内容： "+"\n"+new String(array));
		System.out.println("需要的参数");
		
//		String str = "#";
		String temp = "100#168#1000";

		String[] demo = temp.split("#");
		int[] num = new int[demo.length];
		for (int i = 0; i <= demo.length - 1; i++) {
			num[i] = Integer.valueOf(demo[i]);
	
		for (int j = 1; j <= num[2]; j++) {
			if (Math.sqrt(j + num[0]) % 1 == 0 && Math.sqrt(i + num[0] + num[1]) % 1 == 0) {
				System.out.println("1000内这个数是：" + i);
				w.write("\r\n" + i);
				w.flush();}
			}
		}
		System.out.println("结果已经存在与文本末尾");

			} 
	}


