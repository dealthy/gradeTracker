package gradeTrackerSelf.gui;

import java.util.ArrayList;

public class subjectInfo {

	public String name = "";
	public boolean isHL = false;
	public int overallLevel = 0;
	public String teacher = "";
	//an array list that holds instances of assessments
	public ArrayList<assessments> markBook = new ArrayList<assessments>();

	//default constructor
	public subjectInfo() {
		this.name = "";
		this.isHL = false;
		this.overallLevel = 0;
		this.teacher = "";
		this.markBook = new ArrayList<assessments>();
	}

	//subject with basic info
	public subjectInfo(String name, boolean isHL, String teacher) {
		this.name = name;
		this.isHL = isHL;
		this.overallLevel = 0;
		this.teacher = teacher;
		this.markBook = new ArrayList<assessments>();
	}

	public static getScore(assessments test) {

		//a for loop that goes through all the scores of the test scores
		//using their weights to get the final score and fit it though the criterias

	}

}
