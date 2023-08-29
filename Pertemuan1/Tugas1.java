public class Tugas1 {
    public static void main(String[] args) {
        int totalPendapatan = 0;

        String[] customer = {"Ani", "Budi", "Bina", "Cita"};
        int[] berat = {4, 15, 6, 11};

        for (int i = 0; i < customer.length; i++) {
            int biaya = berat[i] * 4500;

            if (berat[i] > 10) {
                biaya -= biaya * 0.05;
            }

            totalPendapatan += biaya;

            System.out.println("Customer: " + customer[i]);
            System.out.println("Berat Pakaian: " + berat[i] + " kg");
            System.out.println("Biaya: Rp. " + biaya);
            System.out.println("-------------------------");
        }

        System.out.print("Total Pendapatan Hari Ini: Rp. " + totalPendapatan);
    }
}
