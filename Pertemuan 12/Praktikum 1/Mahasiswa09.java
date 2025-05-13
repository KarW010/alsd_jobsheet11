public class Mahasiswa09 {
    String nim, nama, kelas;
    double ipk;

    Mahasiswa09() {
    }

    Mahasiswa09(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println("Nama: " + nama + "\tNIM: " + nim + "\tKelas: " + kelas + "\tIPK: " + ipk);
    }
}
