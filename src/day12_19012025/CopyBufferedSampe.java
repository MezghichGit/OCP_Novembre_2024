package day12_19012025;

import java.io.*;

public class CopyBufferedSampe {
	public static void copyWithBuffer(File source, File destination) throws IOException {

		try (InputStream in = new BufferedInputStream(new FileInputStream(source));
				OutputStream out = new BufferedOutputStream(new FileOutputStream(destination))) {
			byte[] buffer = new byte[1024];
			int lengthRead;
			while ((lengthRead = in.read(buffer)) > 0) {
				out.write(buffer, 0, lengthRead);
				out.flush();
			}
		}
	}
	
	public static void copyWithByte(File source, File destination) throws IOException {
		try (InputStream in = new FileInputStream(source); 
				OutputStream out = new FileOutputStream(destination)) {
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		File source = new File("D:\\ws_cursus_Java\\OCP17_Novembre_2024\\bin\\lorem.txt");
		File destination1 = new File("D:\\ws_cursus_Java\\OCP17_Novembre_2024\\bin\\lorem_Copy_byte.properties");
		File destination2 = new File("D:\\ws_cursus_Java\\OCP17_Novembre_2024\\bin\\lorem_Copy_buffer.properties");
		//copy(source,destination);
		
		long copyWithByteStart = System.nanoTime();
        copyWithByte(source, destination1);
        long copyWithByteEnd = System.nanoTime();
        
        long copyWithBufferStart = System.nanoTime();
        copyWithBuffer(source, destination2);
        long copyWithBufferEnd = System.nanoTime();
        
        long copyWithByteDuration = copyWithByteEnd - copyWithByteStart;
        long copyWithBufferDuration = copyWithBufferEnd - copyWithBufferStart;
        
        System.out.println("byte: " + copyWithByteDuration);
        System.out.println("buffer: " + copyWithBufferDuration);
	}

}
