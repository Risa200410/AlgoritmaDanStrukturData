package AlgoritmaDanStrukturData.Pertemuan5;

public class Tugas3Main {
    public static void main(String[] args) {
        int []a = {12, 15, 6, 3, 70, 51, 83, 15, 3, 83};
        Tugas3 urut = new Tugas3(a, a.length);

        System.out.println("Data sebelum urut");
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        System.out.println("Data sesudah urut Bubble sort (ASC)");
        urut.bubbleSort();
        urut.tampilData();
        System.out.println("Angka terkecil: " + urut.terkecil());
        System.out.println("Angka terbesar: " + urut.terbesar());
    }
}

