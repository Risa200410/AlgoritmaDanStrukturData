package AlgoritmaDanStrukturData.Pertemuan9;

public class Tugas3Main {
    public static void main(String[] args) {
        SingleLinkedLink3 singLL = new SingleLinkedLink3();
    
        System.out.println("Linked List: ");
        singLL.push("Bahasa");
        singLL.pr();
        singLL.print();
        singLL.push("Android");
        singLL.pr();
        singLL.print();
        singLL.push("Komputer");
        singLL.pr();
        singLL.print();
        singLL.push("Basis Data");
        singLL.pr();
        singLL.print();
        singLL.push("Matematika");
        singLL.pr();
        singLL.print();
        singLL.push("Algoritma");
        singLL.pr();
        singLL.print();
        singLL.push("Statistika");
        singLL.pr();
        singLL.print();
        singLL.push("Multimedia");
        singLL.pr();
        singLL.print();
        
        System.out.println("--------------------");
        System.out.println("\nIsi Stack menjadi");
        singLL.print();
        singLL.peek();
    }
}

