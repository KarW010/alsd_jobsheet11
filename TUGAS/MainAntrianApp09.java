package TUGAS;

import java.util.Scanner;

public class MainAntrianApp09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueAntrian09 antrian = new QueueAntrian09();
        int pilih;

        do {
            System.out.println("\n=== ANTRIAN LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Jumlah Mahasiswa yang Mengantre");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    MahasiswaAntrian09 mhs = new MahasiswaAntrian09(nim, nama);
                    antrian.enqueue(mhs);
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    antrian.tampilAntrian();
                    break;
                case 4:
                    antrian.lihatDepan();
                    break;
                case 5:
                    antrian.lihatBelakang();
                    break;
                case 6:
                    System.out.println("Jumlah antrian: " + antrian.jumlahAntrian());
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 0:
                    System.out.println("Terima kasih telah menggunakan layanan.");
                    break;
                default:
                    System.out.println("Menu tidak tersedia.");
            }
        } while (pilih != 0);

        sc.close();
    }
}
