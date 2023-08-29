public class Praktikum3 {
    public static void main(String[] args) {
        int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        
        int[] hargaBunga = {75000, 50000, 60000, 10000};
        
        // A. Menghitung Jumlah Stock berdasarkan jenis bunganya di seluruh Cabang
        int[] totalStockPerBunga = new int[4];
        
        for (int i = 0; i < stockBunga.length; i++) {
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalStockPerBunga[j] += stockBunga[i][j];
            }
        }
        
        System.out.println("Jumlah Stock per Jenis Bunga:");
        System.out.println("Aglonema: " + totalStockPerBunga[0]);
        System.out.println("Keladi: " + totalStockPerBunga[1]);
        System.out.println("Alocasia: " + totalStockPerBunga[2]);
        System.out.println("Mawar: " + totalStockPerBunga[3]);
        
        // B. Menghitung total pendapatan dari RoyalGarden 1 jika semua Bunga Terjual Habis
        int[] penguranganStock = {-1, -2, 0, -5};
        int totalPendapatan = 0;
        
        for (int i = 0; i < stockBunga[0].length; i++) {
            totalPendapatan += (hargaBunga[i] * (stockBunga[0][i] + penguranganStock[i]));
        }
        
        System.out.println("Total Pendapatan dari RoyalGarden 1 jika semua Bunga Terjual Habis: " + totalPendapatan);
    }
}