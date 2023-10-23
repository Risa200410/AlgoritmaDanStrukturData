package AlgoritmaDanStrukturData.Pertemuan6;

public class PengurutanBuku {
    Buku book[] = new Buku[4];
    int counter;

    public void tambah(Buku b){
        if(counter<book.length){
            book[counter] = b;
            counter++;
        } else {
            System.out.println("=====Data telah penuh!!=====");
        }
    }

    public void bubbleSort(){
        for (int i = 0; i < book.length-1; i++) {
            for (int j = 1; j < book.length-i; j++) {
                if(book[j].ukuranBuku < book[j-1].ukuranBuku){
                    Buku temp = book[j];
                    book[j] = book[j-1];
                    book[j-1] = temp;
                }
            }
        }
    }

    public void selectionSort(){
        for (int i = 0; i < book.length-1; i++) {
            int min = i;
            for (int j = i+1; j < book.length; j++) {
                if(book[j].jmlHal < book[min].jmlHal){
                    min = j;
                }
            }
            Buku temp = book[i];
            book[i] = book[min];
            book[min] = temp;
        }
    }
    
    public void tampil(){
        for(Buku b : book){
            b.tampil();
            System.out.println("=================================");
        }
    }
}
