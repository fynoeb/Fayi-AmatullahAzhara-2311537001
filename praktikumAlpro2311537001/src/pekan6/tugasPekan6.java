package pekan6;
import java.util.Scanner;

public class tugasPekan6 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
        System.out.println("Inputkan Angka : ");
        double n = in.nextInt();
        
        for (int i=1; i<=n; i++) {
        	if (i%2 == 1 ) {
        		for (int j=1; j<=Math.ceil(n/2); j++) {
        			 System.out.print("- ");
        		}
        	} else {
        		for (int j=1; j<=Math.floor(n/2); j++) {
       			 System.out.print(" -");
        	}
        		
        }
        	System.out.println();
	}
}
}