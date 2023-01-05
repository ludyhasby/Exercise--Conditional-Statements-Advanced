package testpingjava;

import java.util.Scanner;

public class ExerciseSixth3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        int number = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double expenditure = 0.0;

        if(type.equals("Roses")){
            if(number>80){
                expenditure = 0.9*number*5;
            } else{
                expenditure = number*5;
            }
        } else if(type.equals("Dahlias")){
            if(number>90){
                expenditure = 0.85*number*3.80;
            } else{
                expenditure = number*3.80;
            }
        } else if(type.equals("Tulips")){
            if(number>80){
                expenditure = 0.85*number*2.80;
            } else{
                expenditure = number*2.80;
            }
        }else if(type.equals("Narcissus")){
            if(number>=120){
                expenditure = number*3;
            } else{
                expenditure = number*3*1.15;
            }
        }else if(type.equals("Gladiolus")){
            if(number>=80){
                expenditure = number*2.50;
            } else{
                expenditure = number*2.50*1.2;
            }
        }

        double balance = budget-expenditure;
        if(balance>=0){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f USD left.", number, type, balance);
        } else{
            System.out.printf("Not enough money, you need %.2f USD more.", balance*-1);
        }
    }
}
