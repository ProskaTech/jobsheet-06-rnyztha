/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet6;

/**
 *
 * @author 21343013-Ranny Erzitha
 */
import javax.swing.JOptionPane;

public class Tugas2A {
    public static void main(String[] args) {
		String angka = " ";
        
        angka = JOptionPane.showInputDialog("Masukkan Angka ");
        int a = Integer.valueOf(angka);
        
        String hasil = " ";
        
        if((a>=1) && (a <= 10) ) {
        	System.out.println(hasil += "Valid number");
        }
        else {
        	System.out.println(hasil += "Invalid number");
        }
        JOptionPane.showMessageDialog(null, hasil);
	}
}
