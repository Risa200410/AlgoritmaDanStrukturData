package AlgoritmaDanStrukturData.Pertemuan6;

public class Paskibraka {
    String nama, kelas;
    int tinggi;

    Paskibraka(String a, String b, int c){
        nama=a;
        kelas=b;
        tinggi=c;
    }

    public void tampilIdentitas (){
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("Tinggi: " + tinggi);
    }
}
