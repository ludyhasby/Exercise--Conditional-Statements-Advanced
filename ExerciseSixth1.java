package testpingjava;

import java.util.Scanner;

public class ExerciseSixth1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int row = Integer.parseInt(scanner.nextLine());
        int column = Integer.parseInt(scanner.nextLine());

        switch(type){
            case "Premiere" :
                System.out.printf("%.2f USD", row*column*12.00);
                break;
            case "Normal" :
                System.out.printf("%.2f USD", row*column*7.50);
                break;
            case "Discount" :
                System.out.printf("%.2f USD",  row*column*5.00);
                break;
            default:
                System.out.println();
        }
    }
}
