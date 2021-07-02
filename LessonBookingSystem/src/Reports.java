import java.sql.PreparedStatement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Reports {
    private static Scanner scanner = new Scanner(System.in);
    private static String[] month = {"January", "February", "March"};

    public static void monthlyLessonReport() {
        System.out.println("Monthly Lesson Report");
        System.out.print("Enter a Month Number from 1 - 12: ");
        int choice1 = scanner.nextInt();

        if (choice1 == 3) {
            System.out.println("You have chosen " + month[2]);
            System.out.println("Weeks 9 - 12");
            System.out.println("The average monthly rating for English is " + Rating.getAverage(Rating.ratingEnglishMarch) + " given by " + Rating.ratingEnglishMarch.size() + " students in March");
            System.out.println("The average monthly rating for Maths is " + Rating.getAverage(Rating.ratingMathsMarch) + " given by " + Rating.ratingMathsMarch.size() + " students in March");
            System.out.println("The average monthly rating for Science is " + Rating.getAverage(Rating.ratingScienceMarch) + " given by " + Rating.ratingScienceMarch.size() + " students in March");
            System.out.println("The average monthly rating for French is " + Rating.getAverage(Rating.ratingFrenchMarch) + " given by " + Rating.ratingFrenchMarch.size() + " students in March");
        } else if (choice1 == 2) {
            System.out.println("You have chosen " + month[1]);
            System.out.println("Weeks 5 - 8");
            System.out.println("The average monthly rating for English is " + Rating.getAverage(Rating.ratingEnglishFeb) + " given by " + Rating.ratingEnglishFeb.size() + " students in February");
            System.out.println("The average monthly rating for Maths is " + Rating.getAverage(Rating.ratingMathsFeb) + " given by " + Rating.ratingMathsFeb.size() + " students in February");
            System.out.println("The average monthly rating for Science is " + Rating.getAverage(Rating.ratingScienceFeb) + " given by " + Rating.ratingScienceFeb.size() + " students in February");
            System.out.println("The average monthly rating for French is " + Rating.getAverage(Rating.ratingFrenchFeb) + " given by " + Rating.ratingFrenchFeb.size() + " students in February");
        } else if (choice1 == 1) {
            System.out.println("You have chosen " + month[0]);
            System.out.println("Weeks 1 - 4");
            System.out.println("The average monthly rating for English is " + Rating.getAverage(Rating.ratingEnglishJan) + " given by " + Rating.ratingEnglishJan.size() + " students in January");
            System.out.println("The average monthly rating for Maths is " + Rating.getAverage(Rating.ratingMathsJan) + " given by " + Rating.ratingMathsJan.size() + " students in January");
            System.out.println("The average monthly rating for Science is " + Rating.getAverage(Rating.ratingScienceJan) + " given by " + Rating.ratingScienceJan.size() + " students in January");
            System.out.println("The average monthly rating for French is " + Rating.getAverage(Rating.ratingFrenchJan) + " given by " + Rating.ratingFrenchJan.size() + " students in January");
        }

        System.out.println("\nLesson Reviews");
        System.out.println("Would you like to view any Reviews? 1. Yes - 2. Exit Program");
        int choice2 = scanner.nextInt();

        if (choice2 == 1) {
            System.out.print("Enter a Month Number from 1 - 12: ");
            int choice3 = scanner.nextInt();
            if (choice3 == 1) {
                System.out.println("You have chosen " + month[0]);
                System.out.println("Weeks 1 - 4");
                System.out.println("English Reviews: " + Review.reviewEnglishJan);
                System.out.println("Maths Reviews: " + Review.reviewMathsJan);
                System.out.println("Science Reviews: " + Review.reviewScienceJan);
                System.out.println("French Reviews: " + Review.reviewFrenchJan);
            } else if (choice3 == 2) {
                System.out.println("You have chosen " + month[1]);
                System.out.println("Weeks 5 - 8");
                System.out.println("English Reviews: " + Review.reviewEnglishFeb);
                System.out.println("Maths Reviews: " + Review.reviewMathsFeb);
                System.out.println("Science Reviews: " + Review.reviewScienceFeb);
                System.out.println("French Reviews: " + Review.reviewFrenchFeb);
            } else if (choice3 == 3) {
                System.out.println("You have chosen " + month[2]);
                System.out.println("Weeks 9 - 12");
                System.out.println("English Reviews: " + Review.reviewEnglishMarch);
                System.out.println("Maths Reviews: " + Review.reviewMathsMarch);
                System.out.println("Science Reviews: " + Review.reviewScienceMarch);
                System.out.println("French Reviews: " + Review.reviewFrenchMarch);
            } else {
                System.out.println("End of Program");
            }
        }
        BookingController.runProgram(Student.test);
    }

    public static void monthlyChampionLessonReport() {

        System.out.println("Monthly Champion Lesson Report");
        System.out.print("Enter a Month Number from 1 - 12: ");
        int choice1 = scanner.nextInt();

        if (choice1 == 1) {
            System.out.println("You have chosen " + month[0]);
            System.out.println("Weeks 1 - 4\n");
            System.out.println("English: £" + Prices.getEnglishTotalJan());
            System.out.println("Maths: £" + Prices.getMathsTotalJan());
            System.out.println("Science: £" + Prices.getScienceTotalJan());
            System.out.println("French: £" + Prices.getFrenchTotalJan());
        } else if (choice1 == 2) {
            System.out.println("You have chosen " + month[1]);
            System.out.println("Weeks 5 - 8\n");
            System.out.println("English: £" + Prices.getEnglishTotalFeb());
            System.out.println("Maths: £" + Prices.getMathsTotalFeb());
            System.out.println("Science: £" + Prices.getScienceTotalFeb());
            System.out.println("French: £" + Prices.getFrenchTotalFeb());
        } else if (choice1 == 3) {
            System.out.println("You have chosen " + month[2]);
            System.out.println("Weeks 9 - 12\n");
            System.out.println("English: £" + Prices.getEnglishTotalMarch());
            System.out.println("Maths: £" + Prices.getMathsTotalMarch());
            System.out.println("Science: £" + Prices.getScienceTotalMarch());
            System.out.println("French: £" + Prices.getFrenchTotalMarch());
        }
        BookingController.runProgram(Student.test);
    }
}
