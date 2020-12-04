package gradeTrackerSelf.gui;

public class assignment extends assessments {

    public homework(String name, int dateD, int dateM, int dateY, int level, int realScore, int scoreOutOf, int weight, int instanceCount) {

        this.topic = name;
        this.dateD = dateD;
        this.dateM = dateM;
        this.dateY = dateY;
        this.givenLevel = level;
        this.realScore = realScore;
        this.scoreOutOf = scoreOutOf;
        this.testPercentage = getPercentage(this.realScore, this.scoreOutOf);
        this.weight = weight;
        this.instanceCount = instanceCount;
        
    }

}
