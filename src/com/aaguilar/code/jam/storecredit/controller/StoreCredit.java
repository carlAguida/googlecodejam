package com.aaguilar.code.jam.storecredit.controller;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

public class StoreCredit {

	public static void main(String[] args) throws IOException {
		setFile();
		resolveCases(Util.getInputFile());		
	}
	
	
	public static void setFile() throws IOException{
		Util.setInputFile(
				Paths.get("/Users/alejandroaguilar/googlecodejam/"
						+ "src/com/aaguilar/code/jam/storecredit/example",
						"A-large-practice.in"));
	}

	public static void resolveCases(List<String> storeCreditFile ){
		int numCases = Integer.parseInt(storeCreditFile.get(0));
		int actualLineCase = 1;
		int credit = 0;
		int noItems = 0;
		int priceAddsUp = 0;
		int itemOne = 0;
		int itemTwo = 0;
		
		for (int cases = 1; cases <= numCases; cases++ ){
			credit = Integer.parseInt(storeCreditFile.get(actualLineCase));
			noItems = Integer.parseInt(storeCreditFile.get(actualLineCase+1));
			String[] items = storeCreditFile.get(actualLineCase+2).split(" ");
			for(int itemBase = noItems-1; itemBase > 0 ; itemBase--){
				for(int itemAux = itemBase-1; itemAux >= 0; itemAux--){
					itemOne = itemBase+1;
					itemTwo = itemAux+1;
					priceAddsUp = Integer.parseInt(items[itemBase]) + 
							Integer.parseInt(items[itemAux]);
					if(priceAddsUp == credit){
						System.out.println("Case #"+cases+": "+itemTwo+" "+itemOne);
					}
				}
			}	
			actualLineCase+=3;
		}
	}
}
