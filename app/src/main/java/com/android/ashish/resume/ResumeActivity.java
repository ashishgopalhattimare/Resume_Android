package com.android.ashish.resume;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ResumeActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView educationCard, technicalCard, projectCard, achieveCard;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId())
            {
                case R.id.profile_dashboard:
                    startActivity(new Intent(ResumeActivity.this, MainActivity.class));
                    return true;

                // Since this is the same activity, dont do anything
                case R.id.resume_dashboard:
                    return true;

                case R.id.share_dashboard:
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        navigation.setSelectedItemId(R.id.resume_dashboard);

        educationCard = (CardView)findViewById(R.id.education_card);
        technicalCard = (CardView)findViewById(R.id.technical_card);
        achieveCard = (CardView)findViewById(R.id.achievement_card);
        projectCard = (CardView)findViewById(R.id.project_card);

        educationCard.setOnClickListener(this);
        technicalCard.setOnClickListener(this);
        projectCard.setOnClickListener(this);
        achieveCard.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch(view.getId()) {
            case R.id.education_card:
                startActivity(new Intent(ResumeActivity.this, EducationActivity.class));
                break;

            case R.id.technical_card:
                startActivity(new Intent(ResumeActivity.this, TechnicalActivity.class));
                break;

            case R.id.achievement_card:
                startActivity(new Intent(ResumeActivity.this, AchievementActivity.class));
                break;

            case R.id.project_card:
                startActivity(new Intent(ResumeActivity.this, ProjectActivity.class));
                break;

            default: break;
        }
    }

    private void toast(String str)
    {
        Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();
    }
}
