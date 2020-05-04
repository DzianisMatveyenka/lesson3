package com.itacademy.lesson3;

import java.util.Scanner;

/**
 * Имеется целое число, вводимое пользователем с консоли. Это число -
 * сумма денег в рублях.
 *     Вывести это число, добавив к нему слово рубль в правильном падеже
 * (рубль, рублей, рубля) (if-else  switch)
 */
public class Task2 {

    public static void main(String[] args) {
//        1    !11 - рубль
//        2,3,4   - рубля !12-13-14
//        0,5-9, 11-19 - рублей
//        121 / 10 = 12
//        124 % 10 = 4
//        124 % 100 = 24     1 24/100

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input rubles: ");
        int rubles = scanner.nextInt();

        String rublesDescription = getRublesDescription(rubles);
        System.out.println(rublesDescription);
    }

    public static String getRublesDescription(int rubles) {
        int ostatokNa10 = rubles % 10;
        int ostatokNa100 = rubles % 100;
        if (ostatokNa10 == 1 && ostatokNa100 != 11) {
            return rubles + " рубль";
        } else if ((ostatokNa10 == 2 || ostatokNa10 == 3 || ostatokNa10 == 4)
                && !(ostatokNa100 == 12 || ostatokNa100 == 13 || ostatokNa100 == 14)) {
            return rubles + " рубля";
        } else {
            return rubles + " рублей";
        }
    }
}
