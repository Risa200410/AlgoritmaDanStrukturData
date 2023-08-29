import java.util.Scanner;

public class Praktikum1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nilaiTugas, UTS, UAS, nilaiAkhir;
        String nilaiHuruf= "";

        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("========================");
        System.out.print("Masukkan Nilai Tugas: ");
        nilaiTugas=sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        UTS=sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        UAS=sc.nextDouble();
        System.out.println("========================");
        System.out.println("========================");

        nilaiTugas=nilaiTugas*20/100;
        UTS=UTS*35/100;
        UAS=UAS*45/100;
        nilaiAkhir=nilaiTugas+UTS+UAS;

        System.out.println("nilai akhir : "+nilaiAkhir);
       
        if(nilaiAkhir>80&&nilaiAkhir<=100){
            nilaiHuruf = "A";
        } else if (nilaiAkhir>73&&nilaiAkhir<=80){
           nilaiHuruf = "B+";
        } else if (nilaiAkhir>65&&nilaiAkhir<=73){
           nilaiHuruf= "B";
        } else if (nilaiAkhir>60&&nilaiAkhir<=65){
            nilaiHuruf= "C+";
        } else if (nilaiAkhir>50&&nilaiAkhir<=60){
            nilaiHuruf= "C";
        } else if (nilaiAkhir>39&&nilaiAkhir<=50){
            nilaiHuruf= "D";
        } else if (nilaiAkhir<= 39){
           nilaiHuruf= "E";
        }
         System.out.println("Nilai Huruf: "+ nilaiHuruf);
         String keterangan = nilaiHuruf.equals("D") || nilaiHuruf.equals("E")  ? "Tidak Lulus" : "Selamat Lulus";
         System.out.println(keterangan);
          sc.close();
    }
        
    
       

    
    }
        
    
