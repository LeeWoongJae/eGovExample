package com.yedam;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.Test;

public class FileTest {

	
	@Test
	public void test1() {
		File file = new File("C:\\temp");
		String[] list =  file.list();
		for(int i =0;i<=list.length;i++) {
			System.out.println(list[i]);
		}
	}
	
	//@Test
	public void test2() {
		File file = new File("C:\\temp/original.png");
		// file.renameTo(new File("C:\\temp/originalCopy.png"));
		
	}
	
	@Test
	public void test3() throws Exception {
		FileInputStream fis = new FileInputStream(new File("C:\\temp","writer.txt"));
		FileOutputStream fos = new FileOutputStream(new File("C:\\temp","copy2.txt"));
		int temp;
		while((temp = fis.read() ) != -1) {
			fos.write(temp);
		}
		fis.close();
		fos.close();
	}
}
