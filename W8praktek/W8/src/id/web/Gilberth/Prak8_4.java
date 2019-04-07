package id.web.Gilberth;
import java.util.Scanner;

public class Prak8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input banyak data: ");
		int sum = scan.nextInt();
		Mahasiswa[]mhs = new Mahasiswa[sum];
		
		int a;
		for (a = 0; a<sum;a++) {
			
			int i = 1;
			System.out.printf("Data ke %d\n ", i);
			System.out.println("Nama: ");
			mhs[a].setNama = scan.next();
			System.out.println("Jurusan: \n");
			mhs[a].setJurusan = scan.next();
			System.out.println("Nilai: \n");
			mhs[a].setNilai = scan.nextDouble();
			
			i++;
		}
		
		for (int aa = 1;aa<=sum;aa++) {
			if (mhs[a].nilai>100) {
				if (mhs[a].nilai>100) {
			}
			System.out.println ("Data Mahasiswa UMN");
			System.out.println ("=====================");
			System.out.println("No    Nama    Jurusan   Nilai Praktikum");
			System.out.printf("%d   %s-30    %s-20   %.2f", aa, mhs[a].nama,mhs[a].jurusan,mhs[a].nilai);
		}
		
		
	}

}
}
