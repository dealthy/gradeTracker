package gradeTrackerSelf.gui;

public class homework extends assessments{

    public homework(String name, int dateD, int dateM, int dateY, int realScore, int scoreOutOf, int instanceCount) {

        this.topic = name;
        this.dateD = dateD;
        this.dateM = dateM;
        this.dateY = dateY;
        this.givenLevel = getLevel(this.realScore, this.scoreOutOf);
        this.realScore = realScore;
        this.scoreOutOf = scoreOutOf;
        this.testPercentage = getPercentage(this.realScore, this.scoreOutOf);
        this.weight = getWeight(1, instanceCount);
        this.instanceCount = instanceCount;
        
    }

}
