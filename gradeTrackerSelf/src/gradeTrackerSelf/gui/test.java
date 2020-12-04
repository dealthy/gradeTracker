package gradeTrackerSelf.gui;

public class test extends assessments{

    public test(String name, int dateD, int dateM, int dateY, int givenLevel, int realScore, int scoreOutOf, int instanceCount) {
        this.topic = name;
        this.dateD = dateD;
        this.dateM = dateM;
        this.dateY = dateY;
        this.givenLevel = getLevel(this.realsScore, this.scoreOutOf);
        this.realScore = realScore;
        this.scoreOutOf = scoreOutOf;
        this.testPercentage = getPercentage(this.realScore, this.scoreOutOf);
        this.weight = getWeight(1, instanceCount);
        this.instanceCount = instanceCount;
    }

}
