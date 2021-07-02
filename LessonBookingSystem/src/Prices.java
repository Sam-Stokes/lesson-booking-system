public class Prices {
    protected static int englishPrice = 50;
    protected static int mathsPrice = 70;
    protected static int sciencePrice = 60;
    protected static int frenchPrice = 40;

    protected static int englishSatSize = Student.studentListEnglishSat.size();
    protected static int mathsSatSize = Student.studentListMathsSat.size();
    protected static int scienceSatSize = Student.studentListScienceSat.size();
    protected static int frenchSatSize = Student.studentListFrenchSat.size();

    protected static int englishSunSize = Student.studentListEnglishSun.size();
    protected static int mathsSunSize = Student.studentListMathsSun.size();
    protected static int scienceSunSize = Student.studentListScienceSun.size();
    protected static int frenchSunSize = Student.studentListFrenchSun.size();


    static int englishTotalMarch = (englishSatSize + englishSunSize) * englishPrice;
    static int mathsTotalMarch = (mathsSatSize + mathsSunSize) * mathsPrice;
    static int scienceTotalMarch = (scienceSatSize + scienceSunSize) * sciencePrice;
    static int frenchTotalMarch = (frenchSatSize + frenchSunSize) * frenchPrice;

    //Hard Coding price total for February and January
    static int englishTotalFeb = Rating.ratingEnglishFeb.size() * englishPrice;
    static int mathsTotalFeb = Rating.ratingMathsFeb.size() * mathsPrice;
    static int scienceTotalFeb = Rating.ratingScienceFeb.size() * sciencePrice;
    static int frenchTotalFeb = Rating.ratingFrenchFeb.size() * frenchPrice;

    static int englishTotalJan = Rating.ratingEnglishJan.size() * englishPrice;
    static int mathsTotalJan = Rating.ratingMathsJan.size() * mathsPrice;
    static int scienceTotalJan = Rating.ratingScienceJan.size() * sciencePrice;
    static int frenchTotalJan = Rating.ratingFrenchJan.size() * frenchPrice;

    public static int getEnglishTotalFeb() {
        return englishTotalFeb;
    }

    public static int getMathsTotalFeb() {
        return mathsTotalFeb;
    }

    public static int getScienceTotalFeb() {
        return scienceTotalFeb;
    }

    public static int getFrenchTotalFeb() {
        return frenchTotalFeb;
    }

    public static int getEnglishTotalJan() {
        return englishTotalJan;
    }

    public static int getMathsTotalJan() {
        return mathsTotalJan;
    }

    public static int getScienceTotalJan() {
        return scienceTotalJan;
    }

    public static int getFrenchTotalJan() {
        return frenchTotalJan;
    }

    public static int getEnglishTotalMarch() {
        return englishTotalMarch;
    }

    public static int getMathsTotalMarch() {
        return mathsTotalMarch;
    }

    public static int getScienceTotalMarch() {
        return scienceTotalMarch;
    }

    public static int getFrenchTotalMarch() {
        return frenchTotalMarch;
    }
}
