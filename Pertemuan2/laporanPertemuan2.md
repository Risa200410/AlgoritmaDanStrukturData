# Laporan Pertemuan 2
NIM : 2241760119

NAMA : MARITZA ULFA HURIYAH

KELAS : SIB 2C

## Praktikum 2.2
<img src = "Praktikum 2.2.png">

Pertanyaan: 
1. Setiap objek memiliki dua karakteristik yaitu Attribute (State) dan Behavior.
2. Kata kunci yang dipakai untuk mendeklarasikan class yaitu 'public class Film'
3. Ada 5 attribut di class Film, yaitu 'judul', 'genre', 'rate', 'jumlahTiket', dan 'hargaTiket'
4. Ada 4 method di class Film, yaitu 'tampilFilm()', 'tambahTiket()', 'kurangTiket()', dan 'totalRevenue()'.
5. kode nya sebagai berikut: 

<img src = "pertanyaan 2.5.png">

6. Method tambahTiket() memakai parameter integer karena memang data tiketnya akan berbentuk data yang bulat. Jadi tidak perlu memakai double ataupun yang lainnya.
7. totalRevenue() memakai tipe data integer karena mempunyai data yang bulat, dan agar bisa dipanggil kembali
8. tambahTiket() memakai tipe data void karena tidak perlu mengembalikan hasil penjumlahan yang sudah di hitung.

## Praktikum 2.3
<img src = "Praktikum 2.3.png">

Pertanyaan:
1. objek yang dihasilkan di class FilmMain yaitu 'film1'.

<img src = "Pertanyaan 2.3..png">

2. Untuk mengakses atribut dari suatu objek bisa menggunakan kode 'namaObjek.nama.Atribut', kode program tersebut akan memanggil dan mengakses atribut. Sedangkan untuk mengakses method dapat menggunakan kode 'namaObjek.namaMethod()', kode tersebut akan mengakses method dari suatu objek.


## Praktikum 2.4
<img src = "Praktikum 2.4.png">

Pertanyaan:
1. kontruktor berparameter di class Film ada di baris 10-16.

<img src = "Pertanyaan 2.4.1.png">


2. Baris tersebut melakukan pembuatan objek yang bernama 'film2' dari class film dengan konstruktor yang memiliki parameter.

3.  Objek dan Output yang telah dibuat seperti dibawah ini: 
<img src = "Pertanyaan 2.4.2.png">
<img src = "Pertanyaan 2.4.3.png">


## Praktikum 2.5
<img src = "Praktikum 2.5.png">

Pertanyaan:
1. Tidak, karena atribut dan method sudah dibuat di class PersegiPanjang dan tinggal dipanggil melalui class ArrayObject. selain itu dalam class tidak harus memiliki atribut dan method. 
2. Sebenarnya punya, hanya pada class PersegiPanjang tidak di definisikan secara eksplisit. Dilakukan pemanggilan pada baris kode tersebut untuk memanggil kontruktor defaultnya.
3. yang dimaksud dengan kode tersebut yaitu mendeklarasikan dan menginisialisasi sebuah array yang dapat menyimpan tiga objek dari tipe PersegiPanjang 
4. Kode tersebut bermaksud membuat objek baru di class PersegiPanjang dan menetapkannya di indeks ke 2 ( indeks 1). lalu di kode tersebut juga menetapkan panjang menjadi 80 dan lebarnya menjadi 40. 
5. Hal itu dilakukan agar fokusnya jelas. jadi dapat dilakukan pemanggilan dengan mudah. 


## Praktikum 2.6
<img src = "Praktikum 2.6.png">

1. iya, array of object dapat diimplementasikan pada array 2 dimensi
2. misalnya di array of object ada panjang dan lebar, lalu bisa dibuat menjadi luas dari Persegi penjangnya di array 2 dimensi.
3. kode tersebut error karena belum dibuat objek Persegi dan ditempatkan di indeks '5'
4. modifikasi nya seperti ini:

<img src = "Pertanyaan 2.6.4.png">

5. boleh jika terjadi duplikasi instansiasi array of objek. karena sebuah array di Java dapat memiliki beberapa indeks yang menunjuk ke objek yang sama.


## Praktikum 2.7
<img src = "Praktikum 2.4.png">

Pertanyaan:
1. Ya, dalam satu kelas bisa terdapat lebih dari 1 konstruktor. misalnya konstruktor pertama hanya membutuhkan nama, sedangkan konstruktor ke 2 membutuhkan nama dan NIM.

2. class segitiga :

<img src = "Pertanyaan 2.7.2.png">

3. Menambahkan Method:

<img src = "Pertanyaan 2.7.3.png">

4. Di Class Main:

<img src = "Pertanyaan 2.7.4.png">




