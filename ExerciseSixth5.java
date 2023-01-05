package testpingjava;

import java.util.Scanner;

public class ExerciseSixth5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        if(budget<=100){
            System.out.println("Somewhere in Bulgaria");
            switch(season){
                case "summer":
                    System.out.printf("Camp - %.2f", 0.3*budget);
                    break;
                case "winter":
                    System.out.printf("Hotel - %.2f", 0.7*budget);
                    break;
            }
        } else if(budget<=1000){
            System.out.println("Somewhere in Balkans");
            switch(season){
                case "summer":
                    System.out.printf("Camp - %.2f", 0.4*budget);
                    break;
                case "winter":
                    System.out.printf("Hotel - %.2f", 0.8*budget);
                    break;
            }
        } else{
            System.out.println("Somewhere in Europe");
            System.out.printf("Hotel - %.2f", 0.9*budget);
        }
    }
}