package Warsztat_zadanie_3;

import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {

        String line = "";
        int min = 0;
        int max = 1000;
        int guess = 1000;

        System.out.println("Wymyśl liczbę od 0 do 1000, a ja ją zgadnę max. w 10 próbach !");

            while(!line.equals("zgadłeś")) {
                guess = (((max - min) / 2) + min);
                System.out.println("Zgaduję liczbę" + " " + guess);
                System.out.println("Pobierz odpowiedź z zestawu: -zaDuzo, -zaMalo, -zgadłeś ");
                Scanner scan = new Scanner(System.in);
                line = scan.next();
                    for (int j = 0; j < 10; j++) {
                        if (line.equals("zgadłeś")) {
                            System.out.println("Wygrałem!");
                            break;
                        } else {
                            if (line.equals("zaDuzo")) {
                                max = guess;
                            } else if (line.equals("zaMalo")) {
                                min = guess;
                            } else {
                                System.out.println("Nie ouszukuj");
                            }
                         }
                    }
                 }
    }
}

