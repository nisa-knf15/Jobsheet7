import java.util.Scanner;

public class KafeDoWhile15 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String namaPelanggan;
        int totalHarga;

        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        System.out.println("Nama Pelanggan: ");
        namaPelanggan = sc.nextLine();
        do {
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Nama Pelanggan " + namaPelanggan);
            System.out.println("Total harga yang harus dibayar: Rp " + totalHarga);
            sc.nextLine();
            
        } while (true);
    }
}