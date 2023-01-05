package testpingjava;

import java.util.Scanner;

public class ExerciseSixth7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int number_night = Integer.parseInt(scanner.nextLine());
        double apartment = 0.0;
        double studio = 0.0;

        switch(month){
            case "May":
            case "October":
                 if(number_night>14){
                    apartment =  0.9*65*number_night;
                    studio = 0.7*50*number_night;
                 }else if(number_night>7){
                     apartment =  65*number_night;
                     studio = 0.95*50*number_night;
                 }else{
                    apartment = 65*number_night;
                    studio = 50*number_night;
                }
                break;
            case "June":
            case "September":
                if(number_night>14){
                    apartment =  0.9*68.70*number_night;
                    studio = 0.8*75.20*number_night;
                }else{
                    apartment = 68.70*number_night;
                    studio = 75.20*number_night;
                }
                break;
            case "July":
            case "August":
                if(number_night>14){
                    apartment =  0.9*77*number_night;
                    studio = 76*number_night;
                }else{
                    apartment = 77*number_night;
                    studio = 76*number_night;
                }
                break;
        }
        System.out.printf("Apartment: %.2f USD.%n", apartment);
        System.out.printf("Studio: %.2f USD.", studio);
    }
}
