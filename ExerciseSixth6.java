package testpingjava;

import java.util.Scanner;

public class ExerciseSixth6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        String car = scanner.nextLine();

        String angka ="";

        if(n2==0 && (car.equals("/")||car.equals("%"))){
            System.out.printf("Cannot divide %d by zero", n1);
        }else{
            switch (car){
                case "+":
                    int b = n1 + n2;
                    if(b%2==0){
                        angka = "even";
                    } else{
                        angka = "odd";
                    }
                    System.out.printf("%d + %d = %d - %s", n1, n2, b, angka);
                    break;
                case "-":
                    int b1 = n1 - n2;
                    if(b1%2==0){
                        angka = "even";
                    } else{
                        angka = "odd";
                    }
                    System.out.printf("%d - %d = %d - %s", n1, n2, b1, angka);
                    break;
                case "*":
                    int b2 = n1 * n2;
                    if(b2%2==0){
                        angka = "even";
                    } else{
                        angka = "odd";
                    }
                    System.out.printf("%d * %d = %d - %s", n1, n2, b2, angka);
                    break;
                case "/":
                    double n3 = n1;
                    double n4 = n2;
                    double b4 = n3/n4;
                    System.out.printf("%d / %d = %.2f", n1, n2, b4);
                    break;
                case "%":
                    int b5 = n1%n2;
                    System.out.printf("%d %s %d = %d", n1, car, n2, b5);
                    break;
            }
        }
    }
}