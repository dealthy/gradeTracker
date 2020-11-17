package gradeTrackerSelf.gui;

public class assessments {

    public String topic;
    public String type;
    //can only be: test, exam, assignment, homework, ia, other
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
    //a decimal number that counts as the percentage of the final grade
    //default to be just the same as other unset values spliting the unset chunk of 
    //the course
    //if set, it takes a percentage of the final score, leaving the rest to the unset

    //default constructors
    public assessments() {
        this.topic = "Theory of Knowledge Blog Post";
        this.type = "homework";
        this.dateD = 1;
        this.dateM = 9;
        this.dateY = 2020;
        this.givenLevel = getLevel(this.realScore, this.scoreOutOf);
        this.realScore = 10;
        this.scoreOutOf = 10;
        this.testPercentage = getPercentage(this.realScore, this.scoreOutOf);
        this.weight = splitWeight(this);
    }
    
    //constructor without level, and weight
    public assessments(String name, String type, int dateD, int dateM, int dateY, int realScore, int scoreOutOf) {
        this.topic = name;
        this.type = type;
        this.dateD = dateD;
        this.dateM = dateM;
        this.dateY = dateY;
        this.givenLevel = getLevel(this.realScore, this.scoreOutOf);
        this.realScore = realScore;
        this.scoreOutOf = scoreOutOf;
        this.testPercentage = getPercentage(this.realScore, this.scoreOutOf);
        this.weight = splitWeight(this);
    }
    
    //constructor without weight
    public assessments(String name, String type, int dateD, int dateM, int dateY, int givenLevel, int realScore, int scoreOutOf) {
        this.topic = name;
        this.type = type;
        this.dateD = dateD;
        this.dateM = dateM;
        this.dateY = dateY;
        this.givenLevel = givenLevel;
        this.realScore = realScore;
        this.scoreOutOf = scoreOutOf;
        this.testPercentage = getPercentage(this.realScore, this.scoreOutOf);
        this.weight = splitWeight(this);
    }

    //constructor with everything defined
    public assessments(String name, String type, int dateD, int dateM, int dateY, int givenLevel, int realScore, int scoreOutOf, double weight) {
        this.topic = name;
        this.type = type;
        this.dateD = dateD;
        this.dateM = dateM;
        this.dateY = dateY;
        this.givenLevel = givenLevel;
        this.realScore = realScore;
        this.scoreOutOf = scoreOutOf;
        this.testPercentage = getPercentage(this.realScore, this.scoreOutOf);
        this.weight = weight;
    }

    public static double getPercentage(int realScore, int scoreOutOf) {

        //get the test percentage to one decimal place percision
        
    }

    public static int getLevel(int realScore, int scoreOutOf) {

        double percentage = getPercentage(realScore, scoreOutOf);
        //get the overall grade using 85 - 75 scale

    }

    private double splitWeight(assessments homework) {
        //get the total unspecified weight works and evenly split them out in the 
        //unspecificied marks
    }


}
