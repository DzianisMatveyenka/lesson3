package com.itacademy.lesson3;

import java.util.Scanner;

/**
 * Написать программу, которая считывает год, введённый пользователем, и
 * определяет, является ли этот год високосным.
 *     Год считается високосным, если он делится без остатка на 4. Однако, если
 * год также делится на 100, то этот год не високосный, за исключением годов,
 * делящихся на 400.
 *     Например: 
 *     1992 - високосный
 *     1900 - не високосный
 *     2000 – високосный
 */
public class Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input year: ");
        int year = scanner.nextInt();

        System.out.println(isLeapYear(year) ? (year + " високосный") : (year + " не високосный"));
//        if (isLeapYear(year)) {
//            System.out.println(year + " високосный");
//        } else {
//            System.out.println(year + " не високосный");
//        }
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
//        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
//            return true;
//        } else {
//            return false;
//        }
    }
}
