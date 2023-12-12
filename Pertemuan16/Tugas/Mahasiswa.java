package AlgoritmaDanStrukturData.Pertemuan16.Tugas;

public class Mahasiswa {
    String nim, nama, noHp;   

    public Mahasiswa(){
    }

    public Mahasiswa(String nim, String nama, String noHp) {
        this.nim  = nim;
        this.nama =  nama;
        this.noHp = noHp;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", noTelp=" +noHp + "}";
    }
}
