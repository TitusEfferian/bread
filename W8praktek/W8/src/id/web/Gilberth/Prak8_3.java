package id.web.Gilberth;

public class Prak8_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mahasiswa[]mhs = new Mahasiswa[3];//menginisiasi nilai indeks array sebesar 3
		
		mhs[0]= new Mahasiswa();
		mhs[1]= new Mahasiswa();
		mhs[2]= new Mahasiswa();
		
		mhs[0].nama = "Rino Yaohari"; mhs[0].jurusan = "SI";//mengisi data indeks 0
		mhs[1].nama = "Kevin Anggara"; mhs[1].jurusan = "DKV";//mengisi data indeks 1
		mhs[2].nama = "Olivia Leanartha"; mhs[2].jurusan = "ILKOM";//mengisi data indeks 2
		
		System.out.println("Data 3 orang mahasiswa UMN\n");//output 
		System.out.println("Nama                Jurusan");//output
		for(int i =0; i<3; i++)//statement untuk mengeluarkan data yang ada di dalam array mhs 
			{
			System.out.printf("%-20s %-10s\n", mhs[i].nama,mhs[i].jurusan);//output semua data
		}
	}

}
