package AlgoritmaDanStrukturData.Pertemuan7;

public class StackTugas2 {
             int size, top;
             Tugas2 data[];
             
             public StackTugas2 (int size) {
                 this.size = size;
                 data = new Tugas2[size];
                 top = -1;
            }
             
             public boolean IsEmpty() {
                 if (top == -1) {
                     return true;
                 }
                 else {
                     return false;
                 }
             }
             
             public boolean IsFull() {
                 if (top == size - 1) {
                     return true;
                 }
                 else {
                     return false;
                 }
             }
             
             public void push (Tugas2 sb) {
                 if (!IsFull()) {
                     top++;
                     data[top] = sb;
                 }
                 else {
                     System.out.println("Stack penuh!"); 
                 }
             }
             
             public void pop() {
                 if (!IsEmpty()) {
                     Tugas2 x = data[top];
                     top--; 
        
                    System.out.println("Data keluar: " + x.idTrans + " " + x.tgl + " " + x.barang + " " + x.jml + " " + x.total);
                 } 
                 else {
                     System.out.println("Stack kosong!");
                 }
             }
             
             public void peek() { 
        
                System.out.println("Elemen teratas: " + data[top].idTrans + "." + " " + data[top].tgl + " " + data[top].barang + " " + data[top].jml + " " + data[top].total); 
             }
             
             public void print() {
                 System.out.println ("Isi stack");
                 for (int i = top; i >= 0; i--) { 
        
                    System.out.println(data[i].idTrans + " " +data[i].tgl + " " + data[i].barang + " " + data[i].jml + " " + data[i].total); 
                 }
                 System.out.println("");
             }
             
             public void clear() {
                 if (!IsEmpty()) {
                    for (int i = top; i >= 0; i--) {
                         top--;
                     }
                     System.out.println("Stack telah dikosongkan");
                 }
                 else {
                    System.out.println("Stack masih kosong");
            }
        
    }                 
        
}
