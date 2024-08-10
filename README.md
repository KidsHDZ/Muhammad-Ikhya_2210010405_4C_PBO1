# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi pengolahan data kamera menggunakan Java sebagai tugas akhir dari mata kuliah Pemrograman Berbasis Objek 1.

## Deskripsi

Aplikasi ini menerima input berupa merek dan harga kamera, serta memberikan output berupa informasi detail dari kamera tersebut seperti megapixel, dan jenis kamera (Mirrorless atau DSLR).

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Kamera`, `Mirrorless`, `DSLR`, dan `TokoKamera` adalah contoh class.

```bash
public class Kamera {
    ...
}

public class Mirrorless extends Kamera {
    ...
}

public class DSLR extends Kamera {
    ...
}

public class TokoKamera {
    ...
}
```

2. **Object** adalah instance dari sebuah class. Dalam kode ini, `new Mirrorless(merek, harga, megapixel)` dan `new DSLR(merek, harga, megapixel)` adalah contoh pembuatan object.

```bash
toko.tambahKamera(new Mirrorless(merek, harga, megapixel));
toko.tambahKamera(new DSLR(merek, harga, megapixel));
```

3. **Atribut** adalah variabel di dalam sebuah class. Dalam kode ini, `merek`, `harga`, dan `megapixel` adalah contoh atribut.

```bash
private String merek;
private double harga;
private int megapixel;
```

4. **Constructor** adalah metode yang berjalan saat sebuah objek dibuat. Dalam kode ini, konstruktor ada di classs `Kamera`, `Mirrorless`, dan `DSLR`.
```bash
public Kamera(String merek, double harga) {
    this.merek = merek;
    this.harga = harga;
}

public Mirrorless(String merek, double harga, int megapixel) {
    super(merek, harga);
    this.megapixel = megapixel;
}

public DSLR(String merek, double harga, int megapixel) {
    super(merek, harga);
    this.megapixel = megapixel;
}
```

5. **Mutator** atau setter digunakan untuk mengubah nilai dari sebuah atribut. Dalam kode ini, `setMerek`, `setHarga`, dan `setMegapixel` adalah contoh method mutator.
```bash
public void setMerek(String merek) {
    this.merek = merek;
}

public void setHarga(double harga) {
    this.harga = harga;
}

public void setMegapixel(int megapixel) {
    this.megapixel = megapixel;
}
```

6. **Accessor** atau getter digunakan untuk mengambil nilai dari sebuah atribut. Dalam kode ini, `getMerek`, `getHarga`, dan `getMegapixel` adalah contoh method accessor.

```bash
ppublic String getMerek() {
    return merek;
}

public double getHarga() {
    return harga;
}

public int getMegapixel() {
    return megapixel;
}
```

7. **Encapsulation** adalah konsep menyembunyikan data dengan menjadikan atribut private dan hanya dapat diakses melalui method. Dalam kode ini, atribut `merek`, `harga`, dan `megapixel` dienkapsulasi dan hanya dapat diakses melalui method getter dan setter.
```bash
private String merek;
private double harga;
private int megapixel;
```

8. **Inheritance**  adalah konsep di mana sebuah class bisa mewarisi properti dan method dari class lain. Pada kode ini, `Mirrorless` dan `DSLR` mewarisi `Kamera` dengan sintaks `extends`.

```bash
public class Mirrorless extends Kamera {
    ...
}

public class DSLR extends Kamera {
    ...
}
```

9. **Polymorphism**  adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk object berbeda. Pada kode ini, method `toString()` di `Mirrorless` dan `DSLR` adalah contoh polymorphism melalui overriding.

```bash
@Override
public String toString() {
    return "Mirrorless: " + getMerek() + ", Harga: " + getFormattedHarga() + ", Megapixel: " + megapixel;
}

@Override
public String toString() {
    return "DSLR: " + getMerek() + ", Harga: " + getFormattedHarga() + ", Megapixel: " + megapixel;
}
```

10. **Seleksi**adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi `switch` untuk memilih jenis kamera.

```bash
switch (pilihan) {
    case 1:
        // Tambah kamera Mirrorless
        break;
    case 2:
        // Tambah kamera DSLR
        break;
    case 3:
        // Tampilkan semua kamera
        break;
    case 4:
        exit = true;
        break;
    default:
        System.out.println("Pilihan tidak valid!");
}
```

11. **Perulangan** adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop `while` untuk menjalankan menu utama.

```bash
while (!exit) {
    // Tampilkan menu dan proses input
}
```

12. **Input Output Sederhana** digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class `Scanner` untuk menerima input dan method `System.out.println` untuk menampilkan output.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan Merek: ");
String merek = scanner.nextLine();

System.out.println("Daftar Kamera:");
System.out.println(kamera);
```

13. **Array** adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, digunakan `ArrayList<Kamera>` untuk menyimpan daftar kamera.

```bash
private ArrayList<Kamera> daftarKamera = new ArrayList<>();
```

14. **Error Handling** digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan `try catch` untuk menangani error input.

```bash
try {
    pilihan = scanner.nextInt();
    scanner.nextLine(); // membersihkan newline setelah nextInt()
} catch (InputMismatchException e) {
    System.out.println("Input harus berupa angka!");
    scanner.next(); // membersihkan input yang salah
}
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Ikhya
NPM: 2110010405
