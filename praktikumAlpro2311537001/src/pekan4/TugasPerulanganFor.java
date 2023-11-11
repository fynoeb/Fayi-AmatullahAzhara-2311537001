package pekan4;

public class TugasPerulanganFor {
	static int size = 4;

	public static void main(String[] args) {
		bingkai();
		atas();
		bawah();
		bingkai();
  } public static void bingkai() {
		for (int i=1; i<=18; i++) { //bingkai atas
			if (i>1 && i<18) {
				System.out.print("=");
			} else {
				System.out.print("#");
			}
		} System.out.println();
  }
	
	public static void atas() {
		for (int i= 1; i<=size; i++) {
			System.out.print("|");
			for (int j=1; j<=(-2*i+8); j++) {
				System.out.print(" ");
			} System.out.print("<>");
			for (int k=1;k<=(4*i-4); k++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for (int j=1; j<=(-2*i+8); j++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	
	}
	public static void bawah() {
		for (int i= size; i>=1; i--) {
			System.out.print("|");
			for (int j=1; j<=(-2*i+8); j++) {
				System.out.print(" ");
			} System.out.print("<>");
			for (int k=1;k<=(4*i-4); k++) {
				System.out.print(".");
			}
			System.out.print("<>");
			for (int j=1; j<=(-2*i+8); j++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
	
}