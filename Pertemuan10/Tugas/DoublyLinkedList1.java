package AlgoritmaDanStrukturData.Pertemuan10.Tugas;

public class DoublyLinkedList1 {
    NodeVaksin head;
    NodeVaksin tail;
    int size;
    int queueNumber;

    public DoublyLinkedList1() {
        head = null;
        tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nama, int queueNumber) {
        if (isEmpty()) {
            NodeVaksin newNode = new NodeVaksin(nama, queueNumber);
            head = newNode;
            tail = newNode;
        } else {
            NodeVaksin newNode = new NodeVaksin(nama, queueNumber);
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    public String remove() {
        if (isEmpty()) {
            return null;
        } else {
            String removedName = head.nama;
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            size--;
            return removedName;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeVaksin current = head;
            System.out.println("++++++++++++++++++++++++");
            System.out.println("Daftar Pengantri Vaksin:");
            System.out.println("++++++++++++++++++++++++");

            System.out.println("| No.  |     Nama        |");
    
            int number = 1;
            while (current != null) {
                System.out.printf("| %-4d | %-15s |\n", number, current.nama);
                current = current.next;
                number++;
            }
    
            System.out.println("+------+-----------------+");
            System.out.println("Sisa Antrian: " + size);
        } else {
            System.out.println("Antrian Vaksin Kosong");
        }
    }
}
