package pekan5;

import java.util.Scanner;

public class perulanganDoWhile {

	public static void main(String[] args) {
		int umur;
		char sim;
		String jawab = "ya";
		
		Scanner scan = new Scanner(System.in);
		do {
	
		System.out.print("input umur anda: ");
		umur = scan.nextInt();
		
		System.out.print("apakah anda sudah mempunyai sim c: ");
		sim=scan.next().charAt(0);
		
		if ( (umur >= 17) && (sim=='y')) {
			System.out.println("anda sudah dewasa dan boleh bawa motor ");
		}
		if ( (umur >= 17) && (sim!='y')) {
			System.out.println("anda sudah dewasa tetapi belum boleh bawa motor ");
		}
		if ( (umur < 17) && (sim !='y')) {
			System.out.println("anda belum cukup umur bawa motor ");
		}
		if ( (umur < 17) && (sim =='y')) {
			System.out.println("anda belum cukup umur punya SIM ");
		}
	    scan.nextLine();
		System.out.println("Apakah lanjut (ya/tidak?)");
		jawab= scan.next();
		
		
	}		while(!jawab.equalsIgnoreCase("tidak"));
		System.out.println("terimakasih sudah menggunakan program ini");
		 scan.close();
	}
	   
	
}




	
