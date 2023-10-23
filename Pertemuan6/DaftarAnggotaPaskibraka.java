package AlgoritmaDanStrukturData.Pertemuan6;

public class DaftarAnggotaPaskibraka {
    Paskibraka listPeserta[] = new Paskibraka[10];
    int id;

    public void tampil(){
            for(Paskibraka m : listPeserta){
                if (m !=null){
                    m.tampilIdentitas();
                    System.out.println("==========================");
                }
            } System.out.println("");
        }

    public void tambah(Paskibraka m){
        if(id<listPeserta.length){
            listPeserta[id] = m;
            id++;
        } else {
            System.out.println("list peserta sudah penuh!!");
        }
    }

    

    public void sorting(){
        for (int i = 0; i < listPeserta.length-1; i++) {
            for (int j = 1; j < listPeserta.length-i; j++) {
                if(listPeserta[j].tinggi > listPeserta[j-1].tinggi){
                    Paskibraka temp = listPeserta[j];
                    listPeserta[j] = listPeserta[j-1];
                    listPeserta[j-1] = temp;
                }
            }
        }
    }
}
