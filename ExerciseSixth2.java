package testpingjava;

import java.util.Scanner;

public class ExerciseSixth2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int degrees = Integer.parseInt(scanner.nextLine());
        String timed = scanner.nextLine();
        String Outfit = "";
        String Shoes = "";

        if(degrees>=10 && degrees<=18){
            switch(timed){
                case "Morning":
                    Outfit = "Sweatshirt";
                    Shoes = "Sneakers";
                    break;
                case "Afternoon":
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                    break;
                case "Evening":
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                    break;
                default:
                    System.out.println();
                    break;
            }
        }
        else if(degrees>18 && degrees <=24){
            switch(timed){
                case "Morning":
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                    break;
                case "Afternoon":
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                    break;
                case "Evening":
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                    break;
                default:
                    System.out.println();
                    break;
            }
        }
        else if(degrees >= 25){
            switch(timed){
                case "Morning":
                    Outfit = "T-Shirt";
                    Shoes = "Sandals";
                    break;
                case "Afternoon":
                    Outfit = "Swim Suit";
                    Shoes = "Barefoot";
                    break;
                case "Evening":
                    Outfit = "Shirt";
                    Shoes = "Moccasins";
                    break;
                default:
                    System.out.println();
                    break;
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, Outfit, Shoes);
    }
}
