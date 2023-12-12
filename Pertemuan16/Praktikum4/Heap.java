package AlgoritmaDanStrukturData.Pertemuan16.Praktikum4;

import java.util.PriorityQueue;
import java.util.Comparator;

public interface Heap {

    int getSize();

    boolean isEmpty();

    void insert(int element);

    int extractRoot();
}