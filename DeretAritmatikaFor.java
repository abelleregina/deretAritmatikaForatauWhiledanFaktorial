package Bella;

import java.util.Scanner;

public class DeretAritmatikaFor {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // input
        System.out.print("Masukkan batas awal: ");
        int awal = input.nextInt();

        System.out.print("Masukkan batas akhir: ");
        int akhir = input.nextInt();

        System.out.print("Masukkan beda (jika negatif maka berikan input negatif sebelum angka):\n ");
        int beda = input.nextInt();

        System.out.println("Deret Aritmatika For :");
        if (beda > 0) {
            // positif
            for (int i = awal; i <= akhir; i += beda) {
                System.out.print(i + " ");
            }
        } else if (beda < 0) {
            // negatif turun ke bawah
            for (int i = awal; i >= akhir; i += beda) {
                System.out.print(i + " ");
            }
        }
        input.close();
    }
}
