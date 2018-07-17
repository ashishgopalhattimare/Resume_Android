package com.android.ashish.resume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;

import com.android.ashish.resume.achievement.Achievement;
import com.android.ashish.resume.achievement.AchievementAdapter;
import com.android.ashish.resume.education.Education;
import com.android.ashish.resume.education.EducationAdapter;

import java.util.ArrayList;

public class AchievementActivity extends AppCompatActivity {

    Toolbar toolbar;
    private String description;

    private ListView listView;
    private AchievementAdapter achievementAdapter;
    private ArrayList<Achievement> achievementArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievement);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Achievements");

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        achievementArrayList = new ArrayList<Achievement>();

        this.description =
                "Completed a series of topics:_" +
                        "1. Introduction to Object Oriented Programming Concepts, Classes and Methods_" +
                        "2. Contructors, Operator Overloading and Members_" +
                        "3. Inheritance and Polymorphism_" +
                        "4. Standard Template Library (STL) of C++ (including Generic Templates)";
        achievementArrayList.add(new Achievement(R.drawable.iitbombay, "Indian Institute of Technology, Bombay",
                "Object Oriented Programming in C++ (Online Course), Computer Science",
                2018, 2018, this.description));

        this.description =
                "Build a decentralized BlockChain Project mainly working on the prototype of how" +
                        "the Community Funding should be done in Medical and Domestic Sector" +
                        "using BlockChain._" +
                        "The project was build using Javafx, web3j and python3";
        achievementArrayList.add(new Achievement(R.drawable.hack36, "Motilal Nehru National Institute of Technology, Allahabad",
                "Hackathon at MNNITA",
                2018, 2018, this.description));

        this.description =
                "Completed a series of topics:_" +
                        "1. User Input_" +
                        "2. Multiscreen Application_" +
                        "3. Data Storage using Contracts_" +
                        "4. Material Design";
        achievementArrayList.add(new Achievement(R.drawable.udacity, "Udacity",
                "Android Development (Online Course)",
                2018, 2018, this.description));

        this.description =
                "Completed a series of topics:_" +
                        "1. Unix and Command Line Basics_" +
                        "2. Working with Unix (wildcard, regex, searching, pipes and make)_" +
                        "3. Bash Programming_" +
                        "4. Git and Github (diffs, branching, markdown, pull request, pages, forking)";
        achievementArrayList.add(new Achievement(R.drawable.johnshopkins, "Johns Hopkins University School of Education",
                "Unix Programming (Online Course) by Sean Kross",
                2018, 2018, this.description));

        this.description =
                "Covered a series of topics:_" +
                        "1. How to Hack windows password internally and externally._" +
                        "2. Why http links are unsafe and how to hack using it.";
        achievementArrayList.add(new Achievement(R.drawable.dtudelhi, "Delhi Technological University, New Delhi",
                "Ethical Hacking Winter Training Course",
                2018, 2018, this.description));

        this.description =
                "Covered a series of topics:_" +
                        "1. Basics of Python and Unix Command_" +
                        "2. Introduction to Numpy Library and Jupyter Notebook_" +
                        "3. Application of Pandas Libray in Data Handling";
        achievementArrayList.add(new Achievement(R.drawable.datacamp, "DataCamp",
                "Python3 for Data Science",
                2018, 2018, this.description));

        this.description = "Learned the basics on how to create a website page using HTML5 and CSS3";
        achievementArrayList.add(new Achievement(R.drawable.edx, "Edx (W3Cx Course)",
                "HTML5 and CSS3 for Front-End Web Development",
                2018, 2018, this.description));


        achievementAdapter = new AchievementAdapter(this, achievementArrayList);

        listView = (ListView)findViewById(R.id.achievement_listview);
        listView.setAdapter(achievementAdapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch(item.getItemId())
        {
            case android.R.id.home:
                this.finish();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
