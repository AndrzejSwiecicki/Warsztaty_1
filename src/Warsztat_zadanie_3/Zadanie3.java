package Warsztat_zadanie_3;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        System.out.println("Pomyśl liczbę od 0 do 1000");
        int min = 0;
        int max = 1000;
        String zaDuzo = "za dużo";
        String zaMalo = "za mało";
        String zgadl = "zgadłeś";


        for (int i =0; i<=10;i++){
            int guess = (((max-min)/2) + min);
            System.out.println("Zgaduję" + guess);
            Scanner scr = new Scanner(System.in);
            String line = scr.next();
                for(int j = 0;j<10;j++){
                }
                if(line.equals(zaDuzo)){
                    max = guess;
                } else if (line.equals(zaMalo)){
                    min = guess;

                }else if (line.equals(zgadl)){
                    System.out.println("Wygrałem!");
                    break;
                }

        }
    }
}
