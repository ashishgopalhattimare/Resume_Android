package com.android.ashish.resume;

import android.app.Dialog;
import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;

public class ResumeActivity extends AppCompatActivity implements View.OnClickListener{

    private CardView educationCard, technicalCard, projectCard, achieveCard;
    private ConstraintLayout resumeLayout;

    private static final String resume_url = "https://drive.google.com/uc?export=download&id=1JNMXYf8Ct7dx8mnw6PAWdbULlIgd076f";

    private FloatingActionButton fab_downloadResume;
    private DownloadManager downloadManager;

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

        resumeLayout = (ConstraintLayout)findViewById(R.id.resume_layout);

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

        fab_downloadResume = (FloatingActionButton)findViewById(R.id.download_resume);
        fab_downloadResume.setOnClickListener(this);
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

            case R.id.download_resume:
                downloadResume();

                break;

            default: break;
        }
    }

    private void downloadResume()
    {
        downloadManager = (DownloadManager)getSystemService(Context.DOWNLOAD_SERVICE);

        Uri uri = Uri.parse(resume_url);
        DownloadManager.Request request = new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        Long reference = downloadManager.enqueue(request);

        Snackbar.make(resumeLayout, "Resume downloading", Snackbar.LENGTH_SHORT).show();

    }

}
