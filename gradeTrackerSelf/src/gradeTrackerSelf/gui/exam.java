package gradeTrackerSelf.gui;

public class exam extends assessments{

    public test(String name, int dateD, int dateM, int dateY, int givenLevel, int realScore, int scoreOutOf, double weight, int instanceCount) {
        this.topic = name;
        this.dateD = dateD;
        this.dateM = dateM;
        this.dateY = dateY;
        this.givenLevel = givenLevel;
        this.realScore = realScore;
        this.scoreOutOf = scoreOutOf;
        this.testPercentage = getPercentage(this.realScore, this.scoreOutOf);
        this.weight = weight;
        this.instanceCount = instanceCount;
    }

}
