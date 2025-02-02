package day14_02022025;
import java.io.IOException;
import java.nio.file.*;
public class Suite_NIO2 {

	public static void main(String[] args) throws IOException {
		/*
		System.out.println(Files.isDirectory(Paths.get("/canine/coyote/fur.jpg")));
		System.out.println(Files.isRegularFile(Paths.get("/canine/types.txt")));
		System.out.println(Files.isSymbolicLink(Paths.get("/canine/coyote")));
		
		Path path = Paths.get("D:\\ws_cursus_Java\\OCP17_Novembre_2024\\src\\day14_02022025\\Suite_NIO2.java");
		System.out.println(Files.getOwner(path).getName());
		*/
		Path path = Paths.get("D:\\ws_cursus_Java\\OCP17_Novembre_2024");
		try {Files.walk(path).filter(p -> p.toString().endsWith(".java")).forEach(System.out::println);}
		catch (IOException e) {
			// Handle file I/O exception...
			} 
		}

	}

