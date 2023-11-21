package pekan6;

import java.util.Scanner;
public class switchCase1 {

	public static void main(String[] args) {
			Scanner in = new Scanner (System.in);
            System.out.println("Inputkan pilihan anda (1-3) : ");
            int n = in.nextInt();
            switch(n) {
            case 1:
            	System.out.println("Anda Memilih Anies");
            	break;
            case 2:
                System.out.println("Anda Memilih Prabowo");
                break;
            case 3:
            	System.out.println("Anda Memilih Ganjar");
            	break;
            default:
            		System.out.println("Pilihan anda bukan nomor 1 sampai 3");
            }
            System.out.println("Terimakasih anda sudah memilih");
	}

}
