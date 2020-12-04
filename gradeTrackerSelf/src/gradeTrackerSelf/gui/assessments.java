package gradeTrackerSelf.gui;

public abstract class assessments implements calculatingMethods{

    private String topic;
    private int dateD;
    //can only be 1 - 31
    private int dateM;
    //can only be 1 - 12
    private int dateY;
    //4 digit number
    private int level;
    //used for overall score with weighting
    //optional: will implement 85 - 75 scale after calculating the percentage
    public int realScore;
    //scores got
    private int scoreOutOf;
    //score out of
    private String testPercentage;
    private double weight;
    //the weight that the work occupies in the final grade
    private int instanceCount;
    //number of instances that don't have specific weighting

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
        this.weight = 0;
        this.instanceCount = 1;

    }

    //method to get the percentage of the test to 2 decimal places precision
    public String findPercentage(int realScore, int scoreOutOf) {

        double percent = (double) realScore / scoreOutOf;
        final double PRECISION = 0.01;
        percent = (percent - (percent % PRECISION)) * 100; 
        String percentage = percent + "%";

        return percentage;
        
    }

    //get the level by the percentage using the 85-75-65-etc scale
    public int findLevel(int realScore, int scoreOutOf) {

        Double percentage = new Double();
        percentage = Double.valueOf(getPercentage(this.realScore, this.scoreOutOf));
        int level = 0;

        //get the overall grade using 85 - 75 scale
        if(percentage.compareTo(Double.valueOf(85)) >= 1) {
            return 7;
        } else if(percentage.compareTo(Double.valueOf(75)) >= 1) {
            return 6;
        } else if(percentage.compareTo(Double.valueOf(65)) >= 1) {
            return 5;
        } else if(percentage.compareTo(Double.valueOf(55)) >= 1) {
            return 4;
        } else if(percentage.compareTo(Double.valueOf(45)) >= 1) {
            return 3;
        } else if(percentage.compareTo(Double.valueOf(35)) >= 1) {
            return 2;
        } else if(percentage.compareTo(Double.valueOf(25)) >= 1) {
            return 1;
        } else {
            return 0;
        }

        return level;

    }

    //if there is no specific weighting for the test
    public double findWeight(int interchangeableWeight, int numToDistribute) {

        double eachWeight = (double) numToDistribute / interchangeableWeight;
        return eachWeight;  

    }


}
