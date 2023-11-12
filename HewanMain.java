/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal1_UTS;
import java.util.Scanner;

public class HewanMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan jenis hewan (Anjing/Kucing) atau 'exit' untuk keluar: ");
            String jenisHewan = scanner.next();

            if (jenisHewan.equalsIgnoreCase("exit")) {
                System.out.println("Terima kasih! Program berakhir.");
                break;
            }

            Hewan hewan = null;

            if (jenisHewan.equalsIgnoreCase("Kucing")) {
                hewan = new Kucing();
            } else if (jenisHewan.equalsIgnoreCase("Anjing")) {
                hewan = new Anjing();
            } else {
                System.out.println("Jenis hewan tidak dikenal.");
                continue;
            }

            System.out.print("Apakah hewan ini mamalia? ");
            if (hewan.isMamalia()) {
                System.out.println("Ya, hewan ini adalah mamalia.");
            } else {
                System.out.println("Tidak, hewan ini bukan mamalia.");
            }

            hewan.bersuara();
        }
    }
}

