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
				Paths.get("/Users/alejandroaguilar/Documents/codejam/Store Credit/"
						+ "src/com/aaguilar/code/jam/storecredit/example", "exampleInput"));
	}

	public static void resolveCases(List<String> storeCreditFile ){
		int cases = 0;
		cases = Integer.parseInt(storeCreditFile.get(0));
		System.out.println("Cases: "+cases);
		if(cases == 0){
			System.out.println("No tiene casos");
		}else{
			for(int noCase = 0 ; noCase < cases; noCase++){
				int initLine = noCase*3+1;
				for(int actualCase = 0; actualCase < 3 ; actualCase++){
					int credit = Integer.parseInt(storeCreditFile.get(initLine));
					String[] items = storeCreditFile.get(initLine+2).split(" ");
					for(String item : items){
						int count = 1;
						for(int iterator = count ; iterator < items.length; iterator++){
							int sum = Integer.parseInt(items[iterator])+Integer.parseInt(item);
							if(credit == sum){
								System.out.println("Case #"+(noCase+1)+":"+Integer.parseInt(item)+" "+ items[iterator]);
							}
							count++;
						}
					}
					
				}
			}
		}
	}
}
