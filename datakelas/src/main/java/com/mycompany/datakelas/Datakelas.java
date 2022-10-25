/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.datakelas;

/**
 *
 * @author USER
 */
import java.util.Scanner;
public class Datakelas {

    public static void main(String[] args) {
        //membuat variabel
        String nama, alamat, hobi, citacita;
        int umur, tinggibadan,nisn;
        
        //membuat scanner
        Scanner datadiri = new Scanner(System.in);
        
        //menampilkan output ke user dan menyimpan variabel
        System.out.println("Data Siswa XI RC");
        System.out.println("Masukkan nama anda : ");
        nama = datadiri.nextLine();
        System.out.println("Masukkan alamat anda : ");
        alamat = datadiri.nextLine();
        System.out.println("Masukkan hobi anda : ");
        hobi = datadiri.nextLine();
        System.out.println("citacita : ");
        citacita = datadiri.nextLine();
        
        System.out.println("Masukkan umur anda : ");
        umur = datadiri.nextInt();
        System.out.println("Masukkan tinggibadan anda : ");
        tinggibadan = datadiri.nextInt();
        System.out.println("nisn : ");
        nisn = datadiri.nextInt();
        
        //menampilkan hasil
        System.out.println("Nama saya " + nama);
        System.out.println("alamat saya " + alamat );
        System.out.println("Hobi saya " + hobi);
        System.out.println("Citacita saya " + citacita);
        System.out.println("umur saya " + umur);
        System.out.println("tinggibadan saya " + tinggibadan );
        System.out.println("nisn " + nisn);
        
        
    }
}
