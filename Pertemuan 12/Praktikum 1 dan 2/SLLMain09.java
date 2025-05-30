import java.util.Scanner;

public class SLLMain09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingleLinkedList09 sll = new SingleLinkedList09();

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
            double ipk = sc.nextDouble(); sc.nextLine();

            Mahasiswa09 mhs = new Mahasiswa09(nim, nama, kelas, ipk);
            sll.addLast(mhs);
            sll.print();
            
            System.out.println("data index 1 : ");
            sll.getData(1);

            System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexOf("bimon"));
            System.out.println();

            sll.removeFirst();
            sll.removeLast();
            sll.print();
            sll.removeAt(0);
            sll.print();
        }
    }
}
