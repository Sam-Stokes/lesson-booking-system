import java.util.*;


public class BookingController {
    protected static Scanner scanner = new Scanner(System.in);
    protected static String[] daySelection = {"Saturday", "Sunday"};
    protected static String[] timeSelection = {"Morning", "Afternoon", "Early Evening", "Late Evening"};
    protected static String[] saturdayLessons = {"English", "Maths", "Science", "French"};
    protected static String[] sundayLessons = {"Maths", "Science", "French", "English"};

    public static void runProgram(Student studentTest) {
        System.out.println("--------------------------------------------");
        System.out.println("\nExtra Tuition Centre Student Booking System\n");
        System.out.println("--------------------------------------------");
        System.out.println("You are logged on as: " + studentTest + "\n");
        System.out.println("1. Book a Lesson\n2. Change a Lesson\n3. Cancel a Lesson\n4. Attend Lesson\n5. Monthly Lesson Report\n6. Monthly Champion Report\n7. Exit Program");
        System.out.print("\nEnter a Number: ");
        int choice1 = scanner.nextInt();

        if (choice1 == 1) {
            bookLesson(studentTest);
        } else if (choice1 == 2) {
            changeLesson(studentTest);
        } else if (choice1 == 3) {
            cancelLesson(studentTest);
        } else if (choice1 == 4) {
            StudentController.attendLesson(studentTest);
        } else if (choice1 == 5) {
            Reports.monthlyLessonReport();
        } else if(choice1 == 6) {
            Reports.monthlyChampionLessonReport();
        } else {
            System.out.println("End of Program");
        }
    }

