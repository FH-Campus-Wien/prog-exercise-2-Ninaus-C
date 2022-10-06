package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        Scanner scanner = new Scanner(System.in);
        int inputCounter = 1;
        double largestnumber = 0;

        while (true) {
            double number = scanner.nextDouble();
            System.out.print("Number " + inputCounter + ": ");

            if (number <= 0) {
                if (inputCounter == 1) {
                    System.out.println("No number entered.");
                    break;
                }
                else {
                    System.out.printf("The largest number is %.2f" + System.lineSeparator() ,largestnumber);
                    break;
                }
            }
            else if (largestnumber<number) {
                largestnumber = number;
            }
            inputCounter++;
        }


    }

    //todo Task 2
    public void stairs() {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int number = 1;

        System.out.print("n: ");
        if (rows <= 0) {
            System.out.println("Invalid number!");
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(number++ + " ");
            }
            System.out.println();

        }
    }

    //todo Task 3
    public void printPyramid() {
        int ROWS = 6;
        for (int i = 1; i <= ROWS; i++) {
            for (int j = ROWS; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        Scanner scanner = new Scanner(System.in);
        int markcounter = 1;
        int negativemark = 0;
        double average = 0;
        int sum = 0;
        double loopcounter = 0;

        while (true) {
            int mark = scanner.nextInt();
            if (mark == 0) {
                if (loopcounter == 0) {
                    average = 0;
                } else {
                    average = sum/loopcounter;
                }
                System.out.print("Mark " + markcounter + ": ");
                System.out.printf("Average: %.2f" + System.lineSeparator(),average);
                System.out.println("Negative marks: " + negativemark);
                break;
            }
            System.out.print("Mark " + markcounter + ": ");

            if (mark > 5) {
                System.out.println("Invalid mark!");
            }
            else if (mark < 0) {
                System.out.println("Invalid mark!");
            }
            else if (mark == 5) {
                sum += 5;
                negativemark++;
                markcounter++;
                loopcounter++;
            }
            else {
                sum = sum + mark;
                markcounter++;
                loopcounter++;

            }

        }
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}