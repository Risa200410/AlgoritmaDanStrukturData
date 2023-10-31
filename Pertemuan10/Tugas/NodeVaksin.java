package AlgoritmaDanStrukturData.Pertemuan10.Tugas;

public class NodeVaksin {
    int data, queueNumber;
    String nama;
    NodeVaksin next, prev;  
    
    public NodeVaksin(String nama, int queueNumber) {
        this.nama = nama;
        this.next = null;
        this.prev = null;
        this.queueNumber = queueNumber;
    }
}
