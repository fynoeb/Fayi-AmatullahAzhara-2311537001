package pekan4;

import java.util.Scanner;

public class PerulanganFor4 {

	public static void main(String[] args) {
		int j, i;
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan nilai batas = ");
		int Input = input.nextInt();
		input.close();
		j=0;
		
		    for(i = 1; i <= Input; i++) {
			j=j+i;
			if ( i < Input) {
				System.out.print(i+" + ");
			} else {
				System.out.print(i + " = ");
			}
		}
		System.out.println();
		System.out.print("jumlah =  " + j);
		
	}

} 