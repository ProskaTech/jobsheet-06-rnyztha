/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet6;

import javax.swing.JOptionPane;

/**
 *
 * @author 21343013
 */
public class Tugas2B {
    public static void main(String[] args) {
		String angka = " ";
        
        angka = JOptionPane.showInputDialog("Masukkan Angka ");
        int a = Integer.valueOf(angka);
        
        String hasil = " ";
        switch(a) {
        case 1 -> hasil += "Valid number";
        case 2 -> hasil += "Valid number";
        case 3 -> hasil += "Valid number";
        case 4 -> hasil += "Valid number";
        case 5 -> hasil += "Valid number";
        case 6 -> hasil += "Valid number";
        case 7 -> hasil += "Valid number";
        case 8 -> hasil += "Valid number";
        case 9 -> hasil += "Valid number";
        case 10 -> hasil += "Valid number";
        default -> hasil += "Invalid number";
        }
        JOptionPane.showMessageDialog(null, hasil);
	}

    
}
