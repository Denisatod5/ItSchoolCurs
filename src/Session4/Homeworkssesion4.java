package Session4;


import java.io.Console;
import java.util.Scanner;

public class Homeworkssesion4 {

    public static void main(String[] args) {

        // Exercise 1
        int numar1 = 40;
        int numar2 = 20;

        int sum = numar1 + numar2;
        int dif = numar1 - numar2;
        int mul = numar1 * numar2;
        int div = numar1 / numar2;

        System.out.println("Adunare: " + sum);
        System.out.println("Scadere: " + dif);
        System.out.println("Inmultire: " + mul);
        System.out.println("Impartire: " + div);

        // Exercise 2
        int a = 5;
        System.out.println(a++ + 2);
        System.out.println(a++);

        // Exercise 3
        int b = 10;

        if (!(b >= 0)) {
            System.out.println("Numarul este negativ");
        } else {
            System.out.println("Numarul este pozitiv");
        }

        // Exercise 4
        System.out.println("Counting up:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\nCounting down:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println();

        // Exercise 5
        int e = 20;
        e += 5;
        System.out.println(e);
        e -= 3;
        System.out.println(e);
        e *= 2;
        System.out.println(e);
        e /= 4;
        System.out.println(e);
        e %= 3;
        System.out.println(e);

        // Exercise 6
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = sc.nextInt();

        System.out.print("Enter second number: ");
        int second = sc.nextInt();

        if (first > second) {
            System.out.println("The first number is greater than the second number.");
        } else if (first < second) {
            System.out.println("The first number is less than the second number.");
        } else {
            System.out.println("The two numbers are equal.");
        }

        // Exercise 7
        int f = 10;
        double g = 2.5;

        double sum7 = f + g;
        double difference = f - g;
        double product = f * g;
        double division = f / g;

        System.out.println("Addition: " + sum7);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        System.out.println("Division: " + division);

        // Exercise 8
        byte number1 = 10;
        byte number2 = 20;

        byte byteSum = (byte) (number1 + number2);

        System.out.println("Sum: " + byteSum);

        // Exercise 9
        System.out.println("Enter length: ");
        double length9 = sc.nextDouble();

        System.out.println("Enter breadth: ");
        double breadth9 = sc.nextDouble();

        double area9 = length9 * breadth9;

        System.out.println("Area of rectangle: " + area9);

        // Exercise 10

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        n = -n;

        System.out.println("The reversed sign is: " + n);


        // Exercise 11

// Exercise 10

        System.out.print("Enter an integer: ");
        int number10 = sc.nextInt();
        number10 = -number10;


        System.out.println("The reversed sign is: " + number10);

        // Exercise 11

        System.out.print("Enter first boolean (true/false): ");
        boolean firstBool = sc.nextBoolean();

        System.out.print("Enter second boolean (true/false): ");
        boolean secondBool = sc.nextBoolean();

        System.out.println("Negation of first boolean: " + !firstBool);
        System.out.println("Negation of second boolean: " + !secondBool);


        // Exercise 12

        System.out.print("Enter an integer: ");
        int number12 = sc.nextInt();

        number12++;
        System.out.println("After increment: " + number12);

        number12--;
        System.out.println("After decrement: " + number12);

        // Exercise 13

        System.out.print("Enter original price: ");
        double price13 = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount13 = sc.nextDouble();

        price13 -= price13 * discount13 / 100;

        System.out.println("Price after discount: " + price13);


// Exercise 14

        System.out.print("Enter a number: ");
        int number14 = sc.nextInt();

        if (number14 >= 1 && number14 <= 100) {
            System.out.println("The number is within the range 1-100.");
        } else {
            System.out.println("The number is outside the range 1-100.");
        }


    }
}