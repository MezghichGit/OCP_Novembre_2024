package day12_19012025;
import java.util.*;
import java.io.*;
public class CopyTextFileSample {
	
	public static void writeFile(List<String> data , File destination) throws IOException{
		try(BufferedWriter writer =  new BufferedWriter(new FileWriter(destination))){
			for(String s:data) {
				writer.write(s);
				writer.newLine();
			}
		}
		
	}
	
	public static List<String> readFile(File source) throws IOException {
        List<String> data = new ArrayList<>();  // Type inféré avec le diamant <>
        
        try (BufferedReader reader = new BufferedReader(new FileReader(source))) {
            String s;
           
            while ((s = reader.readLine()) != null) {
                data.add(s);  
            }
        } 
     
        return data;  
    }
	public static void main(String[] args) throws IOException {
		File source = new File("D:\\ws_cursus_Java\\OCP17_Novembre_2024\\src\\animals.csv");
		File destination = new File("D:\\ws_cursus_Java\\OCP17_Novembre_2024\\src\\animalsCopy.csv");
		List<String> data = readFile(source);
		System.out.println(data);
		writeFile(data,destination);

	}

}
