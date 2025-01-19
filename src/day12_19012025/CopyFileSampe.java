package day12_19012025;

import java.io.File;
import java.io.IOException;
import java.io.*;
public class CopyFileSampe {
	
	public static void copy(File source, File destination) throws IOException {
		try (InputStream in = new FileInputStream(source); 
				OutputStream out = new FileOutputStream(destination)) {
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		File source = new File("D:\\ws_cursus_Java\\OCP17_Novembre_2024\\bin\\Zoo_en.properties");
		File destination = new File("D:\\ws_cursus_Java\\OCP17_Novembre_2024\\bin\\Zoo_en.propertiesCopy");
		copy(source,destination);
	}

}
