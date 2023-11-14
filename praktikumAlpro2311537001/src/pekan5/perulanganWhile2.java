package pekan5;

import java.util.Scanner;

public class perulanganWhile2 {

	public static void main(String[] args) {
		// buat variabel
		int counter = 0;
		String jawab = "ya";
		// deklarasi scanner
		
		Scanner scan = new Scanner(System.in);
		 scan.close();
		while(jawab.equalsIgnoreCase("ya")) {
			counter++;
			System.out.println("Jumlah ="+counter);
			System.out.println("Apakah lanjut (ya/tidak?)");
			jawab= scan.nextLine();
			
		}System.out.println("Anda sudah melakukan perulangan sebanyak "+counter+ " kali");

	}

}
