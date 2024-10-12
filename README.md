# Java-ITP-W7-S10-PF-Throw

Kelas Introduction to Programming / Week 7 / Session 10

### Penjelasan:
- Pertama kita membuat kelas `AgeException` untuk menangani error kalau umur belum 18 tahun.
- Kedua dalam kelas `Main`, di dalam method `main` kita lakukan pengecekan umur dengan blok `Try-Catch`, dalam pengecekan kita memanggil method `checkAge` yang juga ada di kelas `Main`.
- Ketiga dalam method `checkAge` kita cek dengan kondisi jika umur kurang dari 18 maka akan memicu error dengan keyword `throw` dan memanggil kelas `AgeException` dan menampilkan pesan "Umur harus lebih dari 18 tahun.", jika umur lebih dari 18 tahun maka akan muncul pesan "Lolos verifikasi umur.".

Sekian.

Habib Azizul Haq  
(2702488253)
