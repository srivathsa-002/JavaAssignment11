package Assignment11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class FileWorker {
	private HashMap<Character,Integer> map;
	public FileWorker() {
		map = new HashMap<Character,Integer>();
	}
	public HashMap<Character,Integer> mapper(File file) {
		if(file.exists()) {
			try {
				BufferedReader br = new BufferedReader(new FileReader(file));
				int c;
				while((c = br.read()) != -1){
					char ch = (char) c;
					if(!map.containsKey(ch)) {
						map.put(ch, 1);
					}
					else
						map.put(ch, map.get(ch)+1);
				}
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		else {
			System.out.println("File doesn't Exist!!!");
			System.exit(0);
		}
		return map;
	}
	public void writeToFile(HashMap<Character,Integer> result) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("/home/muthyala/output1.txt"));
			for(char ch:result.keySet()) {
				bw.write(ch + " : " + result.get(ch));
				bw.newLine();
			}
			bw.flush();
			bw.close();
			System.out.println("Writting to File Accomplished.");
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}