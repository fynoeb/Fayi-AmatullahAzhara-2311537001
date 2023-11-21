package pekan6;

import java.util.Scanner;
public class Ternary1 {

	public static void main(String[] args) {
		double IPK;
		String stat1="Anda lulus sangat memusakan";
		Scanner input = new Scanner (System.in);
		System.out.print("input ipk anda: ");
		IPK =input.nextDouble();
		input.close();
		String hasil = (IPK > 2.75)?stat1:"Anda lulus memuaskan";
		System.out.println(hasil);
		
		}

}
