package AlgoritmaDanStrukturData.Pertemuan12.Praktikum1;

    // public class Node {
    // int data;
    // Node next, prev;
    
    // public Node(Node prev, int data, Node next) {
    //     this.prev = prev;
    //     this.data = data;
    //     this.next = next;
    // }


    //TUGAS 4
public class Node<T> {
    T data;
    Node<T> prev;
    Node<T> next;

    public Node(Node<T> prev, T nilai, Node<T> next) {
        this.prev = prev;
        this.data = nilai;
        this.next = next;
    }
} 

