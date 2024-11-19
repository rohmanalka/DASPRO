Percobaan 1
Algoritma: LingkaranNoAbsen
Deklarasi:
r	: int
phi (3.14) : double
keliling, luas : double

Deskripsi:
1.	Read phi (3.14)
2.	print “masukkan jari-jari lingkaran!”
3.	read r
4.	keliling = 2*phi*r
5.	luas = phi *r*r
6.	print keliling
7.	print luas

Percobaan 2
Algoritma = Gaji21
Deklarasi :
jmlMasuk, JmlTdkMasuk, TotGaji : int
gaji , potGaji  : int
Deskripsi : 
1.	print “masukkan nilai gaji”
2.	read gaji
3.	print “masukkan nilai potongan gaji”
4.	read potGaji
5.	print “masukkan jumlah hari masuk kerja anda”
6.	read jmlMasuk
7.	print “masukkan jumlah hari tidak masuk anda”
8.	read JmlTdkMasuk
9.	TotGaji = (jmlMasuk*gaji) – (JmlTdkMasuk*potGaji)
10.	print TotGaji

Percobaan 3
Algoritma: Harga_Bayar_NoAbsen
{dibaca harga barang dan jumlah barang dari piranti masukan. Hitunglah jumlah diskon dan harga barang}
Deklarasi:
harga, jumlah, JmlHalaman	: int
Diskon, total, bayar, jmlDis	: double
MerkBuku : String


Deskripsi:
1.	print “Masukkan merk buku”
2.	read MerkBuku
3.	print “Masukkan jumlah halaman buku”
4.	read JmlHalaman
5.	print "Masukkan harga barang yang dibeli”
6.	read harga
7.	print " Masukkan Jumlah jumlah barang yang dibeli”
8.	read jumlah
9. print “Masukkan besaran diskon yang didapatkan”
10. read Diskon
11.	total = harga *jumlah
12.	jmlDis=total*Diskon
13. bayar=total-jmlDis
14. print “Merk buku yang anda beli adalah”
15. print “ MerkBuku
16. print “Jumlah halaman buku anda adalah”
17. print JmlHalaman
18.	print “Diskon yang anda dapatkan adalah”
19.	print jmlDiskon
20.	print "Jumlah yang harus dibayar adalah”
21. print bayar

Tugas
Algoritma  : Anggaran
Desklarasi : 
pendapatan , pengeluaran, sisaAnggaran : Double
Deskripsi :
1.	Print “ Pendapatan Bulanan”
2.	Read pendapatan
3.	Print “Pengeluaran Bulanan”
4.	Read pengeluaran
5.	sisaAnggaran = pendapatan - pengeluaran
6.	Print “Sisa Anggaran Bulanan”
7.	Read sisaAnggaran
8.	If sisaAnggaran > 0
9.	Print “Anggaran perpustakaan memiliki sisa”
10.	Else if sisaAnggaran <0
11.	Print “Anggaran perpustakaan mengalami defisit”
12.	Else
13.	Print “Anggaran perpustakaan seimbang”