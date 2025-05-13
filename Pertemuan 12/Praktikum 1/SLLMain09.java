public class SLLMain09 {
    public static void main(String[] args) {
        SingleLinkedList09 data = new SingleLinkedList09();

        Mahasiswa09 mhs1 = new Mahasiswa09("23401", "Andi", "TI-4A", 3.5);
        Mahasiswa09 mhs2 = new Mahasiswa09("23402", "Budi", "TI-4B", 3.8);
        Mahasiswa09 mhs3 = new Mahasiswa09("23403", "Citra", "TI-4A", 3.7);
        Mahasiswa09 mhs4 = new Mahasiswa09("23404", "Dina", "TI-4C", 3.6);

        data.print();
        data.addFirst(mhs1); data.print();
        data.addLast(mhs2);  data.print();
        data.insertAfter("23401", mhs3); data.print();
        data.insertAt(1, mhs4); data.print();
    }
}
