package day13_26012025;
import java.io.IOException;
import java.nio.file.*;
public class IsAbsolutePaths_ToAbosultePath {

	public static void main(String[] args) throws IOException {
		/*
		Path path1 = Paths.get("C:\\birds\\egret.txt");
		System.out.println("Path1 is Absolute? "+path1.isAbsolute());
		System.out.println("Absolute Path1: "+path1.toAbsolutePath());
		Path path2 = Paths.get("birds/condor.txt");
		System.out.println("Path2 is Absolute? "+path2.isAbsolute());
		System.out.println("Absolute Path2 "+path2.toAbsolutePath());
		*/
		Path path = Paths.get("/mammal/carnivore/raccoon.image");
		System.out.println("Path is: "+path); 
		System.out.println("Subpath from 0 to 3 is: "+path.subpath(0,3));
		System.out.println("Subpath from 1 to 3 is: "+path.subpath(1,3));
		System.out.println("Subpath from 1 to 2 is: "+path.subpath(1,2)); 
		Path path2 = Paths.get("animal.data");
		//System.out.println(path2);
		System.out.println(path2.toRealPath()); // vérifie l'existance du file
	}

}
