/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pertemuan3.pbo_praktikum3;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class PBO_Praktikum3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Minta pengguna untuk memasukkan string
        System.out.print("Masukkan string: ");
        String input = scanner.nextLine().trim();
        scanner.close();

        // Memecah string menjadi token menggunakan split
        String[] tokens = input.split("[^a-zA-Z]+");

        int count = 0;
        for (String token : tokens) {
            if (!token.isEmpty()) {
                System.out.println(token);
                count++;
            }
        }

        // Cetak jumlah token
        System.out.println("Jumlah token: " + count);
    }
}
