
package percabanganifelse;

import java.util.Scanner;

/**
 *
 * @author 21343013-Ranny Erzitha
 *
 */
public class PercabanganIFELSE {

    public static void main(String[] args) {
        double total_pembelian, diskon = 0;
        
        Scanner dataMasuk = new Scanner(System.in);
        System.out.print("Masukkan Total Pembelian : Rp");
        total_pembelian = dataMasuk.nextDouble ();
        
        if (total_pembelian >= 50000)
            diskon = 0.1 * total_pembelian;
        else
            diskon = 0.02 * total_pembelian;
        System.out.println("Besarnya diskon : Rp" + diskon);
    }
    
}
