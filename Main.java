package btu.beka;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Task1");
        C c = new C();
        System.out.println("getLastDigOfA() is " + c.getLastDigOfA());
        System.out.println("getFirstDigOfB() is " + c.getFirstDigOfB());
        System.out.println("getSumOfC() is " + c.getSumOfC());
        c.printMultiplyMethod2AndMethod3();
        c.sumMethod3andMethod5();


        System.out.println("\nTask2");
        B b = new B();
        b.setXValueFromKeyboard();
        b.printXPlus12();
        b.oddOrEven();
        b.setYValueFromKeyboard();
        System.out.println("x + y = " + b.getXPlusY());


        System.out.println("\nTask3");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter [a] [b] (ints):");
        int num_a = scanner.nextInt();
        int num_b = scanner.nextInt();
        if(num_a > num_b){
            int tmp = num_b;
            num_b = num_a;
            num_a = tmp;
        }
        int even_count = 0, odd_count = 0, even_sum = 0, odd_sum = 0, sum = 0;
        for (int i = 0; i < 40; i++){
            int random = (int)(Math.random() * num_b + num_a);
            odd_count += random % 2 == 1 ? 1 : 0;
            even_count += random % 2 == 0 ? 1 : 0;
            odd_sum += random % 2 == 1 ? random : 0;
            even_sum += random % 2 == 0 ? random : 0;
            sum += random;
        }
        System.out.println("Odd number count: " + odd_count);
        System.out.println("Even number count: " + even_count);
        System.out.println("Even sum: " + even_sum);
        System.out.println("Odd sum: " + odd_sum);
        System.out.println("Sum: " + sum);

        int min = Math.min(odd_sum, even_sum);
        int max = Math.max(odd_sum, even_sum);

        for (int i = 1; i <= 5; i++) {
            System.out.println( i + ") numbers between " + min + " & " + max + " " + (int)(Math.random() * max + min));
        }
    }
}