package pekan4;

public class PerulanganFor3 {

	public static void main(String[] args) {
		int j, i;
		j=0;
		for(i = 1; i <= 10; i++) {
			j=j+i;
			if ( i < 10) {
				System.out.print(i+" + ");
			} else {
				System.out.print(i);
			}
		}
		System.out.println();
		System.out.print("jumlah =  " + j);
		
	}

} 