import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

class TokoKamera {
    private ArrayList<Kamera> daftarKamera;

    public TokoKamera() {
        daftarKamera = new ArrayList<>();
    }

    public void tambahKamera(Kamera kamera) {
        daftarKamera.add(kamera);
    }

    public void tampilkanKamera() {
        if (daftarKamera.isEmpty()) {
            System.out.println("Tidak ada kamera yang tersedia.");
        } else {
            System.out.println("Daftar Kamera:");
            for (Kamera kamera : daftarKamera) {
                System.out.println(kamera);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        TokoKamera toko = new TokoKamera();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Tambah Kamera Mirrorless");
            System.out.println("2. Tambah Kamera DSLR");
            System.out.println("3. Tampilkan Semua Kamera");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int pilihan = 0;
            try {
                pilihan = scanner.nextInt();
                scanner.nextLine(); // membersihkan newline setelah nextInt()
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka!");
                scanner.next(); // membersihkan input yang salah
            }

            switch (pilihan) {
               case 1:
                   try {
                        System.out.print("Masukkan Merek: ");
                        String merek = scanner.nextLine();
                        System.out.print("Masukkan Harga: ");
                        double harga = scanner.nextDouble();
                        scanner.nextLine(); // membersihkan newline setelah nextDouble()
                        System.out.print("Masukkan Megapixel: ");
                        int megapixel = scanner.nextInt();
                        scanner.nextLine(); // membersihkan newline setelah nextInt()
                        toko.tambahKamera(new Mirrorless(merek, harga, megapixel));
                    } catch (InputMismatchException e) {
                        System.out.println("Input tidak valid!");
                        scanner.next(); // membersihkan input yang salah
                    }
    break;

                case 2:
                    try {
                        System.out.print("Masukkan Merek: ");
                        String merek = scanner.nextLine();
                        System.out.print("Masukkan Harga: ");
                        double harga = scanner.nextDouble();
                        scanner.nextLine(); // membersihkan newline setelah nextDouble()
                        System.out.print("Masukkan Megapixel: ");
                        int megapixel = scanner.nextInt();
                        scanner.nextLine(); // membersihkan newline setelah nextInt()
                        toko.tambahKamera(new DSLR(merek, harga, megapixel));
                    } catch (InputMismatchException e) {
                        System.out.println("Input tidak valid!");
                        scanner.next(); // membersihkan input yang salah
                    }
                    break;
                case 3:
                    toko.tampilkanKamera();
                    break;
                case 4:
                    exit = true;
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }
}
