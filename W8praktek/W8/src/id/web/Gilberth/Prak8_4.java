package id.web.Gilberth;
import java.util.Scanner;

public class Prak8_4 {

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
			mhs[a] = new Mahasiswa();
			int i = 1;
			System.out.printf("Data ke %d\n ", i);
			System.out.println("Nama: ");
			mhs[a].setNama(scan.next());
			System.out.println("Jurusan: \n");
			mhs[a].setJurusan(scan.next());
			System.out.println("Nilai: \n");
			mhs[a].setNilai(scan.nextDouble());
			
			i++;
		}
		
		System.out.println("Data Mahasiswa UMN");
        System.out.println("=====================");
        System.out.println("No    Nama    Jurusan   Nilai Praktikum");
        a =0;
        for (int aa = 1; aa <= sum; aa++) {
            if (mhs[a].getNilai() > 100) {
                mhs[a].setNilai(00.00);
            }

               
                System.out.printf("%d   %s    %s   %.2f\n", aa, mhs[a].getNama(), mhs[a].getJurusan(), mhs[a].getNilai());
                a++;
        }
		}
		
		
	}


