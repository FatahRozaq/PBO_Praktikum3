/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pertemuan3.pbo_praktikum3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Gaji_Agent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca jumlah penjualan bulan ini
        System.out.print("Masukkan jumlah penjualan bulan ini: ");
        int jumlah_penjualan = scanner.nextInt();

        // Gaji pokok agent
        int gaji_pokok = 500000;

        // Harga setiap item
        int harga_item = 50000;

        // Bonus penjualan
        double bonus_penjualan = 0.0;

        if (jumlah_penjualan >= 80) {
            bonus_penjualan = jumlah_penjualan * harga_item * 0.35;
        } else if (jumlah_penjualan >= 40) {
            bonus_penjualan = jumlah_penjualan * harga_item * 0.25;
        } else if (jumlah_penjualan >= 15) {
            bonus_penjualan = jumlah_penjualan * harga_item * 0.10;
        }

        // Denda pemotongan gaji jika penjualan di bawah 15 item
        double denda = 0.0;

        if (jumlah_penjualan < 15) {
            denda = (15 - jumlah_penjualan) * harga_item * 0.15;
        }

        // Menghitung total gaji
        double total_gaji = gaji_pokok + bonus_penjualan - denda;

        // Menampilkan total gaji
        System.out.println("Total gaji yang diterima: " + (int) total_gaji);
    }
}
