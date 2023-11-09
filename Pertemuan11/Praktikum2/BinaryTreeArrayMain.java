package AlgoritmaDanStrukturData.Pertemuan11.Praktikum2;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = { 6,4,8,3,5,7,9,0,0,0 };
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseInOrder(0);
        System.out.println("");
        System.out.print("Traversal Pre-Order: ");
        bta.traversePreOrder(idxLast);
        System.out.println("");
        System.out.print("Traversal Pre-Order: ");
        bta.traversePostOrder(idxLast);
    }
}