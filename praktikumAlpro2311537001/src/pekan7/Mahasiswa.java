package pekan7;

public class Mahasiswa {
	//variablglobal
	private int nim;
	private String nama;
	//membuat mutaor setter
	public void setNim (int nim) {
		this.nim=nim;
	}
	public void setNama (String nama) {
		this.nama=nama;
	}
	//membuat accessor (getter)
	public int getNim() {
		return nim;
	}
	public String getNama() {
		return nama;
	}
	//metode lain
	public void Cetak() {
		System.out.println("NIM : "+nim);
		System.out.println("Nama : "+nama);
	}

}
