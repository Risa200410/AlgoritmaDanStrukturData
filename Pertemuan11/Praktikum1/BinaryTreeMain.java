package AlgoritmaDanStrukturData.Pertemuan11.Praktikum1;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);

        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);
        System.out.println();
        System.out.println(bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println();

        //TUGAS 1
        bt.Rekursif(6);
        bt.Rekursif(4);
        bt.Rekursif(8);
        bt.Rekursif(3);
        bt.Rekursif(5);
        bt.Rekursif(7);
        bt.Rekursif(9);
        bt.Rekursif(10);
        bt.Rekursif(15);

        bt.traversePreOrder(bt.root);
        System.out.println();
        bt.traverseInOrder(bt.root);
        System.out.println();
        bt.traversePostOrder(bt.root);
        System.out.println();
        System.out.println(bt.find(5));
        bt.delete(8);
        bt.traversePreOrder(bt.root);
        System.out.println();


        //TUGAS 2
        bt.Rekursif(6);
        bt.Rekursif(4);
        bt.Rekursif(8);
        bt.Rekursif(3);
        bt.Rekursif(5);
        bt.Rekursif(7);
        bt.Rekursif(9);

        int min = bt.cariMin();
        int max = bt.cariMax();

        System.out.println("Nilai terkecil: " + min);
        System.out.println("Nilai terbesar: " + max);

        //TUGAS 3
        System.out.print("Leaf nodes: ");
        bt.leaf();

        //TUGAS 4
        int jml = bt.hitungLeaf();
        System.out.println("");
        System.out.println("Jumlah leaf node yaitu "+jml);
    }
}