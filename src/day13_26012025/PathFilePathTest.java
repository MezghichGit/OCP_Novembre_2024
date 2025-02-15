package day13_26012025;

import java.nio.file.*;

public class PathFilePathTest {
	public static void printPathInformation(Path path) {

		System.out.println("Filename is: " + path.getFileName());

		System.out.println("Root is: " + path.getRoot());
		Path currentParent = path;
		while ((currentParent = currentParent.getParent()) != null) {
			System.out.println(" Current parent is: " + currentParent);
		}
	}

	public static void main(String[] args) {
		printPathInformation(Paths.get("/zoo/armadillo/shells.txt"));
		System.out.println();
		printPathInformation(Paths.get("armadillo/shells.txt"));
	}
}