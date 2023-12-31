package AlgoritmaDanStrukturData.Pertemuan16.Praktikum2;

import java.util.Collections;
import java.util.Iterator;
import java.util.Stack;

public class LoopCollection {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Salak");

        for(String fruit: fruits){
            System.out.printf("%s ", fruit);
        }

        System.out.println("\n"+fruits.toString());

        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }

        // fruits.push("Melon");
        // fruits.push("Durian");

        //TUGAS NO 5
        // fruits.push("Strawberry");

        // TUGAS NO 6
        fruits.push("Mango");
        fruits.push("Guava");
        fruits.push("Avocado");

        System.out.println("Setelah penambahan: " + fruits.toString());

        Collections.sort(fruits);

        System.out.println("Setelah pengurutan: " + fruits.toString());

        System.out.println("");
        for (Iterator<String> it=fruits.iterator();it.hasNext();){
            String fruit = it.next();
            System.out.printf("%s ",fruit);
        }
        System.out.println("");
        fruits.stream().forEach(e->{
            System.out.printf("%s ", e);
        });
        System.out.println("");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.printf("%s ", fruits.get(i));
        }
    }
}
