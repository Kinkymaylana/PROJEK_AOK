/*
 * Nama: Kinky Maylana Prakoso
 * NIM: 235150701111007
 */

/*
 * Tugas:
 * Buatlah program sederhana untuk setiap konversi bilangan dalam java/python/c.
 * - Biner ke Desimal
   - Desimal ke Biner
   - Biner ke Hexa
   - Hexa ke Biner
   - Desimal ke Hexa
   - Hexa ke Desimal
 */

// Mengimpor Scanner ke program
import java.util.Scanner;

public class Tugas_AOK {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk menerima input dari pengguna.
        Scanner input = new Scanner(System.in); // Untuk membaca berbagai jenis data yang dimasukkan oleh pengguna.

        int pilihan; // Membuat variabel pilihan dengan tipe data integer.

        // Memulai perulangan do-while.
        do {
            // Menampilkan output pada layar monitor pengguna
            // '\n' digunakan untuk membuat teks berikutnya di baris baru.
            System.out.println("\nWELCOME TO PROGRAM KONVERSI BILANGAN\nMENU :");
            System.out.println("0. KELUAR");
            System.out.println("1. BINER KE DESIMAL");
            System.out.println("2. DESIMAL KE BINER");
            System.out.println("3. BINER KE HEKSADESIMAL");
            System.out.println("4. HEKSADESIMAL KE BINER");
            System.out.println("5. DESIMAL KE HEKSADESIMAL");
            System.out.println("6. HEKSADESIMAL KE DESIMAL");
            System.out.print("   MASUKKAN PILIHAN ANDA : ");

            pilihan = input.nextInt(); // Deklarasi variabel dengan tipe data integer.
            input.nextLine();  // Menghapus karakter newline

            // Menjalankan kode berdasarkan pilihan pengguna.
            // Menggunakan if, else if, else.
            if (pilihan == 1) {
                System.out.print("\nMasukkan Bilangan Biner: ");
                String biner = input.nextLine();
                int desimal = Integer.parseInt(biner, 2);
                System.out.println("Hasil Desimal : " + desimal);
            } else if (pilihan == 2) {
                System.out.print("\nMasukkan Bilangan Desimal: ");
                int desimalMasukkan = input.nextInt();
                String binerkeluaran = Integer.toBinaryString(desimalMasukkan);
                System.out.println("Hasil Biner : " + binerkeluaran);
            } else if (pilihan == 3) {
                System.out.print("\nMasukkan Bilangan Biner: ");
                String binerMasukkan = input.nextLine();
                int desimalkeluaran = Integer.parseInt(binerMasukkan, 2);
                String heksa = Integer.toHexString(desimalkeluaran).toUpperCase(); // Mengubah huruf ke besar
                System.out.println("Hasil Heksadesimal: " + heksa);
            } else if (pilihan == 4) {
                System.out.print("\nMasukkan Bilangan Heksadesimal: ");
                String heksaMasukkan = input.nextLine() ;
                int desimalDariHek = Integer.parseInt(heksaMasukkan, 16);
                String binerDariHek = Integer.toBinaryString(desimalDariHek);
                System.out.println("Hasil Biner : " + binerDariHek);
            } else if (pilihan == 5) {
                System.out.print("\nMasukkan Bilangan Desimal: ");
                int desimalMasukkan_2 = input.nextInt();
                String heksaKeluaran = Integer.toHexString(desimalMasukkan_2).toUpperCase(); // Mengubah huruf ke besar
                System.out.println("Hasil Heksadesimal : " + heksaKeluaran);
            } else if (pilihan == 6) {
                System.out.print("\nMasukkan Bilangan Heksadesimal: ");
                String heksaMasukkan_2 = input.nextLine();
                int desimalDariHek_2 = Integer.parseInt(heksaMasukkan_2, 16);
                System.out.println("Hasil Desimal : " + desimalDariHek_2);
            } else if (pilihan == 0) {
                // Menampilkan output.
                System.out.println("\nTerima Kasih!");
                System.out.println("BYE BYEE\n");
                break;
            } else {
                // Menampilkan output peringatan.
                System.out.println("\nMasukkan Angka 0-6");
            }
        } while (pilihan != 0); // Pilihan tidak sama dengan 0.
    }
}