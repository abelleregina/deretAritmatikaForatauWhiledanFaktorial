package Bella;

import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        int Angka, temp = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Angka");
        Angka = input.nextInt();
        for (int i = Angka; i >= 1; i--) {
            System.out.print(i + " X ");
            temp *= i;
        }
        System.out.println();
        System.out.println("Total Faktorial: " + temp);
        input.close();
        
    }
}