import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
        //Requesting info
		System.out.println("What is your name?");
		String name = in.nextLine();
        System.out.println("How many studios did you attend between 0-8?");
        int studiosAttended = in.nextInt();
        double weightedStudio = (studiosAttended / 8.0) * 15;
        System.out.println("What's your average quiz grade?");
        double averageQuizGrade = in.nextDouble();
        System.out.println("What's your exam average grade");
        double averageExamGrade = in.nextDouble();


        // Rounding
        double studioRounded = Math.round(weightedStudio * 100.0) / 100.0;
        double weightedQuiz = 0.25 * averageQuizGrade;
        double weightedQuizRounded = Math.round(weightedQuiz * 100.0) / 100.0;
        double weightedExam = 0.60 * averageExamGrade;
        double weightedExamRounded = Math.round(weightedExam * 100.0) / 100.0;
        double total = weightedQuiz + weightedStudio + weightedExam;
        double totalRounded = Math.round(total * 100.0) / 100.0;
        // multiply by 100


        // Output
        System.out.println("CSE131 Grade for: " + name);
        System.out.println("Number of studios attended: " + studiosAttended);
        System.out.println("Weighted studio grade (out of 15): " + studioRounded + "%");
        System.out.println("Average quiz grade: " + averageQuizGrade);
        System.out.println("Weighted quiz grade (out of 25): " + weightedQuizRounded + "%");
        System.out.println("Average exam grade: " + averageExamGrade);
        System.out.println("Weighted exam grade (out of 60): " + weightedExamRounded + "%");
        System.out.println("Total grade: " + totalRounded + "%");






    }


}
