package AlgoritmaDanStrukturData.Pertemuan5;

public class Tugas2 {
    public String[][] namaMhs = {
        {"Alfi", "Safira", "Tiara", "Arif", "Erdi"},
        {"Yudha", "Nisa", "Yulia", "Fauzan", "Dwi"},
        {"Dewa", "Ana", "Abdul", "Dani", "Ammar"}
    };

    public void tampilDataMhs(){
        System.out.println("Daftar Kelompok Mahasiswa");
        for(int i=0; i<namaMhs.length; i++){
            System.out.print("Kelompok "+(i+1)+" : ");
            for(int j=0; j<namaMhs[i].length; j++){
                System.out.print("\t"+namaMhs[i][j]+"\t");
            }
            System.out.println();
        }
    }

    public void cariMhs(String nama){
        boolean ditemukan = false;
        for(int i=0; i<namaMhs.length; i++){
            for(int j=0; j<namaMhs[i].length; j++){
                if(nama.equalsIgnoreCase(namaMhs[i][j])){
                    System.out.println("Mahasiswa bernama "+nama+" berada pada Kelompok ke-"+(i+1)+" dan urutan ke-"+(j+1)+" dalam kelompok");
                    ditemukan = true;
                }
            }
        }
        if(!ditemukan){
            System.out.println("!!!Data tidak ditemukan!!!");
        }
    }
}

