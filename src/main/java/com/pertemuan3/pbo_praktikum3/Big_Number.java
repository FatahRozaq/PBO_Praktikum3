/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pertemuan3.pbo_praktikum3;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Big_Number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukan angka pertama : ");
        String aStr = scanner.nextLine();
        System.out.println("Masukan angka kedua : ");
        String bStr = scanner.nextLine();

        BigInteger a = new BigInteger(aStr);
        BigInteger b = new BigInteger(bStr);

        BigInteger tambah = a.add(b);
        BigInteger kali = a.multiply(b);

        System.out.println("Hasil tambah dua bilangan : " + tambah);
        System.out.println("Hasil kali dua bilangan : " + kali);

        scanner.close();
    }
}
