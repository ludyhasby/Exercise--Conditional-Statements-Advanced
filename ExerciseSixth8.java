package testpingjava;

import java.util.Scanner;

public class ExerciseSixth8 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int exam_time = Integer.parseInt(scanner.nextLine());
        int minute_exam = Integer.parseInt(scanner.nextLine());
        int time_arrival = Integer.parseInt(scanner.nextLine());
        int minute_arrival = Integer.parseInt(scanner.nextLine());

        int sum_exam = 60*exam_time+minute_exam;
        int sum_arrival = 60*time_arrival+minute_arrival;

        if(sum_exam-sum_arrival<0){
            System.out.println("Late");
            if((sum_arrival-sum_exam)/60>=1){
                int jam = (sum_arrival-sum_exam)/60;
                int sisa = (sum_arrival-sum_exam)%60;
                if(sisa>=10){
                    System.out.printf("%d:%d hours after the start", jam, sisa);
                } else{
                    System.out.printf("%d:0%d hours after the start", jam, sisa);
                }
            }else{
                int sisa = (sum_arrival-sum_exam)%60;
                System.out.printf("%d minutes after the start", sisa);
            }
        } else if(sum_exam-sum_arrival>=0 && sum_exam-sum_arrival<=30){
            System.out.println("On time");
            int sisa = sum_exam-sum_arrival;
            System.out.printf("%d minutes before the start", sisa);
        } else{
            System.out.println("Early");
            if((sum_exam-sum_arrival)/60>=1){
                int jam = (sum_exam-sum_arrival)/60;
                int sisa = (sum_exam-sum_arrival)%60;
                if(sisa>=10){
                    System.out.printf("%d:%d hours before the start", jam, sisa);
                } else{
                    System.out.printf("%d:0%d hours before the start", jam, sisa);
                }
            }else{
                int sisa = (sum_exam-sum_arrival)%60;
                System.out.printf("%d minutes before the start", sisa);
            }
        }
    }
}