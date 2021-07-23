// Program to check wheather a given year is leap year or not

import java.util.Scanner;

class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int year;

        System.out.print("Enter the year: ");
        year = sc.nextInt();

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Is a leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("Is a leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }
    }
}