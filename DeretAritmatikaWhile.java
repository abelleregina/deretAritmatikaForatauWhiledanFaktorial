package Bella;

import java.util.Scanner;

public class DeretAritmatikaWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input
        System.out.print("Masukkan batas awal: ");
        int awal = input.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int akhir = input.nextInt();

        System.out.print("Masukkan beda (jika negatif maka berikan input negatif sebelum angka):\n ");
        int beda = input.nextInt();

        System.out.println("Deret Aritmatika While :");
        int i = awal;
        if (beda > 0) {
            // positif
            while (i <= akhir) {
                System.out.print(i + " ");
                i += beda;
            }
        } else if (beda < 0) {
            // negatif turun ke bawah
            while (i >= akhir) {
                System.out.print(i + " ");
                i += beda;
            }

            input.close();
        }
    }
}
