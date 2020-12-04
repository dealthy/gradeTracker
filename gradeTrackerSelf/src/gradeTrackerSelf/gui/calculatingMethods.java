package gradeTrackerSelf.gui;

public abstract interface calculatingMethods {

    String findPercentage(int realScore, int scoreOutOf);

    int findLevel(int realScore, int scoreOutOf);

    double findWeight(int interchangeableWeight, int numToDistribute);

}
