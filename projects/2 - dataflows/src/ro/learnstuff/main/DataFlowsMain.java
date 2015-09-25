package ro.learnstuff.main;

import java.io.File;
import java.io.IOException;

import ro.learnstuff.file.FileFeatures;
import ro.learnstuff.file.FileReaders;
import ro.learnstuff.file.FileWriters;

public class DataFlowsMain {

	public static void main(String[] args){
		FileReaders fileReaders = new FileReaders();
		FileWriters fileWriters = new FileWriters();
		showLine();
		fileWriters.writeFile();
		fileReaders.readFile();
		
		fileWriters.writeFileString();
		fileReaders.readFileJ8String();
		
		fileReaders.readFileJ8String();
		
		FileFeatures fileFeatures = new FileFeatures();
		showLine();
		File currentDir = new File(".");
		fileFeatures.showFiles(currentDir);
		
		// showing throws functionality
		try {
			showLine();
			fileFeatures.showFilesJ8();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	 
	// helper method
	private static void showLine(){
		System.out.println("=========================================================");
	}
}
