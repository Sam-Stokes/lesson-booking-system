import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    protected static Map<String, Map<Map, Map>> week9 = new HashMap<>();
    protected static Map<Map, Map> saturdayAndSunday = new HashMap<>();
    private static Map<String, Map<String, List<Student>>> saturdayDay = new HashMap<>();
    private static Map<String, Map<String, List<Student>>> sundayDay = new HashMap<>();
    protected static Map<String, List<Student>> timeAndSubjectSun = new HashMap<>();
    protected static Map<String, List<Student>> timeAndSubjectSat = new HashMap<>();

    private static String[] weekNo = {"\nWeek 1", "\nWeek 2", "\nWeek 3", "\nWeek 4", "\nWeek 5", "\nWeek 6", "\nWeek 7", "\nWeek 8", "Week 9\n"};
    private static String[] saturdayLessons = {"Morning - English", "Afternoon - Maths", "Early Evening - Science", "Late Evening - French"};
    private static String[] sundayLessons = {"Morning - Maths", "Afternoon - Science", "Early Evening - French", "Late Evening - English"};

    public static void main(String[] args) {

        //Saturday Students
        //English Students, rating and review
        Student.studentListEnglishSat.add(Student.one);
        Rating.ratingEnglishMarch.add(3);
        Review.reviewEnglishMarch.add("Average Lesson, more examples needed.");
        Student.studentListEnglishSat.add(Student.two);
        Rating.ratingEnglishMarch.add(4);
        Review.reviewEnglishMarch.add("Great lesson. Very informative");
        Student.studentListEnglishSat.add(Student.three);
        Rating.ratingEnglishMarch.add(5);
        Review.reviewEnglishMarch.add("I enjoyed the lesson very much which is why I give it the rating of 5");
        Student.studentListEnglishSat.add(Student.four);
        Rating.ratingEnglishMarch.add(5);
        Review.reviewEnglishMarch.add("Will be booking on to the next one");
        Student.studentListEnglishSat.add(Student.test);
        //Rating and review left blank here as the 'test' object can be used to add a rating during runtime of the program.

        //Maths Students and Ratings
        Student.studentListMathsSat.add(Student.five);
        Rating.ratingMathsMarch.add(2);
        Review.reviewMathsMarch.add("Needed more algebra");
        Student.studentListMathsSat.add(Student.twelve);
        Rating.ratingMathsMarch.add(3);
        Student.studentListMathsSat.add(Student.eight);
        Rating.ratingMathsMarch.add(1);
        Review.reviewMathsMarch.add("Not enough algebra this time around.");

        //Science Students and Ratings
        Student.studentListScienceSat.add(Student.nine);
        Rating.ratingScienceMarch.add(4);
        Student.studentListScienceSat.add(Student.seven);
        Rating.ratingScienceMarch.add(5);
        Review.reviewScienceMarch.add("5 rating for a great teacher");
        Student.studentListScienceSat.add(Student.thirteen);
        Rating.ratingScienceMarch.add(3);
        Review.reviewScienceMarch.add("Will be back for another lesson");

        //French Students and Ratings
        Student.studentListFrenchSat.add(Student.eleven);
        Rating.ratingFrenchMarch.add(2);
        Student.studentListFrenchSat.add(Student.fourteen);
        Rating.ratingFrenchMarch.add(4);
        Review.reviewFrenchMarch.add("Challenging");
        Student.studentListFrenchSat.add(Student.fifteen);
        Rating.ratingFrenchMarch.add(5);
        Review.reviewFrenchMarch.add("I learned a lot in this lesson");

        //Adding Students to given subject time on Saturday.
        timeAndSubjectSat.put(saturdayLessons[0], Student.studentListEnglishSat);
        timeAndSubjectSat.put(saturdayLessons[1], Student.studentListMathsSat);
        timeAndSubjectSat.put(saturdayLessons[2], Student.studentListScienceSat);
        timeAndSubjectSat.put(saturdayLessons[3], Student.studentListFrenchSat);

        //Sunday Students
        //English Students and Ratings
        Student.studentListEnglishSun.add(Student.six);
        Rating.ratingEnglishMarch.add(3);
        Review.reviewEnglishMarch.add("Very informative");
        Student.studentListEnglishSun.add(Student.eight);
        Rating.ratingEnglishMarch.add(4);
        Review.reviewEnglishMarch.add("Great teaching and resources");

        //Maths Students and Ratings
        Student.studentListMathsSun.add(Student.ten);
        Rating.ratingMathsMarch.add(3);
        Review.reviewMathsMarch.add("It was great to get a free text book, thanks");
        Student.studentListMathsSun.add(Student.thirteen);
        Rating.ratingMathsMarch.add(4);
        Student.studentListMathsSun.add(Student.three);
        Rating.ratingMathsMarch.add(2);
        Review.reviewMathsMarch.add("I don't think I will be coming back");
        Student.studentListMathsSun.add(Student.eight);
        Rating.ratingMathsMarch.add(3);
        Review.reviewMathsMarch.add("Not bad");
        Student.studentListMathsSun.add(Student.nine);
        Rating.ratingMathsMarch.add(4);
        Review.reviewMathsMarch.add("Enjoyed it a lot");

        //Science Students and Ratings
        Student.studentListScienceSun.add(Student.fourteen);
        Rating.ratingScienceMarch.add(5);
        Review.reviewScienceMarch.add("I really enjoyed the teacher of this lesson and I learned a lot");
        Student.studentListScienceSun.add(Student.eight);
        Rating.ratingScienceMarch.add(2);


        //French Students and Ratings
        Student.studentListFrenchSun.add(Student.seven);
        Rating.ratingFrenchMarch.add(1);
        Review.reviewFrenchMarch.add("It was too complex, need a more beginner lesson");
        Student.studentListFrenchSun.add(Student.twelve);
        Rating.ratingFrenchMarch.add(4);
        Student.studentListFrenchSun.add(Student.nine);
        Rating.ratingFrenchMarch.add(5);

        //Adding Students to given subject time on Sunday.
        timeAndSubjectSun.put(sundayLessons[0], Student.studentListMathsSun);
        timeAndSubjectSun.put(sundayLessons[1], Student.studentListScienceSun);
        timeAndSubjectSun.put(sundayLessons[2], Student.studentListFrenchSun);
        timeAndSubjectSun.put(sundayLessons[3], Student.studentListEnglishSun);
        //int lessonPopulation = timeAndSubjectSun.size();

        saturdayDay.put("Saturday\n", timeAndSubjectSat);
        sundayDay.put("\nSunday\n", timeAndSubjectSun);
        saturdayAndSunday.put(saturdayDay, sundayDay);
        week9.put(weekNo[8], saturdayAndSunday);

        //Start program from here
        BookingController.runProgram(Student.test);
    }
}