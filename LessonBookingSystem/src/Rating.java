import java.util.*;

public class Rating {
    int lessonRating;
    //out of 10. 1 for the lowest, 10 for highest

    //Add ratings to list as per how many students are booked on and get the average for that lesson.

    //String lists for each subject in March
    static List<Integer> ratingEnglishMarch = new ArrayList<Integer>();
    static List<Integer> ratingMathsMarch = new ArrayList<Integer>();
    static List<Integer> ratingScienceMarch = new ArrayList<Integer>();
    static List<Integer> ratingFrenchMarch = new ArrayList<Integer>();

    //String lists for each subject in February
    static List<Integer> ratingEnglishFeb = new ArrayList<Integer>();
    static List<Integer> ratingMathsFeb = new ArrayList<Integer>();
    static List<Integer> ratingScienceFeb = new ArrayList<Integer>();
    static List<Integer> ratingFrenchFeb = new ArrayList<Integer>();

    //String lists for each subject in March
    static List<Integer> ratingEnglishJan = new ArrayList<Integer>();
    static List<Integer> ratingMathsJan = new ArrayList<Integer>();
    static List<Integer> ratingScienceJan = new ArrayList<Integer>();
    static List<Integer> ratingFrenchJan = new ArrayList<Integer>();

    //Hard Coding Student Ratings for February and January
    static {
        ratingEnglishFeb.add(3);
        ratingEnglishFeb.add(5);
        ratingEnglishFeb.add(1);
        ratingEnglishFeb.add(3);
        ratingEnglishFeb.add(4);
        ratingEnglishFeb.add(4);
        ratingEnglishFeb.add(5);
        ratingEnglishFeb.add(5);
        ratingEnglishFeb.add(3);
        ratingEnglishFeb.add(5);
        ratingEnglishFeb.add(4);
        ratingEnglishFeb.add(4);
        ratingEnglishFeb.add(5);
        ratingEnglishFeb.add(3);
        ratingEnglishFeb.add(5);
        ratingEnglishFeb.add(4);
        ratingEnglishFeb.add(1);
        ratingEnglishFeb.add(2);
        ratingEnglishFeb.add(4);
        ratingEnglishFeb.add(4);
        ratingEnglishFeb.add(5);
        ratingEnglishFeb.add(4);
        ratingEnglishFeb.add(2);

        ratingMathsFeb.add(5);
        ratingMathsFeb.add(4);
        ratingMathsFeb.add(5);
        ratingMathsFeb.add(5);
        ratingMathsFeb.add(3);
        ratingMathsFeb.add(4);
        ratingMathsFeb.add(4);
        ratingMathsFeb.add(3);
        ratingMathsFeb.add(5);
        ratingMathsFeb.add(5);
        ratingMathsFeb.add(1);
        ratingMathsFeb.add(3);
        ratingMathsFeb.add(3);
        ratingMathsFeb.add(5);
        ratingMathsFeb.add(4);
        ratingMathsFeb.add(2);
        ratingMathsFeb.add(4);
        ratingMathsFeb.add(5);
        ratingMathsFeb.add(3);

        ratingScienceFeb.add(4);
        ratingScienceFeb.add(4);
        ratingScienceFeb.add(5);
        ratingScienceFeb.add(1);
        ratingScienceFeb.add(2);
        ratingScienceFeb.add(4);
        ratingScienceFeb.add(4);
        ratingScienceFeb.add(4);
        ratingScienceFeb.add(5);
        ratingScienceFeb.add(4);
        ratingScienceFeb.add(5);
        ratingScienceFeb.add(3);
        ratingScienceFeb.add(4);
        ratingScienceFeb.add(5);
        ratingScienceFeb.add(4);
        ratingScienceFeb.add(4);
        ratingScienceFeb.add(5);
        ratingScienceFeb.add(4);
        ratingScienceFeb.add(5);
        ratingScienceFeb.add(4);
        ratingScienceFeb.add(2);
        ratingScienceFeb.add(3);
        ratingScienceFeb.add(4);
        ratingScienceFeb.add(4);

        ratingFrenchFeb.add(5);
        ratingFrenchFeb.add(5);
        ratingFrenchFeb.add(2);
        ratingFrenchFeb.add(1);
        ratingFrenchFeb.add(2);
        ratingFrenchFeb.add(5);
        ratingFrenchFeb.add(4);
        ratingFrenchFeb.add(4);
        ratingFrenchFeb.add(5);
        ratingFrenchFeb.add(3);
        ratingFrenchFeb.add(5);
        ratingFrenchFeb.add(5);
        ratingFrenchFeb.add(2);
        ratingFrenchFeb.add(3);
        ratingFrenchFeb.add(5);

        ratingEnglishJan.add(1);
        ratingEnglishJan.add(4);
        ratingEnglishJan.add(5);
        ratingEnglishJan.add(4);
        ratingEnglishJan.add(4);
        ratingEnglishJan.add(5);
        ratingEnglishJan.add(3);
        ratingEnglishJan.add(4);
        ratingEnglishJan.add(5);
        ratingEnglishJan.add(4);
        ratingEnglishJan.add(5);
        ratingEnglishJan.add(5);
        ratingEnglishJan.add(5);
        ratingEnglishJan.add(3);
        ratingEnglishJan.add(3);
        ratingEnglishJan.add(4);
        ratingEnglishJan.add(4);
        ratingEnglishJan.add(5);
        ratingEnglishJan.add(5);

        ratingMathsJan.add(5);
        ratingMathsJan.add(4);
        ratingMathsJan.add(5);
        ratingMathsJan.add(5);
        ratingMathsJan.add(4);
        ratingMathsJan.add(3);
        ratingMathsJan.add(4);
        ratingMathsJan.add(4);
        ratingMathsJan.add(3);
        ratingMathsJan.add(5);
        ratingMathsJan.add(5);
        ratingMathsJan.add(5);
        ratingMathsJan.add(4);
        ratingMathsJan.add(5);
        ratingMathsJan.add(5);
        ratingMathsJan.add(4);
        ratingMathsJan.add(3);

        ratingScienceJan.add(5);
        ratingScienceJan.add(4);
        ratingScienceJan.add(4);
        ratingScienceJan.add(3);
        ratingScienceJan.add(3);
        ratingScienceJan.add(5);
        ratingScienceJan.add(5);
        ratingScienceJan.add(5);
        ratingScienceJan.add(4);
        ratingScienceJan.add(4);
        ratingScienceJan.add(3);
        ratingScienceJan.add(3);
        ratingScienceJan.add(4);
        ratingScienceJan.add(4);
        ratingScienceJan.add(5);

        ratingFrenchJan.add(5);
        ratingFrenchJan.add(5);
        ratingFrenchJan.add(4);
        ratingFrenchJan.add(5);
        ratingFrenchJan.add(4);
        ratingFrenchJan.add(3);
        ratingFrenchJan.add(4);
        ratingFrenchJan.add(4);
        ratingFrenchJan.add(5);
        ratingFrenchJan.add(5);
        ratingFrenchJan.add(4);
        ratingFrenchJan.add(5);
        ratingFrenchJan.add(5);
        ratingFrenchJan.add(2);
        ratingFrenchJan.add(5);
        ratingFrenchJan.add(4);
        ratingFrenchJan.add(5);
        ratingFrenchJan.add(4);
        ratingFrenchJan.add(5);
    }


    public static double getAverage(List<Integer> average) {
        return average.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public Rating(int rating) {
        this.lessonRating = rating;
    }

}

//https://stackoverflow.com/questions/10168066/how-to-print-out-all-the-elements-of-a-list-in-java/26901895
//Use link to access the ints of the list and add them using a for loop. Then get the average.


//Just need lists for students to hardcode code for reports?