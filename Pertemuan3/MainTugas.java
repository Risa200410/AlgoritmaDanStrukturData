import java.util.Scanner;

public class MainTugas {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("----------------- Pemilihan Calon Presiden BEM Tahun 2020 ---------------");
    Tugas tgs = new Tugas();
    Tugas[] qwer = new Tugas[tgs.jmlhKandidat];
    for (int i = 0; i < tgs.jmlhKandidat; i++) {
        qwer[i] = new Tugas();
        System.out.print("Nama Calon Presiden BEM ke- " + (i + 1) + " : ");
        qwer[i].kandidat = sc.nextLine();
    }

    System.out.println("-----------------------------------------------------------------");
    for (int i = 0; i < tgs.jmlhKandidat; i++) {
        System.out.print(" Masukkan Jumlah Suara Calon Presiden Bem ke-" + (i + 1) + " : ");
        qwer[i].vote = sc.nextInt();
        tgs.jumlahVote += qwer[i].vote;
    }

    System.out.println("-----------------------------------------------------------------");
    int hasil = Tugas.hasilPemungutanSuara(tgs.jumlahVote,qwer[0].vote, qwer[1].vote, qwer[2].vote, qwer[3].vote);
        System.out.println("Presiden Bem Terpilih Dimenangkan oleh : " + qwer[hasil-1].kandidat);
    }
}

