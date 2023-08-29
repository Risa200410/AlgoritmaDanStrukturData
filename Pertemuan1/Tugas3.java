import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Input n: ");
        int n = sc.nextInt();
        
        System.out.print("Output: ");
        int hitung = 0;
        for (int i = 2; hitung < n; i += 2) {
            if (i % 4 != 0) {
                System.out.print(i + " ");
                hitung++;
            }
        }
        
        sc.close();
    }
}
