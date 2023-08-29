public class Tugas2 {
    public static void main(String[] args) {
        double saldo = 1000000; 
        double targetSaldo = 1500000; 
        double bunga = 0.02; 

        int bulan = hitung(saldo, targetSaldo, bunga);

        System.out.println("Jumlah bulan yang diperlukan: " + bulan);
    }

    public static int hitung(double saldo, double targetSaldo, double bunga) {
        int bulan = 0;

        while (saldo < targetSaldo) {
            saldo += saldo * bunga;
            bulan++;
        }

        return bulan;
    }
}
