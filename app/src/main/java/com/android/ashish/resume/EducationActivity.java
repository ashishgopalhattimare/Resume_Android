package com.android.ashish.resume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ListView;

import com.android.ashish.resume.education.Education;
import com.android.ashish.resume.education.EducationAdapter;

import java.util.ArrayList;

public class EducationActivity extends AppCompatActivity {

    private Toolbar toolbar;

    private EducationAdapter educationAdapter;
    private ArrayList<Education> educationArrayList;

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Education");

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        educationArrayList = new ArrayList<Education>();

        educationArrayList.add(new Education("B.tech", "Computer Science and Engineering",
                "Motilal Nehru National Institute of Technology, Allahabad",
                6.92, 2016, 2020, true, true));

        educationArrayList.add(new Education("XII (Senior Secondary)", "Science",
                "Don Mills Collegiate Institute, Toronto",
                7.77, 2015, 2016, false, false));

        educationArrayList.add(new Education("X (Secondary)", "",
                "Don Mills Collegiate Institute, Toronto",
                8.64, 2013, 2014, false, false));


        educationAdapter = new EducationAdapter(this, educationArrayList);

        listView = (ListView)findViewById(R.id.education_listview);
        listView.setAdapter(educationAdapter);
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
