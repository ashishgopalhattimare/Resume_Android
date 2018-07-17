package com.android.ashish.resume.achievement;

public class Achievement
{
    private int id_image;
    private String achieveCollege;
    private String achieveCourse;
    private int startingYear, endYear;

    private String achieveDescription;

    public Achievement(int id_image, String achieveCollege, String achieveCourse, int startingYear, int endYear, String description)
    {
        this.id_image = id_image;
        this.achieveCollege = achieveCollege;
        this.achieveCourse = achieveCourse;
        this.startingYear = startingYear;
        this.endYear = endYear;

        this.achieveDescription = description;
    }

    public int getId_image() {
        return this.id_image;
    }

    public int getStartingYear() {
        return this.startingYear;
    }

    public int getEndYear() {
        return this.endYear;
    }

    public String getAchieveCollege() {
        return this.achieveCollege;
    }

    public String getAchieveCourse() {
        return this.achieveCourse;
    }

    public String getAchieveDescription() {
        return this.achieveDescription;
    }
}
