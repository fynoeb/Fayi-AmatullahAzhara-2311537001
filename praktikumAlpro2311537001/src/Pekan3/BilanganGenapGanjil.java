package Pekan3;

import java.util.Scanner;

public class BilanganGenapGanjil {
	public static void main(String[] args) {
		long noBP;
		Scanner input = new Scanner (System.in);
		
		System.out.print("masukkan nomor BP anda: ");
		noBP =input.nextLong();
		input.close();
		
		if (noBP % 2 == 0) {
			System.out.println("Merupakan bilangan genap");
			
		} else {
			System.out.println("Merupakan bilangan ganjil");
		}

	}
}
