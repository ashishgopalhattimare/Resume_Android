package com.android.ashish.resume.achievement;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.ashish.resume.AchievementActivity;
import com.android.ashish.resume.EducationActivity;
import com.android.ashish.resume.R;
import com.android.ashish.resume.education.Education;

import java.util.ArrayList;

public class AchievementAdapter extends ArrayAdapter<Achievement>
{

    public AchievementAdapter(AchievementActivity activity, ArrayList<Achievement> achievementArrayList)
    {
        super(activity, 0, achievementArrayList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.achievement_item, parent, false);
        }

        Achievement currentAchievement = getItem(position);

        ImageView logo_imageView = (ImageView)listItemView.findViewById(R.id.achieve_image);
        TextView college_textView = (TextView)listItemView.findViewById(R.id.achieve_college);
        TextView course_textView = (TextView)listItemView.findViewById(R.id.achieve_course);
        TextView completion_textView = (TextView)listItemView.findViewById(R.id.achieve_year);
        EditText description_editText = (EditText) listItemView.findViewById(R.id.achieve_description);


        logo_imageView.setImageResource(currentAchievement.getId_image());
        college_textView.setText(currentAchievement.getAchieveCollege());
        course_textView.setText(currentAchievement.getAchieveCourse());
        completion_textView.setText(currentAchievement.getStartingYear() + " - " + currentAchievement.getStartingYear());
        description_editText.setText(currentAchievement.getAchieveDescription());

        return listItemView;
    }
}
