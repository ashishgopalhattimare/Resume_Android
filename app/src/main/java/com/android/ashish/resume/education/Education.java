package com.android.ashish.resume.education;

public class Education
{
    private String institute;
    private String academic_degree;
    private String branch;
    private int starting_year, passing_year;
    private double percentage;

    private boolean collegeEducation, currentGoing;

    public Education(String academic_degree, String branch, String institute, double percentage, int starting_year, int passing_year, boolean collegeEducation, boolean currentGoing)
    {
        this.academic_degree = academic_degree;
        this.branch = branch;
        this.institute = institute;
        this.percentage = percentage;
        this.starting_year = starting_year;
        this.passing_year = passing_year;

        this.collegeEducation = collegeEducation;
        this.currentGoing = currentGoing;
    }

    public String getAcademic_degree() {
        return this.academic_degree;
    }

    public String getBranch() {
        return this.branch;
    }

    public String getInstitute() {
        return this.institute;
    }

    public double getPercentage() {
        return this.percentage;
    }

    public int getStarting_year() {
        return this.starting_year;
    }

    public int getPassing_year() {
        return this.passing_year;
    }

    public boolean isCurrentGoing() {
        return this.currentGoing;
    }

    public boolean isCollegeEducation() {
        return this.collegeEducation;
    }
}
