package no7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class JavaIO_06 {
	public static void main(String[] args) {
		try(BufferedReader in = new BufferedReader(new FileReader("sample.txt"))){
		for(int i = 0; i < 3; i++){
			in.skip(i);
			System.out.print((char)in.read());
		}

		in.mark(3);
		System.out.print(in.readLine());
		in.reset();
		System.out.print((char)in.read());
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}
