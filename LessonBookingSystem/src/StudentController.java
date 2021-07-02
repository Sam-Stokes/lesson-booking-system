import java.util.*;

public class StudentController {
    static Scanner scanner = new Scanner(System.in);

    public static void attendLesson(Student studentTest) {
        System.out.println("\nAttend a Lesson\n");
        System.out.println("Which day was the lesson on that you attended?");
        for (int count = 0; count < 2; count++) {
            System.out.println((count + 1) + ". " + BookingController.daySelection[count]);
        }

        int choice1 = scanner.nextInt();
        choice1 -= 1;

        System.out.println("You have chosen: " + BookingController.daySelection[choice1]);
        //choice1 is 0 for Saturday or 1 for Sunday

        if (BookingController.daySelection[choice1].equals("Saturday")) {
            for (int count = 0; count < 4; count++) {
                System.out.println((count + 1) + ". " + BookingController.timeSelection[count]);
            }
            System.out.println("What time did you attend the lesson?");
            int choice2 = scanner.nextInt();
            choice2 -= 1;

            System.out.println(BookingController.timeSelection[choice2]);
            //choice2 will be 0 for Morn, 1 for Aft, 2 for Early, 3 for Late

            System.out.println("The lesson for this date and time is: " + BookingController.saturdayLessons[choice2]);
            //Sorting of lessons for saturday is done. Now to confirm booking of the lesson and give a booking ID.
            System.out.println("Did you attend this lesson? Enter 1 for yes, 2 for no");

            //adds reviews and ratings
            int choice3 = scanner.nextInt();
            if (choice3 == 1 && BookingController.saturdayLessons[choice2].equals("English")) {
                if (Student.studentListEnglishSat.contains(studentTest)) {
                    System.out.print("Please leave a rating from 1 - 5.\n1. Very Dissatisfied\n2. Dissatisfied\n3. Ok\n4. Satisfied\n5. Very Satisfied\nEnter Number: ");
                    int rating = scanner.nextInt();
                    if (rating >= 1 && rating <= 5) {
                        System.out.println("You have given English the rating of: " + rating);
                        Rating.ratingEnglishMarch.add(rating);
                    } else {
                        System.out.println("Error, incorrect number.");
                        BookingController.runProgram(studentTest);
                    }

                    System.out.print("Would you like to leave a review of this lesson? Enter 1 for Yes, 2 for No: ");
                    int choice4 = scanner.nextInt();
                    if (choice4 == 1) {
                        System.out.println("Please write a few sentences about how you found the lesson: ");
                        String exception = scanner.nextLine(); //This is to avoid an exception of no user input.
                        String review = scanner.nextLine();
                        Review.reviewEnglishMarch.add(review);
                    } else {
                        System.out.println("No review given");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            } else if (choice3 == 1 && BookingController.saturdayLessons[choice2].equals("Maths")) {
                if (Student.studentListMathsSat.contains(studentTest)) {
                    System.out.print("Please leave a rating from 1 - 5.\n1. Very Dissatisfied\n2. Dissatisfied\n3. Ok\n4. Satisfied\n5. Very Satisfied\nEnter Number: ");
                    int rating = scanner.nextInt();
                    if (rating >= 1 && rating <= 10) {
                        System.out.println("You have given Maths the rating of: " + rating);
                        Rating.ratingMathsMarch.add(rating);
                    } else {
                        System.out.println("Error, incorrect number.");
                        BookingController.runProgram(studentTest);
                    }

                    System.out.print("Would you like to leave a review of this lesson? Enter 1 for Yes, 2 for No: ");
                    int choice4 = scanner.nextInt();
                    if (choice4 == 1) {
                        System.out.println("Please write a few sentences about how you found the lesson: ");
                        String exception = scanner.nextLine(); //This is to avoid an exception of no user input.
                        String review = scanner.nextLine();
                        Review.reviewMathsMarch.add(review);
                    } else {
                        System.out.println("No review given");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            } else if (choice3 == 1 && BookingController.saturdayLessons[choice2].equals("Science")) {
                if (Student.studentListScienceSat.contains(studentTest)) {
                    System.out.print("Please leave a rating from 1 - 5.\n1. Very Dissatisfied\n2. Dissatisfied\n3. Ok\n4. Satisfied\n5. Very Satisfied\nEnter Number: ");
                    int rating = scanner.nextInt();
                    if (rating >= 1 && rating <= 10) {
                        System.out.println("You have given Science the rating of: " + rating);
                        Rating.ratingScienceMarch.add(rating);
                    } else {
                        System.out.println("Error, incorrect number.");
                        BookingController.runProgram(studentTest);
                    }

                    System.out.print("Would you like to leave a review of this lesson? Enter 1 for Yes, 2 for No: ");
                    int choice4 = scanner.nextInt();
                    if (choice4 == 1) {
                        System.out.println("Please write a few sentences about how you found the lesson: ");
                        String exception = scanner.nextLine(); //This is to avoid an exception of no user input.
                        String review = scanner.nextLine();
                        Review.reviewScienceMarch.add(review);
                    } else {
                        System.out.println("No review given");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            } else if (choice3 == 1 && BookingController.saturdayLessons[choice2].equals("French")) {
                if (Student.studentListFrenchSat.contains(studentTest)) {
                    System.out.print("Please leave a rating from 1 - 5.\n1. Very Dissatisfied\n2. Dissatisfied\n3. Ok\n4. Satisfied\n5. Very Satisfied\nEnter Number: ");
                    int rating = scanner.nextInt();
                    if (rating >= 1 && rating <= 10) {
                        System.out.println("You have given French the rating of: " + rating);
                        Rating.ratingFrenchMarch.add(rating);
                    } else {
                        System.out.println("Error, incorrect number.");
                        BookingController.runProgram(studentTest);
                    }

                    System.out.print("Would you like to leave a review of this lesson? Enter 1 for Yes, 2 for No: ");
                    int choice4 = scanner.nextInt();
                    if (choice4 == 1) {
                        System.out.println("Please write a few sentences about how you found the lesson: ");
                        String exception = scanner.nextLine(); //This is to avoid an exception of no user input.
                        String review = scanner.nextLine();
                        Review.reviewFrenchMarch.add(review);
                    } else {
                        System.out.println("No review given");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            }

        } else if (BookingController.daySelection[choice1].equals("Sunday")) {
            for (int count = 0; count < 4; count++) {
                System.out.println((count + 1) + ". " + BookingController.timeSelection[count]);
            }
            System.out.println("What time did you attend the lesson?");
            int choice2 = scanner.nextInt();
            choice2 -= 1;

            System.out.println(BookingController.timeSelection[choice2]);
            //choice2 will be 0 for Morn, 1 for Aft, 2 for Early, 3 for Late

            System.out.println("The lesson for this date and time is: " + BookingController.sundayLessons[choice2]);
            //Sorting of lessons for saturday is done. Now to confirm booking of the lesson and give a booking ID.
            System.out.println("Did you attend this lesson? Enter 1 for yes, 2 for no");

            //adds reviews and ratings
            int choice3 = scanner.nextInt();
            if (choice3 == 1 && BookingController.sundayLessons[choice2].equals("Maths")) {
                if (Student.studentListMathsSun.contains(studentTest)) {
                    System.out.print("Please leave a rating from 1 - 5.\n1. Very Dissatisfied\n2. Dissatisfied\n3. Ok\n4. Satisfied\n5. Very Satisfied\nEnter Number: ");
                    int rating = scanner.nextInt();
                    if (rating >= 1 && rating <= 5) {
                        System.out.println("You have given English the rating of: " + rating);
                        Rating.ratingMathsMarch.add(rating);
                    } else {
                        System.out.println("Error, incorrect number.");
                        BookingController.runProgram(studentTest);
                    }

                    System.out.print("Would you like to leave a review of this lesson? Enter 1 for Yes, 2 for No: ");
                    int choice4 = scanner.nextInt();
                    if (choice4 == 1) {
                        System.out.println("Please write a few sentences about how you found the lesson: ");
                        String exception = scanner.nextLine(); //This is to avoid an exception of no user input.
                        String review = scanner.nextLine();
                        Review.reviewMathsMarch.add(review);
                    } else {
                        System.out.println("No review given");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            } else if (choice3 == 1 && BookingController.sundayLessons[choice2].equals("Science")) {
                if (Student.studentListScienceSun.contains(studentTest)) {
                    System.out.print("Please leave a rating from 1 - 5.\n1. Very Dissatisfied\n2. Dissatisfied\n3. Ok\n4. Satisfied\n5. Very Satisfied\nEnter Number: ");
                    int rating = scanner.nextInt();
                    if (rating >= 1 && rating <= 10) {
                        System.out.println("You have given Maths the rating of: " + rating);
                        Rating.ratingScienceMarch.add(rating);
                    } else {
                        System.out.println("Error, incorrect number.");
                        BookingController.runProgram(studentTest);
                    }

                    System.out.print("Would you like to leave a review of this lesson? Enter 1 for Yes, 2 for No: ");
                    int choice4 = scanner.nextInt();
                    if (choice4 == 1) {
                        System.out.println("Please write a few sentences about how you found the lesson: ");
                        String exception = scanner.nextLine(); //This is to avoid an exception of no user input.
                        String review = scanner.nextLine();
                        Review.reviewScienceMarch.add(review);
                    } else {
                        System.out.println("No review given");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            } else if (choice3 == 1 && BookingController.sundayLessons[choice2].equals("French")) {
                if (Student.studentListFrenchSun.contains(studentTest)) {
                    System.out.print("Please leave a rating from 1 - 5.\n1. Very Dissatisfied\n2. Dissatisfied\n3. Ok\n4. Satisfied\n5. Very Satisfied\nEnter Number: ");
                    int rating = scanner.nextInt();
                    if (rating >= 1 && rating <= 10) {
                        System.out.println("You have given Science the rating of: " + rating);
                        Rating.ratingFrenchMarch.add(rating);
                    } else {
                        System.out.println("Error, incorrect number.");
                        BookingController.runProgram(studentTest);
                    }

                    System.out.print("Would you like to leave a review of this lesson? Enter 1 for Yes, 2 for No: ");
                    int choice4 = scanner.nextInt();
                    if (choice4 == 1) {
                        System.out.println("Please write a few sentences about how you found the lesson: ");
                        String exception = scanner.nextLine(); //This is to avoid an exception of no user input.
                        String review = scanner.nextLine();
                        Review.reviewFrenchMarch.add(review);
                    } else {
                        System.out.println("No review given");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            } else if (choice3 == 1 && BookingController.saturdayLessons[choice2].equals("English")) {
                if (Student.studentListEnglishSun.contains(studentTest)) {
                    System.out.print("Please leave a rating from 1 - 5.\n1. Very Dissatisfied\n2. Dissatisfied\n3. Ok\n4. Satisfied\n5. Very Satisfied\nEnter Number: ");
                    int rating = scanner.nextInt();
                    if (rating >= 1 && rating <= 10) {
                        System.out.println("You have given French the rating of: " + rating);
                        Rating.ratingEnglishMarch.add(rating);
                    } else {
                        System.out.println("Error, incorrect number.");
                        BookingController.runProgram(studentTest);
                    }

                    System.out.print("Would you like to leave a review of this lesson? Enter 1 for Yes, 2 for No: ");
                    int choice4 = scanner.nextInt();
                    if (choice4 == 1) {
                        System.out.println("Please write a few sentences about how you found the lesson: ");
                        String exception = scanner.nextLine(); //This is to avoid an exception of no user input.
                        String review = scanner.nextLine();
                        Review.reviewEnglishMarch.add(review);
                    } else {
                        System.out.println("No review given");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            }

        }
        BookingController.runProgram(studentTest);
    }
}