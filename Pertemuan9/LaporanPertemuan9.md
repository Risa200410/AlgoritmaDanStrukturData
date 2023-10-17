# Laporan Pertemuan 9
NIM : 2241760119

NAMA : MARITZA ULFA HURIYAH

KELAS : SIB 2C

## Praktikum 9.2

<img src = "Praktikum 9.2.png">

Pertanyaan:

1. Di baris pertama muncul output "Linked List kosong" karena belum ada data yang di input.

2. Kode 'tail.next=ndInput;
        tail=ndInput; '
pada node digunakan untuk menambahkan node baru ke dalam linked list. Kode tersebut mengatur pointer next dari node baru (ndInput.next) agar menunjuk ke node pertama (head), kemudian mengatur head agar menunjuk ke node baru (ndInput). Dengan demikian, node baru akan menjadi node pertama dalam linked list

3. Kode 'if(temp.next.next==null) tail=temp.next;' pada linked list digunakan untuk mengecek apakah node yang sedang diperiksa adalah node terakhir dalam linked list.


## Praktikum 9.3
<img src = "Praktikum 9.3.png">

Pertanyaan:

1. kode break digunakan untuk menghentikan perulangan while saat menghapus. jika node yang ingin dihapus bukan node pertama, maka node sebelumnya akan dihubungkan dengan node setelahnya untuk menghapus node yang diinginkan. Setelah itu, break digunakan untuk menghentikan perulangan karena node yang ingin dihapus sudah ditemukan dan dihapus.

2. kode 'temp.next = temp.next.next;' digunakan untuk menghapus node yang diinginkan dengan menghubungkan node sebelumnya dengan node setelahnya. Hal itu dilakukan jika node dengan nilai data yang sama dengan key ditemukan, maka node tersebut akan dihapus dari linked list.

3. Ada 2 nilai kembalian yang dikembalikan, yaitu nilai index dari node tersebut atau nilai -1. Nilai index dari node tersebut akan dikembalikan ketika nilai data sama dengan data key. Dan nilai -1 akan dikembalikan ketika nilai data tidak sama dengan data key.


## TUGAS
1. <img src = "Tugas 1.png">

2. <img src = "Tugas 2.png">

3.

4. <img src = "Tugas 4.png">

