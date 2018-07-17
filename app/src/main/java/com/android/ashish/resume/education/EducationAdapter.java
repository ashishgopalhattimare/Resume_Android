package com.android.ashish.resume.education;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.android.ashish.resume.EducationActivity;
import com.android.ashish.resume.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class EducationAdapter extends ArrayAdapter<Education> {

    public static DecimalFormat decimalFormat;

    public EducationAdapter(EducationActivity activity, ArrayList<Education> educationArrayList)
    {
        super(activity, 0, educationArrayList);

        decimalFormat = new DecimalFormat("#.##");
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.education_item, parent, false);
        }

        Education currentEducation = getItem(position);

        TextView academic_textView = (TextView)listItemView.findViewById(R.id.academic_degree);
        TextView completion_textView = (TextView)listItemView.findViewById(R.id.year_completion);
        TextView institute_textView = (TextView)listItemView.findViewById(R.id.institute_name);
        TextView percentageLabel_textView = (TextView)listItemView.findViewById(R.id.percentageLabel);
        TextView percentage_textView = (TextView)listItemView.findViewById(R.id.percentage);

        String institute = currentEducation.getInstitute();
        String degree = currentEducation.getAcademic_degree();
        String branch = currentEducation.getBranch();
        int yearPassing = currentEducation.getPassing_year();
        int yearStarting = currentEducation.getStarting_year();
        boolean currentGoing = currentEducation.isCurrentGoing();
        boolean collegeEducation = currentEducation.isCollegeEducation();
        double percentage = currentEducation.getPercentage();

        percentage_textView.setText(decimalFormat.format(percentage));

        if(collegeEducation) {

            academic_textView.setText(branch + " (" + degree + ")");
            percentageLabel_textView.setText("CGPA : ");
            percentage_textView.append("/10");
        }
        else {

            academic_textView.setText(degree);
            if(branch.length() > 0) {
                academic_textView.append(" (" + branch + ")");
            }

            percentageLabel_textView.setText("Percentage : ");
            percentage_textView.append("%");
        }

        if(currentGoing) {
            completion_textView.setText("Year of Completion : " + yearStarting + " - current");
        } else {
            completion_textView.setText("Year of Completion : " + yearPassing);
        }

        institute_textView.setText(institute);

        return listItemView;
    }
}
