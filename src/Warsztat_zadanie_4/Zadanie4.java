package Warsztat_zadanie_4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Zadanie4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Kod takiej kostki wygląda następująco:\n" +
                "xDy+z \n" + "x -liczba rzutów \n" + "y -ilość ścian \n" + "z -dodaj/odejmij \n");
        System.out.print("podaj parametry rzutu: ");

        String value = sc.nextLine();

        String[] partsTimes = value.split("D");
        System.out.println(Arrays.toString(partsTimes));

        int times = 1;
        int square = 0;

        if (partsTimes[0].length() > 0) {
            times = Integer.parseInt(partsTimes[0]);
        }

        String[] modificationPositive = partsTimes[1].split("\\+");
        String[] modificationNegative = partsTimes[1].split("-");

        int modification = 0;

            if (modificationPositive[1].length() > 0) {
                modification = Integer.parseInt(modificationPositive[1]);
                square = Integer.parseInt(modificationPositive[0]);

            } else if (modificationNegative[1].length() > 0) {
                modification = Integer.parseInt(modificationPositive[1]) * (-1);
                square = Integer.parseInt(modificationNegative[0]);
            }

        System.out.println("rzucam" + " " + times + " " + "razy kostką: " + square + " " + "ścienną");

            int result = 0;
            Random rnd = new Random();
            for (int i = 0; i < times; i++) {
                int probe = rnd.nextInt(square) + 1;
                System.out.println("rzuciłem: " + " " + result);
                result += probe;
            }
            result = result + modification;
            System.out.println("wynik: " + result);
    }
}
