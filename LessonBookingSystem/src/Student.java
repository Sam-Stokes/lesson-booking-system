import java.util.ArrayList;
import java.util.List;

public class Student {
    String id;
    String studentName;

    //Student lists for each subject saturday
    static List<Student> studentListEnglishSat = new ArrayList<>();
    static List<Student> studentListMathsSat = new ArrayList<>();
    static List<Student> studentListScienceSat = new ArrayList<>();
    static List<Student> studentListFrenchSat = new ArrayList<>();

    //Student lists for each subject sunday
    static List<Student> studentListEnglishSun = new ArrayList<>();
    static List<Student> studentListMathsSun = new ArrayList<>();
    static List<Student> studentListScienceSun = new ArrayList<>();
    static List<Student> studentListFrenchSun = new ArrayList<>();

    //Students
    static Student one = new Student("1", "Sam Stokes");
    static Student two = new Student("2", "John Doe");
    static Student three = new Student("3", "Kenny Kormack");
    static Student four = new Student("4", "Kyle Jackson");
    static Student five = new Student("5", "Lillie Cobb");
    static Student six = new Student("6", "Dean Tate");
    static Student seven = new Student("7", "Jean Clayton");
    static Student eight = new Student("8", "Jane Doe");
    static Student nine = new Student("9", "Jason Webb");
    static Student ten = new Student("10", "Vincent Elliot");
    static Student eleven = new Student("11", "Jordan Loren");
    static Student twelve = new Student("12", "Roy Floyd");
    static Student thirteen = new Student("13", "Frank Lampard");
    static Student fourteen = new Student("14", "Johnnie Fuller");
    static Student fifteen = new Student("15", "Didier Smith");
    static Student test = new Student("16", "Userinput Test");

    //Constructor
    public Student(String id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student: " +
                "id = '" + id + '\'' +
                ", studentName = '" + studentName + '\'';
    }

    public boolean contains(String studentName) {
        return true;
    }
}
