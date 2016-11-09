package java_exam;

import java.awt.image.BandCombineOp;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;

import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class copyShiping {

	public static void main(String[] args) throws IOException {
	File scr=new File("E:\\Vedeo\\26数组静态赋值+二维数组_2016-10-21_120321.wmv");
	File dest=new File("F:\\26数组静态赋值+二维数组_2016-10-21_120321.wmv");
	
	InputStream in=new FileInputStream(scr);
	BufferedInputStream bi=new BufferedInputStream(in);

	OutputStream abc=new FileOutputStream(dest);
	BufferedOutputStream bo=new BufferedOutputStream(abc);
	
	/*byte[] tem =new byte[(int)scr.length()];
	bi.read(tem);
	bo.write(tem);
	
	bi.close();
	bo.close();
	System.out.println("sdsada");*/
	int len = 0;
	byte[] tem = new byte[1024];
	while((len=bi.read(tem))!=-1){
		bo.write(tem, 0, len);}
		bi.close();
		bo.close();
		System.out.println("sdsada");
	
	
	}}


