package com.rankminer.featurevectoranalyzer;

import java.io.BufferedReader;
import java.io.IOException;

public class ProcessOutputReader implements Runnable {

	private BufferedReader reader;
	public ProcessOutputReader (BufferedReader br) {
		this.reader = br;
	}
	
	
	@Override
	public void run() {
		String line;
		try {
			while((line = reader.readLine()) != null) {
			    System.out.println(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

}
