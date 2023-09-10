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
public class Berhitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membaca masukan
        System.out.print("Masukkan operasi matematika (contoh: 1 + 1): ");
        String inputStr = scanner.nextLine();

        // Memisahkan masukan menjadi A, operator, dan B
        String[] parts = inputStr.split(" ");
        if (parts.length == 3) {
            int A = Integer.parseInt(parts[0]);
            String operator = parts[1];
            int B = Integer.parseInt(parts[2]);

            // Memeriksa batasan A dan B
            if (A >= 1 && A <= 1000) {
                if (B >= 1 && B <= 1000){
                    // Melakukan operasi matematika sesuai dengan operator
                    int hasil = 0;
                    switch (operator) {
                        case "+":
                            hasil = A + B;
                            break;
                        case "-":
                            hasil = A - B;
                            break;
                        case "*":
                            hasil = A * B;
                            break;
                        case "/":
                            if (B != 0) { // Memastikan B tidak nol
                                hasil = A / B;
                            } else {
                                System.out.println("Pembagian oleh nol tidak diizinkan.");
                                return;
                            }
                            break;
                        case "%":
                            hasil = A % B;
                            break;
                        default:
                            System.out.println("Operator tidak valid.");
                            return;
                    }

                    // Menampilkan hasil
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("B tidak sesuai aturan, seharusnya (B >= 1 && B <= 1000).");
                }
            } else {
                System.out.println("A tidak sesuai aturan, seharusnya (A >= 1 && A <= 1000).");
            }
           
        } else {
            System.out.println("Format input tidak valid.");
        }
    }
}
