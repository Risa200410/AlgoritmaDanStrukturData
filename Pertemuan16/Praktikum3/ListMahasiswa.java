package AlgoritmaDanStrukturData.Pertemuan16.Praktikum3;

import java.util.*;

public class ListMahasiswa {
    List<Mahasiswa> mahasiswas=new ArrayList<>();

    public void tambah (Mahasiswa... mahasiswa){
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index){
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa mhs){
        mahasiswas.set(index, mhs);
    }

    public void tampil(){
        mahasiswas.stream().forEach(mhs->{
            System.out.println(""+ mhs.toString());
        });
    }

    int linearSearch(String nim){
        for (int i = 0; i < mahasiswas.size(); i++) {
            if (nim.equals(mahasiswas.get(i).nim)) {
                return i;
            }
        }return -1;
    }

    // TUGAS NO 2
    int binarySearch(String nim) {
        List<String> nimList = new ArrayList<>();
        for (Mahasiswa mhs : mahasiswas) {
            nimList.add(mhs.nim);
        }
        int index = Collections.binarySearch(nimList, nim);
        return index >= 0 ? index : -1;
    }
    

     // TUGAS NO 3
    public void sortingDescending() {
        Collections.sort(mahasiswas, Collections.reverseOrder());
    }


    public static void main(String[] args) {
        ListMahasiswa lm = new ListMahasiswa();
        Mahasiswa m = new Mahasiswa("201234", "Noureen", "021xx1");
        Mahasiswa m1 = new Mahasiswa("201235", "Akhleema", "021xx2");
        Mahasiswa m2 = new Mahasiswa("201236", "Shannum", "021xx3");


        // TUGAS NO 3
        lm.tambah(m, m1, m2);
        System.out.println("Sebelum sorting:");
        lm.tampil();
        System.out.println("\nSetelah sorting descending:");
        lm.sortingDescending();
        lm.tampil();
    }

}
