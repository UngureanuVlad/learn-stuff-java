package ro.learnstuff.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Optional;
import java.util.stream.Stream;

public class FileReaders {

	public void readFile() {
		try {
			File file = new File("test.txt");
			FileReader fr;

			fr = new FileReader(file);

			BufferedReader br = new BufferedReader(fr);
			String line;
			while ((line = br.readLine()) != null) {
				if (line.contains("Hello")) {
					System.out.println(line);
				}
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// log error
		} catch (IOException e) {
			// log error
		}
	}
	
	public void readFileJ8String() {
		try {
			String content = new String(Files.readAllBytes(Paths.get("test.txt")));
			System.out.println(content);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void readFileJ8Stream() {
		Path path = Paths.get("test.txt");
		// The stream hence file will also be closed here
		try (Stream<String> lines = Files.lines(path)) {
			Optional<String> hasPassword = lines.filter(s -> s.contains("Hello")).findFirst();
			if (hasPassword.isPresent()) {
				System.out.println(hasPassword.get());
			}
		} catch (IOException e) {
			// log error
		}
	}

}
