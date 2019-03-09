package Warsztat_zadanie_1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {

        //losowanie liczby
        Random rnd = new Random();
        int r = rnd.nextInt(100);

        int liczba = 0;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Zgadnij liczbę: ");
                while(!scan.hasNextInt()){
                System.out.println("to nie jest liczba");
                scan.nextLine();
                }
            liczba = scan.nextInt();
            if (liczba>r){
                System.out.println("Podałeś za dużą liczbę !");
            } else if(liczba<r){
                System.out.println("Podałeś za małą liczbę !");
            }else {
                System.out.println("Zgadłeś");
            }

        }while (liczba != r);

    }
}
