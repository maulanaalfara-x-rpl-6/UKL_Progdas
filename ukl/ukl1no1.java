
import java.util.Scanner;

public class ukl1no1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan total belanja
        System.out.print("Masukkan total belanja: ");
        double totalBelanja = input.nextDouble();

        double diskon = 0;

        // Menentukan diskon
        if (totalBelanja >= 100000 && totalBelanja <= 200000) {
            diskon = 0.10; // Diskon 10%
        } else if (totalBelanja > 200000) {
            diskon = 0.20; // Diskon 20%
        }

        // Menghitung total yg harus saya ayar setelah diskon
        double totalDiskon = totalBelanja * diskon;
        double totalBayar = totalBelanja - totalDiskon;

        // hasil
        System.out.println("Diskon yang diterima: Rp " + totalDiskon);
        System.out.println("Total yang harus dibayar: Rp " + totalBayar);

        input.close();
    }
}
