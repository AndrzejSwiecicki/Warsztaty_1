package Warsztat_zadanie_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Zadanie2 {
    public static void main(String[] args) {

        int[] userNumbers = getNumbersFromUser();
        Integer [] randomNumbers = getRandomNumbers();
        checkUserWin(userNumbers, randomNumbers);

        System.out.println(Arrays.toString(getRandomNumbers()));
      //  System.out.println(Arrays.toString(checkUserWin()));

       }
        private static void checkUserWin (int [] userNumbers, Integer[]randomNumbers) {
            int count = 0;
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if (userNumbers[i] == randomNumbers[j]) {
                        count++;
                    }
                }
            }

            if (count > 3) {
                System.out.print("trafiles" + count + "liczb");
            }
        }
            private static Integer[] getRandomNumbers(){

                Integer[] arr = new Integer[49];
                for (int i = 0; i < arr.length; i++) {
                    arr[i] = i + 1;
                }
                //System.out.println(Arrays.toString(arr));
                Collections.shuffle(Arrays.asList(arr));
               // System.out.println(Arrays.toString(arr));
                return Arrays.copyOf(arr,6);
            }

            private static int[] getNumbersFromUser () {
                Scanner scan = new Scanner(System.in);
                int[] numbers = new int[6];
                int index = 0;
                while (index < 6) {
                    System.out.print("Podaj liczbę(" + index + ");");
                    while (!scan.hasNextInt()) {
                        scan.nextLine();
                    }
                    int userNumber = scan.nextInt();
                    boolean sameNumber = false;
                    for (int i = 0; i < index; i++) {
                        if (numbers[i] == userNumber) {
                            sameNumber = true;
                            break;
                        }
                    }
                    if (sameNumber == false && userNumber >= 1 && userNumber <= 49) {
                        numbers[index] = userNumber;
                        index++;
                    } else {
                        System.out.print("liczba jest niepoprawna");
                    }
                }
                Arrays.sort(numbers);
                return numbers;
            }
        }




