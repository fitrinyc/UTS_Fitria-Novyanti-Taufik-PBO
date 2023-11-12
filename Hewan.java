/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Soal1_UTS;

/**
 *
 * @author lenovo
 */
public class Hewan {
    private String jenisSuara;

    public Hewan(String jenisSuara) {
        this.jenisSuara = jenisSuara;
    }

    public void bersuara() {
        System.out.println("Suara hewan: " + jenisSuara);
    }

    public boolean isMamalia() {
        return false;
    }
}
   
