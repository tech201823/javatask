package ango;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.charset.StandardCharsets;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Ango {
	public static void main(String[] args) {
		String srcFile = "address.txt";
		String val = "";
		try (BufferedReader br = Files.newBufferedReader(Paths.get(srcFile),StandardCharsets.UTF_8)){
			String line = "";
			while (((line = br.readLine())) != null) {
				val += line + "\r\n";
			}
		} catch (IOException e) {
			System.out.println("file cant open");
		}
		System.out.println(val);
	}
}


