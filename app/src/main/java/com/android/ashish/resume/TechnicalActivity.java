package com.android.ashish.resume;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.android.ashish.resume.technical.SkillAdapter;

public class TechnicalActivity extends AppCompatActivity {

    Toolbar toolbar;
    private GridView gridView;
    private SkillAdapter skillAdapter;

    int id_skillIcons[] = { R.drawable.cpp, R.drawable.c, R.drawable.java, R.drawable.python,
            R.drawable.c_sharp, R.drawable.android, R.drawable.css, R.drawable.html,
            R.drawable.terminal, R.drawable.github};

    int id_skillProgress[] = {80, 85, 75, 60, 40, 60, 30, 30, 65, 60};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical);

        toolbar = (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Technical Skills");

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        gridView = (GridView)findViewById(R.id.skill_gridview);
        skillAdapter = new SkillAdapter(TechnicalActivity.this, id_skillIcons, id_skillProgress);

        gridView.setAdapter(skillAdapter);
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
