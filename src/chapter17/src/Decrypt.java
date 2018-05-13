import java.io.*;
import java.util.Scanner;

public class Decrypt {
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);

		
		System.out.print("Enter an input file: ");
		String input = scanner.next();
		
		
		System.out.print("Enter an output file: ");
		String output = scanner.next();

		try ( 									//inputfile
			RandomAccessFile encrypted = new RandomAccessFile(input, "r");
				
												//outputfile
			RandomAccessFile decrypted = new RandomAccessFile(output, "rw");
		) {
			
			int r;
			encrypted.seek(0); 
			while ((r = encrypted.read()) != -1) 
			{						//subtract 5 bytes
				decrypted.write(((byte)r) - 5);
			}
		}
	}
}