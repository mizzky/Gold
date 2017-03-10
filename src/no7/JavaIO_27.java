package no7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaIO_27 {
	public static void main(String[] args) throws IOException {

		Path file = Paths.get("sample.txt");

		//ファイルサイズ取得
		long fileSize = (long)Files.getAttribute(file, "size");
		System.out.println(fileSize);

	}
}
