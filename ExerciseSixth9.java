package testpingjava;

import java.util.Scanner;

public class ExerciseSixth9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String rating = scanner.nextLine();
        int night = 0;

        if(days==1){
            night = 1;
        } else{
            night = days-1;
        }
        double expend = 0.0;

        if(type.equals("apartment")){
            if(night>15){
                expend = 0.5*25.00*night;
            } else if((night>=10)&&(night<=15)){
                expend = 0.65*25.00*night;
            } else{
                expend = 0.7*25.00*night;
            }
        } else if(type.equals("president apartment")){
            if(night>15){
                expend = 0.8*35.00*night;
            } else if((night>=10)&&(night<=15)){
                expend = 0.85*35.00*night;
            } else{
                expend = 0.9*35.00*night;
            }
        } else if(type.equals("room for one person")){
            expend = 18.00*night;
        }

        if(rating.equals("positive")){
            expend = 1.25*expend;
        } else if(rating.equals("negative")){
            expend = 0.9*expend;
        }

        System.out.printf("%.2f", expend);
    }
}