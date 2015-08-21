package com.aaguilar.code.jam.storecredit.controller;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Util {
	private static List<String> lines;
	public static void setInputFile(Path path) throws IOException{
		lines = Files.readAllLines(path);
	}
	
	public static List<String> getInputFile() throws IOException{
		return lines;
	}
}
