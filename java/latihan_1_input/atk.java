package latihan_1_input;

import java.util.Scanner;

public class atk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek untuk setiap jenis alat tulis
        AlatTulis bolpoint = new AlatTulis("Bolpoint", 10, 2000);
        AlatTulis pensil = new AlatTulis("Pensil", 10, 1000);
        AlatTulis penghapus = new AlatTulis("Penghapus", 10, 500);

        // Menampilkan data awal setiap alat tulis
        System.out.println("Data Awal:");
        System.out.println(bolpoint.getData());
        System.out.println(pensil.getData());
        System.out.println(penghapus.getData());

        // Membuat loop
        while (true) {
            System.out.println("\nStok Alat Tulis:");
            System.out.println("1. Bolpoint: " + bolpoint.getStok());
            System.out.println("2. Pensil: " + pensil.getStok());
            System.out.println("3. Penghapus: " + penghapus.getStok());
            System.out.println("4. Keluar");
            System.out.println("\nPilih alat tulis yang ingin dibeli:");

            // Membaca pilihan  pengguna
            int pilihan = scanner.nextInt();
            if (pilihan == 4) {
                break; // Keluar dari loop jika memilih  keluar
            }

            // Menangani pilihan
            AlatTulis alatTulis = null;
            switch (pilihan) {
                case 1:
                    alatTulis = bolpoint;
                    break;
                case 2:
                    alatTulis = pensil;
                    break;
                case 3:
                    alatTulis = penghapus;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, 3, atau 4.");
                    continue;
            }

            // Meminta jumlah barang yang ingin dibeli
            System.out.println("Masukkan jumlah " + alatTulis.getNama() + " yang ingin dibeli:");
            int jumlah = scanner.nextInt();
            System.out.println("Pembelian " + alatTulis.getNama() + ": " + alatTulis.beli(jumlah));
        }

        // Menampilkan data alat tulis setelah pembelian
        System.out.println("\nData Setelah Pembelian:");
        System.out.println("Bolpoint: " + bolpoint.getData());
        System.out.println("Pensil: " + pensil.getData());
        System.out.println("Penghapus: " + penghapus.getData());

        // Menghitung total harga semua alat tulis setelah pembelian
        TotalHarga totalHarga = new TotalHarga();
        totalHarga.setTotal(new AlatTulis[]{bolpoint, pensil, penghapus});
        System.out.println("\nTotal Harga Semua Pembelian: " + totalHarga.getTotal());

        scanner.close();
    }
}