    public static void bookLesson(Student studentTest) {
        System.out.println("\nLesson Booking System\n");
        System.out.println("Which day would you like to book?");
        for (int count = 0; count < 2; count++) {
            System.out.println((count + 1) + ". " + daySelection[count]);
        }

        int choice1 = scanner.nextInt();
        choice1 -= 1;

        System.out.println("You have chosen: " + daySelection[choice1]);
        //choice1 is 0 for Saturday or 1 for Sunday

        if (daySelection[choice1].equals("Saturday")) {
            for (int count = 0; count < 4; count++) {
                System.out.println((count + 1) + ". " + timeSelection[count]);
            }
            System.out.println("Which time would you like to book?");
            int choice2 = scanner.nextInt();
            choice2 -= 1;

            System.out.println(timeSelection[choice2]);
            //choice2 will be 0 for Morn, 1 for Aft, 2 for Early, 3 for Late

            System.out.println("The lesson for this date and time is: " + saturdayLessons[choice2]);
            //Sorting of lessons for saturday is done. Now to confirm booking of the lesson and give a booking ID.
            System.out.println("Would you like to book this lesson? Enter 1 for yes, 2 for no");

            //adds student to list
            int choice3 = scanner.nextInt();
            if (choice3 == 1 && saturdayLessons[choice2].equals("English")) {
                if (Student.studentListEnglishSat.contains(studentTest)) {
                    System.out.println("Student already booked on");
                } else if (Student.studentListEnglishSat.size() >= 5) {
                    System.out.println("This lesson is fully booked");
                } else {
                    Student.studentListEnglishSat.add(studentTest);
                    Prices.englishSatSize++;
                    Prices.englishTotalMarch = (Prices.englishSatSize + Prices.englishSunSize) * Prices.englishPrice;
                    System.out.println("Student booked onto " + saturdayLessons[choice2] + " in the " + timeSelection[choice2]);
                }

                //Next one starts here, try to add a way of searching if the user is already booked.
            } else if (choice3 == 1 && saturdayLessons[choice2].equals("Maths")) {
                if (Student.studentListMathsSat.contains(studentTest)) {
                    System.out.println("Student already booked on");
                } else if (Student.studentListMathsSat.size() >= 5) {
                    System.out.println("This lesson is fully booked");
                } else {
                    Student.studentListMathsSat.add(studentTest);
                    Prices.mathsSatSize++;
                    Prices.mathsTotalMarch = (Prices.mathsSatSize + Prices.mathsSunSize) * Prices.mathsPrice;
                    System.out.println("Student booked onto " + saturdayLessons[choice2] + " in the " + timeSelection[choice2]);
                }

            } else if (choice3 == 1 && saturdayLessons[choice2].equals("Science")) {
                if (Student.studentListScienceSat.contains(studentTest)) {
                    System.out.println("Student already booked on");
                } else if (Student.studentListScienceSat.size() >= 5) {
                    System.out.println("This lesson is fully booked");
                } else {
                    Student.studentListScienceSat.add(studentTest);
                    Prices.scienceSatSize++;
                    Prices.scienceTotalMarch = (Prices.scienceSatSize + Prices.scienceSunSize) * Prices.sciencePrice;
                    System.out.println("Student booked onto " + saturdayLessons[choice2] + " in the " + timeSelection[choice2]);
                }

            } else if (choice3 == 1 && saturdayLessons[choice2].equals("French")) {
                if (Student.studentListFrenchSat.contains(studentTest)) {
                    System.out.println("Student already booked on");
                } else if (Student.studentListFrenchSat.size() >= 5) {
                    System.out.println("This lesson is fully booked");
                } else {
                    Student.studentListFrenchSat.add(studentTest);
                    Prices.frenchSatSize++;
                    Prices.frenchTotalMarch = (Prices.frenchSatSize + Prices.frenchSunSize) * Prices.frenchPrice;
                    System.out.println("Student booked onto " + saturdayLessons[choice2] + " in the " + timeSelection[choice2]);
                }
            }
        }

        //Sunday
        if (daySelection[choice1].equals("Sunday")) {
            for (int count = 0; count < 4; count++) {
                System.out.println((count + 1) + ". " + timeSelection[count]);
            }
            System.out.println("Which time would you like to book?");
            int choice4 = scanner.nextInt();
            choice4 -= 1;

            System.out.println(timeSelection[choice4]);
            //choice2 will be 0 for Morn, 1 for Aft, 2 for Early, 3 for Late

            System.out.println("The lesson for this date and time is: " + sundayLessons[choice4]);
            //Sorting of lessons for sunday is done. Now to confirm booking of the lesson and give a booking ID.
            System.out.println("Would you like to book this lesson? Enter 1 for yes, 2 for no");

            //adds student to list
            //add studentTest to print outs
            int choice3 = scanner.nextInt();
            if (choice3 == 1 && sundayLessons[choice4].equals("French")) {
                if (Student.studentListFrenchSun.contains(studentTest)) {
                    System.out.println("Student already booked on");
                } else if (Student.studentListFrenchSun.size() >= 5) {
                    System.out.println("This lesson is fully booked");
                } else {
                    Student.studentListFrenchSun.add(studentTest);
                    Prices.frenchSunSize++;
                    Prices.frenchTotalMarch = (Prices.frenchSatSize + Prices.frenchSunSize) * Prices.frenchPrice;
                    System.out.println("Student booked onto " + sundayLessons[choice4] + " in the " + timeSelection[choice4]);
                }
            } else if (choice3 == 1 && sundayLessons[choice4].equals("Science")) {
                if (Student.studentListScienceSun.contains(studentTest)) {
                    System.out.println("Student already booked on");
                } else if (Student.studentListScienceSun.size() >= 5) {
                    System.out.println("This lesson is fully booked");
                } else {
                    Student.studentListScienceSun.add(studentTest);
                    Prices.scienceSunSize++;
                    Prices.scienceTotalMarch = (Prices.scienceSatSize + Prices.scienceSunSize) * Prices.sciencePrice;
                    System.out.println(studentTest + " booked onto " + sundayLessons[choice4] + " in the " + timeSelection[choice4]);
                }
            } else if (choice3 == 1 && sundayLessons[choice4].equals("Maths")) {
                if (Student.studentListMathsSun.contains(studentTest)) {
                    System.out.println("Student already booked on");
                } else if (Student.studentListMathsSun.size() >= 5) {
                    System.out.println("This lesson is fully booked");
                } else {
                    Student.studentListMathsSun.add(studentTest);
                    Prices.mathsSunSize++;
                    Prices.mathsTotalMarch = (Prices.mathsSatSize + Prices.mathsSunSize) * Prices.mathsPrice;
                    System.out.println(studentTest + " booked onto " + sundayLessons[choice4] + " in the " + timeSelection[choice4]);
                }
            } else if (choice3 == 1 && sundayLessons[choice4].equals("English")) {
                if (Student.studentListEnglishSun.contains(studentTest)) {
                    System.out.println("Student already booked on");
                } else if (Student.studentListEnglishSun.size() >= 5) {
                    System.out.println("This lesson is fully booked");
                } else {
                    Student.studentListEnglishSun.add(studentTest);
                    Prices.englishSunSize++;
                    Prices.englishTotalMarch = (Prices.englishSatSize + Prices.englishSunSize) * Prices.englishPrice;
                    System.out.println(studentTest + " booked onto " + sundayLessons[choice4] + " in the " + timeSelection[choice4]);
                }
            }
        }
        runProgram(studentTest);
    }

