package com.android.ashish.resume;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.android.ashish.resume.project.ProjectAdapter;

public class ProjectActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager projectViewPager;
    private ProjectAdapter projectAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Projects");

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tabLayout = (TabLayout)findViewById(R.id.tab_layout);

        projectViewPager = (ViewPager)findViewById(R.id.project_viewpager);

        projectAdapter = new ProjectAdapter(this, getSupportFragmentManager());

        projectViewPager.setAdapter(projectAdapter);

        tabLayout.setupWithViewPager(projectViewPager);
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
