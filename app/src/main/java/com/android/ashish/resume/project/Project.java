package com.android.ashish.resume.project;

import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.android.ashish.resume.R;

public class Project extends Fragment
{
    private static final String ARG_PAGE = "arg_page";

    private static int title[] = {R.string.minesweeper_title, R.string.brick_breaker_title};
    private static int description[] =
            {
                    R.string.minesweeper_description,
                    R.string.brick_breaker_description
            };

    private static int images[][] =
            {
                    {R.drawable.minesweeper1, R.drawable.minesweeper2, R.drawable.minesweeper3, R.drawable.minesweeper4},
                    {R.drawable.brick_breaker1, R.drawable.brick_breaker2, R.drawable.brick_breaker3, R.drawable.brick_breaker4}
            };

    private int index;


    // Required empty public Constructor
    public Project() { }

    public void newInstance(int projectNumber)
    {
        Project project = new Project();
        Bundle arg = new Bundle();

        arg.putInt(ARG_PAGE, projectNumber);
        project.setArguments(arg);

        index = projectNumber;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        final View projectView = inflater.inflate(R.layout.project_item, parent, false);

        TextView projectTitle = (TextView) projectView.findViewById(R.id.project_title);
        TextView projectDescribe = (TextView)projectView.findViewById(R.id.project_description);
        TextView projectRole = (TextView)projectView.findViewById(R.id.project_role);
        LinearLayout projectImages = (LinearLayout)projectView.findViewById(R.id.project_imageLayout);

        projectTitle.setText(getString(title[index]));
        projectDescribe.setText(Html.fromHtml(getString(description[index])));

        for(int i = 0; i < images[index].length; i++) {
            ImageView imageView = (ImageView)LayoutInflater.from(getContext()).inflate(R.layout.image_item, parent, false);
            imageView.setImageResource(images[index][i]);
            projectImages.addView(imageView);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getContext(), "Image Clicked : [ "+index+" ]", Toast.LENGTH_SHORT).show();
                }
            });
        }

        return projectView;
    }
}
