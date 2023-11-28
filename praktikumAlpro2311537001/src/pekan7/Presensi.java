package pekan7;

public class Presensi {

	public static void main(String[] args) {
		Mahasiswa farhan = new Mahasiswa();
		farhan.setNim(2311532);
		farhan.setNama("Farhan A");
		farhan.Cetak();
	
		System.out.println(	farhan.getNama());
		System.out.println(	farhan.getNim());

	}

}
