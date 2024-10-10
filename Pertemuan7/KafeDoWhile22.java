package Pertemuan7;

/**
 * KafeDoWhile22
 */

import java.util.Scanner;

public class KafeDoWhile22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String namaPelanggan;
        int kopi, teh, roti, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga = 0;

        do {
            System.out.print("Masukkan nama pelanggan (Ketikkan 'batal' untuk keluar): ");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan!");
                break;
            }
            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();
            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();
            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("total yang harus dibayar: Rp. " + totalHarga);
            sc.nextLine();
        } while (true);
        System.out.println("Semua transaksi selesai.");
        sc.close();
    }
}