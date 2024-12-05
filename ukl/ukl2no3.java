import java.util.Random;
import java.util.Scanner;

public class ukl2no3 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        int quiz_type, num1, num2, answer = 0, user_answer;
        boolean quit = false;

        while (!quit) {
            // Pilih jenis kuis secara acak (0=penjumlahan, 1=pengurangan, 2=perkalian)
            quiz_type = rand.nextInt(3);

            // Buat angka acak untuk kuis
            num1 = rand.nextInt(10);
            num2 = rand.nextInt(10);

            // Tampilkan kuis sesuai jenis yang dipilih
            switch (quiz_type) {
                case 0:
                    // Penjumlahan
                    answer = num1 + num2;
                    System.out.printf("[%d] [+] [%d] = ", num1, num2);
                    break;
                case 1:
                    // Pengurangan
                    answer = num1 - num2;
                    System.out.printf("[%d] [-] [%d] = ", num1, num2);
                    break;
                case 2:
                    // Perkalian
                    answer = num1 * num2;
                    System.out.printf("[%d] [*] [%d] = ", num1, num2);
                    break;
            }

            // Minta jawaban dari user
            user_answer = scanner.nextInt();

            if (user_answer == answer) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah " + answer);
            }

            // Tanya user apakah ingin berhenti
            System.out.print("Apakah Anda ingin berhenti? (y/n) ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("y")) {
                quit = true;
            }
        }

        System.out.println("Program selesai.");
    }
}