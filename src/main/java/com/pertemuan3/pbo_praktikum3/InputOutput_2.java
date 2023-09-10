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
public class InputOutput_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String[] inputData = new String[3]; // Maksimal tiga input

        System.out.println("Masukkan 3 baris data (String integer):");

        // Membaca tiga baris input pertama
        while (count < 3 && scanner.hasNextLine()) {
            String line = scanner.nextLine();
            inputData[count] = line;
            count++;
        }

        // Output garis pembatas
        System.out.println("=".repeat(32));

        // Mencetak semua data yang telah diinputkan dengan jarak
        for (String input : inputData) {
            if (input != null) {
                String[] parts = input.split(" ");
                if (parts.length == 2) {
                    String string = parts[0];
                    int integer = Integer.parseInt(parts[1]);
                    String formattedString = String.format("%-15s", string);
                    String formattedInteger = String.format("%03d", integer);
                    System.out.println(formattedString + formattedInteger); // Menampilkan output
                } else {
                    System.out.println("Format input tidak valid: " + input);
                }
            }
        }
        System.out.println("=".repeat(32));
    }
}
