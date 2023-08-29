import java.util.Scanner;
public class Praktikum4 {
    Scanner sc= new Scanner(System.in);

    public static void perulangan(){
        int n=9;
        long a = 0; 
        long b = 1; 

        System.out.print("Deret Fibonacci:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            long next = a + b;
            a = b;
            b = next;
        }

    }

    public static void rekursif(int i){
        int [] deret= {0, 1, 1, 2, 3, 5, 8, 13, 21};
        if (i >= deret.length) {
            return;
        }      
        
        System.out.print(deret[i] + " ");
        rekursif(i + 1);
    }

    public static void main(String[] args) {
        //perulangan();
        System.out.print("Deret Fibonacci: " );
        rekursif(0);
    }
}
