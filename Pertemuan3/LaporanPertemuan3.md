# Laporan Pertemuan 2
NIM : 2241760119

NAMA : MARITZA ULFA HURIYAH

KELAS : SIB 2C

## Praktikum 4.2
<img src = "Praktikum 4.2.png">
Pertanyaan : 

1. Artinya yaitu jika nilai yang dimasukkan nantinya adalah 1 maka hasil yang akan ditampilkan oleh program main nantinya adalah 1 dan berfungsi sebagai batas daridevide conuer dimana perulangan akan berakhir saat n sudah sama dengan 1.

2. Divide : bermaksud membagi menjadi beberapa masalah yang memiliki kemiripan dengan masalah sebelumnya, namun berukuran lebih kecil. 
<img src = "Pertanyaan 4.2.2.1.png">
Conquer : yaitu menyelesaikan masing-masing masalah secara rekursif.
<img src = "Pertanyaan 4.2.2.2.png">
Combine: bermaksud menggabungkan solusi dari masing-masing sehingga 
membentuk solusi masalah awal.
<img src = "Pertanyaan 4.2.2.3.png">

3. Iya, memungkinkan. Jika termasuk looping maka bisa digunakan pada methodBF(). Jadi akan tetap berhasil. Modifikasinya seperti ini.
<img src = "Pertanyaan 4.2.3.1.png">
outpunya:
<img src = "Pertanyaan 4.2.3.2.png">

4. Pengecekan awal
<img src = "Pertanyaan 4.2.4.1.png">
Pengecekan Akhir
<img src = "Pertanyaan 4.2.4.2.png">
Pengecekan interval
<img src = "Pertanyaan 4.2.4.3.png">
Output

<img src = "Pertanyaan 4.2.4.png">

5. Elemen dibawah 20 angka:

<img src = "Pertanyaan 4.2.5.1.png">

elemen diatas 20 angka:

<img src = "Pertanyaan 4.2.5.2.png">


## Praktikum 4.3

Pertanyaan: 
1. PangkatBF yaitu operasi mencari hitung hasil pangkat dilakukan dengan bruteforce. 
PangkatDC yaitu operasi mencari hitung hasil pangkat dilakukan dengan cara divide conquer.

2. Jika n(pangkat bilangan) dimodulus 2 hasilnya 1, maka returnnya adalah hasil dari rumus (pangkatDC(a,n/2)*pangkatDC(a,n/2)*a) karena bilangan pangkatnya ganjil.
Jika n(pangkat bilangan) dimodulus 2 hasilnya tidak sama dengan 1 maka returnnya (kembalian nilai) adalah hasil dari (pangkatDC(a,n/2)*pangkatDC(a,n/2)) karenabilangan pangkatnya adalah genap.

3. Sudah termasuk, di combine dalam kode ditunjukkan pada sintaks return dimana hasil conquer sebelumnya direturnkan dan dalam tahap combine dilakukan pemanggilan hasil dari bilangan berpangkat tersebut.

4. Class Pangkat
<img src = "Pertanyaan 4.3.4.1.png">

Class Main
<img src = "Pertanyaan 4.3.4.2.png">
Output
<img src = "Pertanyaan 4.3.4.3.png">

5. Hasil outputnya: 
<img src = "Pertanyaan 4.3.5.png">

 

## Praktikum 4.4

Pertanyaan:
1. TotalBF() menggunakan fungsi looping untuk penjumlahan semua elemen array[i] yang akan dimasukkan ke operasi penjumlahan variable total dan direturnkan variable totalnya. 
TotalDC() menggunakan fungsi rekursif untuk melakukan proses devid yang diimplementasikan dengan if-else lalu melakukan tahapan conquer untuk menyelesaikan setiap masalah tersebut. Dan di tahap akhir atau combine semua hasil penyelesaian tadi dijjadikan 1 menjadi solusi.

2. Modifikasi 
<img src = "Pertanyaan 4.4.2.1.png">
Output
<img src = "Pertanyaan 4.4.2.2.png">

3. Formulasi di kode return lsum+rsum+arr[mid] agar dapat mereturnkan semua hasil penjumlahan ketiganya. Sehingga dari penjumlahan ketiganya bisa ditemukan berapa banyak keuntungan yang didapat dari perusahaan dalam rentang waktu dan bulan.

4. Kita membutuhkan variabel mid pada method TotalDC() agar bisa membagi bagiannya sendiri menjadi left dan right, kita membutuhkan bariabel mid untuk perhitungan semua bagian tengahnya.

5. Modifikasi
<img src = "Pertanyaan 4.5.2.1.png">
Output
<img src = "Pertanyaan 4.5.2.2.png">






## Latihan Praktikum
<img src = "Tugas.png">
