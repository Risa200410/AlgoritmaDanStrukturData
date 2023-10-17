package AlgoritmaDanStrukturData.Pertemuan9;

public class Node {
    // int data;
    // Node next;

    //TUGAS NO 2
    char data;
    Node next;
    public String absen;
    public String nim;
    public String nama;
    public String ipk;

    public Node (String input, Node berikutnya){
        this.data=input;
        this.next=berikutnya;
    }

    public Node(String nim, String nama, int absen, double ipk, Object object) {
    }
}
