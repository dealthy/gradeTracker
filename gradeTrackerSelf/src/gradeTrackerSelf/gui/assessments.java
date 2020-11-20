package gradeTrackerSelf.gui;

public class assessments {

    public String topic;
    public int dateD;
    //can only be 1 - 31
    public int dateM;
    //can only be 1 - 12
    public int dateY;
    //4 digit number
    public int givenLevel;
    //used for overall score with weighting
    //optional: will implement 85 - 75 scale after calculating the percentage
    public int realScore;
    //scores got
    public int scoreOutOf;
    //score out of
    public double testPercentage;
    public double weight;
    //the weight that the work occupies in the final grade

    //default constructors
    public assessments() {
        this.topic = "Theory of Knowledge Blog Post";
        this.dateD = 1;
        this.dateM = 9;
        this.dateY = 2020;
        this.givenLevel = getLevel(this.realScore, this.scoreOutOf);
        this.realScore = 10;
        this.scoreOutOf = 10;
        this.testPercentage = getPercentage(this.realScore, this.scoreOutOf);
    }
    
    //constructor without level
    public assessments(String name, int dateD, int dateM, int dateY, int realScore, int scoreOutOf) {
        this.topic = name;
        this.dateD = dateD;
        this.dateM = dateM;
        this.dateY = dateY;
        this.givenLevel = getLevel(this.realScore, this.scoreOutOf);
        this.realScore = realScore;
        this.scoreOutOf = scoreOutOf;
        this.testPercentage = getPercentage(this.realScore, this.scoreOutOf);
    }
    
    //constructor with level
    public assessments(String name, int dateD, int dateM, int dateY, int givenLevel, int realScore, int scoreOutOf) {
        this.topic = name;
        this.dateD = dateD;
        this.dateM = dateM;
        this.dateY = dateY;
        this.givenLevel = givenLevel;
        this.realScore = realScore;
        this.scoreOutOf = scoreOutOf;
        this.testPercentage = getPercentage(this.realScore, this.scoreOutOf);
    }

    public static double getPercentage(int realScore, int scoreOutOf) {

        //get the test percentage to one decimal place percision
        return percentage;
        
    }

    public static int getLevel(int realScore, int scoreOutOf) {

        double percentage = getPercentage(realScore, scoreOutOf);
        //get the overall grade using 85 - 75 scale
        return level;

    }


}
