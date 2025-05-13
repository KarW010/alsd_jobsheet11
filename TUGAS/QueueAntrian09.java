package TUGAS;

public class QueueAntrian09 {
    NodeAntrian09 front, rear;

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(MahasiswaAntrian09 mhs) {
        NodeAntrian09 baru = new NodeAntrian09(mhs);
        if (isEmpty()) {
            front = rear = baru;
        } else {
            rear.next = baru;
            rear = baru;
        }
        System.out.println(mhs.nama + " berhasil mendaftar ke dalam antrian.");
    }

    public void dequeue() {
        if (!isEmpty()) {
            MahasiswaAntrian09 keluar = front.data;
            front = front.next;
            if (front == null) rear = null;
            System.out.println(keluar.nama + " telah dipanggil dari antrian.");
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void clear() {
        front = rear = null;
        System.out.println("Antrian dikosongkan.");
    }

    public void tampilAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar Antrian:");
            NodeAntrian09 temp = front;
            while (temp != null) {
                temp.data.tampil();
                temp = temp.next;
            }
        }
    }

    public void lihatDepan() {
        if (!isEmpty()) {
            System.out.print("Antrian terdepan: ");
            front.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public void lihatBelakang() {
        if (!isEmpty()) {
            System.out.print("Antrian terakhir: ");
            rear.data.tampil();
        } else {
            System.out.println("Antrian kosong.");
        }
    }

    public int jumlahAntrian() {
        int count = 0;
        NodeAntrian09 temp = front;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}
