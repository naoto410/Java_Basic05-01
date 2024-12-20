package mypackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class index {
    public static void main(String[] args) {
    	String readFilePath = "./src/mypackage/originalWord.txt";
    	String writeFilePath = "./src/mypackage/reverseWord.txt";
    	try (
    		BufferedReader br = new BufferedReader(new FileReader(readFilePath));
    	    BufferedWriter bw = new BufferedWriter(new FileWriter(writeFilePath))
    	){	
    	    String line;
    	    while ((line = br.readLine()) != null) {
    	    	String reversedLine = new StringBuilder(line).reverse().toString();
    	    	bw.write(reversedLine);
    	    	bw.newLine();
    	    }
    	} catch (IOException e) {
    		e.printStackTrace();
    	}
    }
}