package AlgoritmaDanStrukturData.Pertemuan11.Praktikum2;

public class BinaryTreeArray {
    int[] data;
    int idxLast;

    //TUGAS 5 
    Node root;



    public BinaryTreeArray() {
        data = new int[10];

        //TUGAS 5
        root = null;
    }

    public void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    //TUGAS 5 no 1
    public boolean isEmpty() {
        return root == null;
    }

    public void add(int data) {
        if(isEmpty()) {
            root = new Node(data);
        } else {
            Node current = root;
            while(true) {
                if(data < current.data) {
                    if(current.left != null) {
                        current = current.left;
                    } else {
                        current.left = new Node(data);
                        break;
                    }
                } else if(data > current.data) {
                    if(current.right != null) {
                        current = current.right;
                    } else {
                        current.right = new Node(data);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
    }


    //TUGAS 5 no 2
    public void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }
    
    public void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }

}
