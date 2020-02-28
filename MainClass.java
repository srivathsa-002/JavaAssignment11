package Assignment11;
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter file name:");
		String fileName = sc.next();
		File f = new File(fileName);
		FileWorker fw = new FileWorker();
		HashMap<Character,Integer> result = fw.mapper(f);
		//System.out.println(result);
		fw.writeToFile(result);
	}
}