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

        achievementArrayList.add(new Achievement(R.drawable.iitbombay, "Indian Institute of Technology, Bombay",
                "Object Oriented Programming in C++ (Online Course), Computer Science",
                2018, 2018, "detail"));

        achievementArrayList.add(new Achievement(R.drawable.hack36, "Motilal Nehru National Institute of Technology, Allahabad",
                "Hackathon at MNNITA",
                2018, 2018, "detail"));

        achievementArrayList.add(new Achievement(R.drawable.udacity, "Udacity",
                "Android Development (Online Course)",
                2018, 2018, "detail"));

        achievementArrayList.add(new Achievement(R.drawable.johnshopkins, "Johns Hopkins University School of Education",
                "Unix Programming (Online Course) by Sean Kross",
                2018, 2018, "detail"));

        achievementArrayList.add(new Achievement(R.drawable.dtudelhi, "Delhi Technological University, New Delhi",
                "Ethical Hacking Winter Training Course",
                2018, 2018, "detail"));

        achievementArrayList.add(new Achievement(R.drawable.datacamp, "DataCamp",
                "Python3 for Data Science",
                2018, 2018, "detail"));

        achievementArrayList.add(new Achievement(R.drawable.edx, "Edx (W3Cx Course)",
                "HTML5 and CSS3 for Front-End Web Development",
                2018, 2018, "detail"));


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
