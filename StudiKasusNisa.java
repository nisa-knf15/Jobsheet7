import java.util.Scanner;

public class StudiKasusNisa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kendaraan;
        int durasi;
        int totalPembayaran = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 untuk mobil, 2 untuk motor, 0 untuk keluar): ");
            kendaraan = scanner.nextInt();

            if (kendaraan == 0) {
                break; // Keluar dari program
            }
            System.out.print("Masukkan durasi parkir dalam jam: ");
            durasi = scanner.nextInt();

            int pembayaran;
            if (durasi > 5) {
                pembayaran = 12500; // Tarif tetap jika lebih dari 5 jam
            } else {
                if (kendaraan == 1) { // Mobil
                    pembayaran = durasi * 3000;
                } else if (kendaraan == 2) { // Motor
                    pembayaran = durasi * 2000;
                } else {
                    System.out.println("Jenis kendaraan tidak valid. Silakan coba lagi.");
                    continue; // Kembali ke awal loop
                }
            }

            totalPembayaran += pembayaran;
            System.out.println("Pembayaran untuk kendaraan jenis " + (kendaraan == 1 ? "mobil" : "motor") + " selama " + durasi + " jam: Rp " + pembayaran);
        }

        System.out.println("Total pembayaran parkir: Rp " + totalPembayaran);
        scanner.close();
    }
}