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
public class Buka_Tutup_Jalan {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan plat nomor mobil (format: XXXX XXXX XXXX XXXX): ");
        String input = scanner.nextLine();

        // Memisahkan plat nomor mobil
        String[] platNomor = input.split(" ");

        // Menggabungkan angka-angka dalam plat nomor
        StringBuilder gabunganAngka = new StringBuilder();
        for (String nomor : platNomor) {
            gabunganAngka.append(nomor);
        }

        // Melakukan perhitungan sesuai dengan aturan
        long hasilPerhitungan = Long.parseLong(gabunganAngka.toString()) - 999999;

        if (hasilPerhitungan % 5 == 0) {
            System.out.println("Berhenti");
        } else {
            System.out.println("Jalan");
        }
        
        scanner.close();
    }
}
