import java.util.Scanner;

public class StudiKasusNisa1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int HARGA_TIKET = 50000;
        int totalTiket = 0;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (atau -1 untuk keluar): ");
            int jumlahTiket = scanner.nextInt();

            if (jumlahTiket == -1) {
                break; // Keluar dari perulangan jika pengguna memasukkan -1
            }

            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Silakan masukkan jumlah tiket yang valid.");
                continue; // Meminta input ulang jika jumlah tiket negatif
            }

            totalTiket += jumlahTiket;

            // Menghitung diskon
            double diskon = 0;
            if (jumlahTiket > 10) {
                diskon = 0.15; // Diskon 15%
            } else if (jumlahTiket > 4) {
                diskon = 0.10; // Diskon 10%
            }

            // Menghitung total harga setelah diskon
            double totalHarga = jumlahTiket * HARGA_TIKET * (1 - diskon);
            totalPenjualan += totalHarga;

            System.out.printf("Total harga untuk %d tiket adalah: Rp %.2f%n", jumlahTiket, totalHarga);
        }

        System.out.printf("%nTotal tiket terjual: %d%n", totalTiket);
        System.out.printf("Total penjualan tiket: Rp %.2f%n", totalPenjualan);

        scanner.close();
    }
}
