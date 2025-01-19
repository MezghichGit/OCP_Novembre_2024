package day12_19012025;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
public class Exemple_IO {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		/*
		System.out.println(System.getProperty("file.separator"));
		System.out.println(java.io.File.separator);
		File file = new File("C:/Users/Amine/Desktop/videos_Cursus_Java");
		System.out.println(file.exists());
		
		File fileData = new File("C:\\Users\\Amine\\Desktop\\OCP17\\data.txt");
		try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileData)))
		{
			System.out.println(bufferedReader.readLine());
		}
		*/
		File file =  new File("C:\\Users\\Amine\\Desktop\\OCP17\\data.txt");
		try (BufferedInputStream is = new BufferedInputStream(new FileInputStream(file))){
			System.out.print((char)is.read());
			
			if(is.markSupported()) {
				is.mark(100);
				System.out.print((char)is.read());
				System.out.print((char)is.read());
				is.reset();
			}
			System.out.print((char)is.read());
			System.out.print((char)is.read());
			System.out.print((char)is.read());
		} catch (IOException e1) {
			// TODO Au
		}

	}

}
