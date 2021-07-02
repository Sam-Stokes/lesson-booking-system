import java.util.ArrayList;
import java.util.List;

public class Review {
    String lessonString;

    //String lists for each subject in March
    static List<String> reviewEnglishMarch = new ArrayList<String>();
    static List<String> reviewMathsMarch = new ArrayList<>();
    static List<String> reviewScienceMarch = new ArrayList<>();
    static List<String> reviewFrenchMarch = new ArrayList<>();

    static List<String> reviewEnglishFeb = new ArrayList<String>();
    static List<String> reviewMathsFeb = new ArrayList<>();
    static List<String> reviewScienceFeb = new ArrayList<>();
    static List<String> reviewFrenchFeb = new ArrayList<>();

    static List<String> reviewEnglishJan = new ArrayList<String>();
    static List<String> reviewMathsJan = new ArrayList<>();
    static List<String> reviewScienceJan = new ArrayList<>();
    static List<String> reviewFrenchJan = new ArrayList<>();

    //Hardcoding Reviews
    static {
        reviewEnglishJan.add("It was great to get a free text book, thanks");
        reviewEnglishJan.add("Great lesson");
        reviewEnglishJan.add("I had fun");
        reviewEnglishJan.add("Will come back again");
        reviewMathsJan.add("Teaching was very good");
        reviewMathsJan.add("Too expensive for what it was");
        reviewMathsJan.add("Needed to be longer");
        reviewMathsJan.add("Good");
        reviewMathsJan.add("Small class numbers were great");
        reviewMathsJan.add("Didn't make sense");
        reviewScienceJan.add("I really enjoyed it");
        reviewScienceJan.add("Better than my teacher in school!!");
        reviewScienceJan.add("Teacher was great and very helpful");
        reviewScienceJan.add("Very helpful");
        reviewFrenchJan.add("Feeling good about my exams now");
        reviewFrenchJan.add("Already knew everything");
        reviewFrenchJan.add("Poor teaching");
        reviewFrenchJan.add("Good value for money");

        reviewEnglishFeb.add("Excellent");
        reviewEnglishFeb.add("Very disappointed with this weeks lesson");
        reviewEnglishFeb.add("I enjoyed it");
        reviewMathsFeb.add("Learned a lot thanks");
        reviewMathsFeb.add("Great way to prepare for exams");
        reviewMathsFeb.add("Will be back again for more");
        reviewMathsFeb.add("The teaching was great, but I needed more complex topics");
        reviewMathsFeb.add("Free text book is always a bonus, thanks");
        reviewScienceFeb.add("A lot covered in a small amount of time which is good");
        reviewScienceFeb.add("5 rating from me");
        reviewScienceFeb.add("Excellent");
        reviewScienceFeb.add("Feeling confident about exams");
        reviewFrenchFeb.add("Very helpful");
        reviewFrenchFeb.add("Great thanks");
        reviewFrenchFeb.add("Would recommend");
    }

    public Review(String review) {
        this.lessonString = review;
    }

    @Override
    public String toString() {
        return "String: "  + lessonString;
    }
}
