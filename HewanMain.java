/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal1_UTS;
import java.util.Scanner;

public class HewanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jenis hewan (Kucing/Anjing): ");
        String jenisHewan = input.nextLine();

        Hewan hewan;

        if ("Kucing".equalsIgnoreCase(jenisHewan)) {
            hewan = new Kucing();
        } else if ("Anjing".equalsIgnoreCase(jenisHewan)) {
            hewan = new Anjing();
        } else {
            System.out.println("Jenis hewan tidak valid.");
            return;
        }

        System.out.print("Suara " + jenisHewan + " : ");
        hewan.bersuara();
        System.out.print("\nApakah " + jenisHewan + " adalah mamalia? (Ya/Tidak): ");
        String jawaban = input.nextLine();

        if ("Ya".equalsIgnoreCase(jawaban)) {
            if (hewan.isMamalia()) {
                System.out.println(jenisHewan + " adalah hewan mamalia.");
            } else {
                System.out.println(jenisHewan + " bukan hewan mamalia.");
            }
        } else if ("Tidak".equalsIgnoreCase(jawaban)) {
            System.out.println(jenisHewan + " bukan mamalia.");
        } else {
            System.out.println("Pilihan tidak valid.");
        }
    }
}