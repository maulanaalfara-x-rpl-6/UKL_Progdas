import java.util.Scanner;

public class ukl3no2 {
    // Fungsi untuk mendeteksi elemen negatif dalam array
    public static boolean cekArrayNegatif(int[] array) {
        // Melakukan iterasi melalui setiap elemen array
        for (int elemen : array) {
            // Jika ditemukan elemen bernilai negatif, kembalikan true
            if (elemen < 0) {
                return true;
            }
        }
        // Jika tidak ada elemen negatif, kembalikan false
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan panjang array
        System.out.print("Masukkan panjang array: ");
        int panjangArray = scanner.nextInt();

        // Membuat array sesuai panjang yang dimasukkan pengguna
        int[] array = new int[panjangArray];

        // Meminta pengguna memasukkan elemen array
        System.out.println("Masukkan elemen array:");
        for (int i = 0; i < panjangArray; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Memanggil fungsi untuk mendeteksi elemen negatif
        boolean adaNegatif = cekArrayNegatif(array);

        // Menampilkan hasil pengecekan
        if (adaNegatif) {
            System.out.println("Array mengandung elemen negatif.");
        } else {
            System.out.println("Array tidak mengandung elemen negatif.");
        }

        // Menutup scanner
        scanner.close();
    }
}