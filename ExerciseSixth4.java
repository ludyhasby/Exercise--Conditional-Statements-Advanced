package testpingjava;

import java.util.Scanner;

public class ExerciseSixth4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fisher = Integer.parseInt(scanner.nextLine());
        double expenditure = 0.0;

        if(season.equals("Spring")){
            if(fisher<=6){
                if(fisher%2==0){
                    expenditure = 0.85*3000;
                } else{
                    expenditure = 0.9*3000;
                }
            } else if(fisher>=7 && fisher<=12){
                if(fisher%2==0){
                    expenditure = 0.8*3000;
                } else{
                    expenditure = 0.85*3000;
                }
            }else if(fisher>12){
                if(fisher%2==0){
                    expenditure = 0.7*3000;
                } else{
                    expenditure = 0.75*3000;
                }
            }
        } else if(season.equals("Summer")||season.equals("Autumn")) {
            if(fisher<=6){
                if(fisher%2==0 && season.equals("Summer")){
                    expenditure = 0.85*4200;
                } else{
                    expenditure = 0.9*4200;
                }
            } else if(fisher>=7 && fisher<=12){
                if(fisher%2==0 && season.equals("Summer")){
                    expenditure = 0.8*4200;
                } else{
                    expenditure = 0.85*4200;
                }
            }else if(fisher>12){
                if(fisher%2==0 && season.equals("Summer")){
                    expenditure = 0.7*4200;
                }  else{
                    expenditure = 0.75*4200;
                }
            }
        } else if(season.equals("Winter")) {
            if(fisher<=6){
                if(fisher%2==0){
                    expenditure = 0.85*2600;
                } else{
                    expenditure = 0.9*2600;
                }
            } else if(fisher>=7 && fisher<=12){
                if(fisher%2==0){
                    expenditure = 0.8*2600;
                } else{
                    expenditure = 0.85*2600;
                }
            }else if(fisher>12){
                if(fisher%2==0){
                    expenditure = 0.7*2600;
                } else{
                    expenditure = 0.75*2600;
                }
            }
        }
        double balance = budget - expenditure;
        if(balance >= 0){
            System.out.printf("Yes! You have %.2f USD left.", balance);
        } else{
            System.out.printf("Not enough money! You need %.2f USD.", -1*balance);
        }
    }
}