    public static void changeLesson(Student studentTest) {
        for (int count = 0; count < 2; count++) {
            System.out.println((count + 1) + ". " + daySelection[count]);
        }

        System.out.println("Which day is the lesson booked on that you would like to change");
        int choice1 = scanner.nextInt();
        choice1 -= 1;

        System.out.println("You have chosen: " + daySelection[choice1]);


        if (daySelection[choice1].equals("Saturday")) {
            for (int count = 0; count < 4; count++) {
                System.out.println((count + 1) + ". " + timeSelection[count]);
            }
            System.out.println("What time on " + daySelection[choice1] + " is the lesson booked for?");
            int choice2 = scanner.nextInt();
            choice2 -= 1;

            System.out.println(timeSelection[choice2]);

            System.out.println("The lesson for this date and time is: " + saturdayLessons[choice2]);
            //Here check to see if the student is booked onto the lesson and take action if they are or aren't

            if (saturdayLessons[choice2].equals("English")) {
                if (Student.studentListEnglishSat.contains(studentTest)) {
                    System.out.println("Student confirmed booked on");
                    System.out.println("Would you like to change this to another lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListEnglishSat.remove(studentTest);
                        bookLesson(studentTest);
                    }
                } else {
                    System.out.println("Student not booked onto this lesson. Would you like to book onto this lesson? 1 for yes 2 for no");
                    //Book student onto lesson here if they say yes.
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        if (Student.studentListEnglishSat.size() >= 5) {
                            System.out.println("Sorry, lesson is fully booked");
                            runProgram(studentTest);
                        } else {
                            Student.studentListEnglishSat.add(studentTest);
                            System.out.println(studentTest + " booked onto English");
                        }
                    } else {
                        System.out.println("Student not booked on");
                    }
                }
            } else if (saturdayLessons[choice2].equals("Maths")) {
                if (Student.studentListMathsSat.contains(studentTest)) {
                    System.out.println("Student confirmed booked on");
                    System.out.println("Would you like to change this to another lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListMathsSat.remove(studentTest);
                        bookLesson(studentTest);
                    }
                } else {
                    System.out.println("Student not booked onto this lesson. Would you like to book onto this lesson? 1 for yes 2 for no");
                    //Book student onto lesson here if they say yes.
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        if (Student.studentListMathsSat.size() >= 5) {
                            System.out.println("Sorry, lesson is fully booked\n");
                            runProgram(studentTest);
                        } else {
                            Student.studentListMathsSat.add(studentTest);
                            System.out.println(studentTest + " booked onto Maths");
                        }
                    } else {
                        System.out.println("Student not booked on");
                    }
                }
            } else if (saturdayLessons[choice2].equals("Science")) {
                if (Student.studentListScienceSat.contains(studentTest)) {
                    System.out.println("Student confirmed booked on");
                    System.out.println("Would you like to change this to another lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListScienceSat.remove(studentTest);
                        bookLesson(studentTest);
                    }
                } else {
                    System.out.println("Student not booked onto this lesson. Would you like to book onto this lesson? 1 for yes 2 for no");
                    //Book student onto lesson here if they say yes.
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        if (Student.studentListScienceSat.size() >= 5) {
                            System.out.println("Sorry, lesson is fully booked\n");
                            runProgram(studentTest);
                        } else {
                            Student.studentListScienceSat.add(studentTest);
                            System.out.println(studentTest + " booked onto Science");
                        }
                    } else {
                        System.out.println("Student not booked on");
                    }
                }
            } else if (saturdayLessons[choice2].equals("French")) {
                if (Student.studentListFrenchSat.contains(studentTest)) {
                    System.out.println("Student confirmed booked on");
                    System.out.println("Would you like to change this to another lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListFrenchSat.remove(studentTest);
                        bookLesson(studentTest);
                    }
                } else {
                    System.out.println("Student not booked onto this lesson. Would you like to book onto this lesson? 1 for yes 2 for no");
                    //Book student onto lesson here if they say yes.
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        if (Student.studentListFrenchSat.size() >= 5) {
                            System.out.println("Sorry, lesson is fully booked\n");
                            runProgram(studentTest);
                        } else {
                            Student.studentListFrenchSat.add(studentTest);
                            System.out.println(studentTest + " booked onto French");
                        }
                    } else {
                        System.out.println("Student not booked on");
                    }
                }
            }
        }

        //Sunday
        if (daySelection[choice1].equals("Sunday")) {
            for (int count = 0; count < 4; count++) {
                System.out.println((count + 1) + ". " + timeSelection[count]);
            }
            System.out.println("What time on " + daySelection[choice1] + " is the lesson booked for?");
            int choice2 = scanner.nextInt();
            choice2 -= 1;

            System.out.println(timeSelection[choice2]);

            System.out.println("The lesson for this date and time is: " + sundayLessons[choice2]);
            //Here check to see if the student is booked onto the lesson and take action if they are or aren't

            if (sundayLessons[choice2].equals("Maths")) {
                if (Student.studentListMathsSun.contains(studentTest)) {
                    System.out.println("Student confirmed booked on");
                    System.out.println("Would you like to change this to another lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListMathsSun.remove(studentTest);
                        bookLesson(studentTest);
                    }
                } else {
                    System.out.println("Student not booked onto this lesson. Would you like to book onto this lesson? 1 for yes 2 for no");
                    //Book student onto lesson here if they say yes.
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        if (Student.studentListMathsSun.size() >= 5) {
                            System.out.println("Sorry, lesson is fully booked");
                            runProgram(studentTest);
                        } else {
                            Student.studentListMathsSun.add(studentTest);
                            System.out.println(studentTest + " booked onto Maths");
                        }
                    } else {
                        System.out.println("Student not booked on");
                    }
                }
            } else if (saturdayLessons[choice2].equals("Science")) {
                if (Student.studentListScienceSun.contains(studentTest)) {
                    System.out.println("Student confirmed booked on");
                    System.out.println("Would you like to change this to another lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListScienceSun.remove(studentTest);
                        bookLesson(studentTest);
                    }
                } else {
                    System.out.println("Student not booked onto this lesson. Would you like to book onto this lesson? 1 for yes 2 for no");
                    //Book student onto lesson here if they say yes.
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        if (Student.studentListScienceSun.size() >= 5) {
                            System.out.println("Sorry, lesson is fully booked\n");
                            runProgram(studentTest);
                        } else {
                            Student.studentListScienceSun.add(studentTest);
                            System.out.println(studentTest + " booked onto Science");
                        }
                    } else {
                        System.out.println("Student not booked on");
                    }
                }
            } else if (saturdayLessons[choice2].equals("French")) {
                if (Student.studentListFrenchSun.contains(studentTest)) {
                    System.out.println("Student confirmed booked on");
                    System.out.println("Would you like to change this to another lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListFrenchSun.remove(studentTest);
                        bookLesson(studentTest);
                    }
                } else {
                    System.out.println("Student not booked onto this lesson. Would you like to book onto this lesson? 1 for yes 2 for no");
                    //Book student onto lesson here if they say yes.
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        if (Student.studentListFrenchSun.size() >= 5) {
                            System.out.println("Sorry, lesson is fully booked\n");
                            runProgram(studentTest);
                        } else {
                            Student.studentListFrenchSun.add(studentTest);
                            System.out.println(studentTest + " booked onto French");
                        }
                    } else {
                        System.out.println("Student not booked on");
                    }
                }
            } else if (saturdayLessons[choice2].equals("English")) {
                if (Student.studentListEnglishSun.contains(studentTest)) {
                    System.out.println("Student confirmed booked on");
                    System.out.println("Would you like to change this to another lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListEnglishSun.remove(studentTest);
                        bookLesson(studentTest);
                    }
                } else {
                    System.out.println("Student not booked onto this lesson. Would you like to book onto this lesson? 1 for yes 2 for no");
                    //Book student onto lesson here if they say yes.
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        if (Student.studentListEnglishSun.size() >= 5) {
                            System.out.println("Sorry, lesson is fully booked\n");
                            runProgram(studentTest);
                        } else {
                            Student.studentListEnglishSun.add(studentTest);
                            System.out.println(studentTest + " booked onto English");
                        }
                    } else {
                        System.out.println("Student not booked on");
                    }
                }
            }
        }
        runProgram(studentTest);
    }

    public static void cancelLesson(Student studentTest) {
        for (int count = 0; count < 2; count++) {
            System.out.println((count + 1) + ". " + daySelection[count]);
        }

        System.out.println("Which day is the lesson booked on that you would like to cancel?");
        int choice1 = scanner.nextInt();
        choice1 -= 1;

        System.out.println("You have chosen: " + daySelection[choice1]);


        if (daySelection[choice1].equals("Saturday")) {
            for (int count = 0; count < 4; count++) {
                System.out.println((count + 1) + ". " + timeSelection[count]);
            }
            System.out.println("What time on " + daySelection[choice1] + " is the lesson booked for?");
            int choice2 = scanner.nextInt();
            choice2 -= 1;

            System.out.println(timeSelection[choice2]);

            System.out.println("The lesson for this date and time is: " + saturdayLessons[choice2]);
            //Here check to see if the student is booked onto the lesson and take action if they are or aren't

            if (saturdayLessons[choice2].equals("English")) {
                if (Student.studentListEnglishSat.contains(studentTest)) {
                    System.out.println("Student confirmed booked onto lesson");
                    System.out.println("Would you like to cancel this lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListEnglishSat.remove(studentTest);
                        System.out.println("Lesson Cancelled Successfuly. Student removed.");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            } else if (saturdayLessons[choice2].equals("Maths")) {
                if (Student.studentListMathsSat.contains(studentTest)) {
                    System.out.println("Student confirmed booked onto lesson");
                    System.out.println("Would you like to cancel this lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListMathsSat.remove(studentTest);
                        System.out.println("Lesson Cancelled Successfuly. Student removed.");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            } else if (saturdayLessons[choice2].equals("Science")) {
                if (Student.studentListScienceSat.contains(studentTest)) {
                    System.out.println("Student confirmed booked onto lesson");
                    System.out.println("Would you like to cancel this lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListScienceSat.remove(studentTest);
                        System.out.println("Lesson Cancelled Successfuly. Student removed.");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson.");
                }
            } else if (saturdayLessons[choice2].equals("French")) {
                if (Student.studentListFrenchSat.contains(studentTest)) {
                    System.out.println("Student confirmed booked onto lesson");
                    System.out.println("Would you like to cancel this lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListFrenchSat.remove(studentTest);
                        System.out.println("Lesson Cancelled Successfuly. Student removed.");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            }
            //Carry on for rest of lessons
        }

        //Sunday
        if (daySelection[choice1].equals("Sunday")) {
            for (int count = 0; count < 4; count++) {
                System.out.println((count + 1) + ". " + timeSelection[count]);
            }
            System.out.println("What time on " + daySelection[choice1] + " is the lesson booked for?");
            int choice2 = scanner.nextInt();
            choice2 -= 1;

            System.out.println(timeSelection[choice2]);

            System.out.println("The lesson for this date and time is: " + saturdayLessons[choice2]);
            //Here check to see if the student is booked onto the lesson and take action if they are or aren't

            if (saturdayLessons[choice2].equals("Maths")) {
                if (Student.studentListMathsSun.contains(studentTest)) {
                    System.out.println("Student confirmed booked onto lesson");
                    System.out.println("Would you like to cancel this lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListMathsSun.remove(studentTest);
                        System.out.println("Lesson Cancelled Successfuly. Student removed.");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            } else if (saturdayLessons[choice2].equals("Science")) {
                if (Student.studentListScienceSun.contains(studentTest)) {
                    System.out.println("Student confirmed booked onto lesson");
                    System.out.println("Would you like to cancel this lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListScienceSun.remove(studentTest);
                        System.out.println("Lesson Cancelled Successfuly. Student removed.");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            } else if (saturdayLessons[choice2].equals("French")) {
                if (Student.studentListFrenchSun.contains(studentTest)) {
                    System.out.println("Student confirmed booked onto lesson");
                    System.out.println("Would you like to cancel this lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListFrenchSun.remove(studentTest);
                        System.out.println("Lesson Cancelled Successfuly. Student removed.");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            } else if (saturdayLessons[choice2].equals("English")) {
                if (Student.studentListEnglishSun.contains(studentTest)) {
                    System.out.println("Student confirmed booked onto lesson");
                    System.out.println("Would you like to cancel this lesson? 1 for yes 2 for no");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        Student.studentListEnglishSun.remove(studentTest);
                        System.out.println("Lesson Cancelled Successfuly. Student removed.");
                    }
                } else {
                    System.out.println("Student not booked onto this lesson");
                }
            }
            //Carry on for rest of lessons
        }
        runProgram(studentTest);
    }

}