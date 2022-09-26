/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jobsheet6;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Tugas1b {
    public static void main(String[] args) {
		String a =  " ", b = " ", c = " ";
	
        a = JOptionPane.showInputDialog("Nilai pertama");
        int angka1 = Integer.valueOf(a).intValue();
        b = JOptionPane.showInputDialog("Nilai kedua");
        int angka2 = Integer.valueOf(b).intValue();
        c= JOptionPane.showInputDialog("Nilai ketiga");
        int angka3 = Integer.valueOf(c).intValue();
        
		
		double rata_rata = (angka1 + angka2 + angka3)/ 3;
		
		String hasil = "";
		hasil += "\n Selamat Nilai rata-rata Anda : " +rata_rata;
		
		if ((rata_rata <= 90)  && (rata_rata >= 60)) {
			System.out.println(hasil += "\nGood Job :-)");
		}
		else {
			System.out.println(hasil += "\nNot failed :-(");
		}
        JOptionPane.showMessageDialog(null, hasil);
	}
}
