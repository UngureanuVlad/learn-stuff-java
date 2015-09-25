package ro.learnstuff.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileFeatures {

	public void showFiles(File currentDir){
		try {
			File[] files = currentDir.listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					showFiles(file);
				} else {
					System.out.println(file.getCanonicalPath());
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void showFilesJ8() throws IOException{
		Files.walk(new File(".").toPath())
	     .filter(p -> !p.toString()
	                    .contains(File.separator + "."))
	     .forEach(System.out::println);
	}
}
