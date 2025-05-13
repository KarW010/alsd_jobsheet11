import java.util.Scanner;

public class SLLMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList09 data = new SingleLinkedList09();

        System.out.print("Masukkan jumlah data mahasiswa: ");
        int jumlah = sc.nextInt(); 
        sc.nextLine();

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble(); 
            sc.nextLine(); 

            Mahasiswa09 mhs = new Mahasiswa09(nim, nama, kelas, ipk);

            data.addLast(mhs);
            data.print();
        }
    }
}
