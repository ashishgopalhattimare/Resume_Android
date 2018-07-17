package com.android.ashish.resume.project;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;

import com.android.ashish.resume.R;

public class Project extends Fragment
{
    private static final String ARG_PAGE = "arg_page";

    private String description = "<p>Minesweeper is a desktop appication game which is build using " +
            "Java GUI Development. The working of the game is very much similar to the default " +
            "minesweeper game fron windows xp.</p><p>The game include timer which start when the " +
            "player mines the first block of the game. The timer is displayed digitally which is " +
            "created by using digital-number images from the images folder in the directory.<br/>" +
            "<br/>It also includes help option which could be used to get detailed description about" +
            " the game components.</p><p>The game has different level of difficulties. They are as " +
            "follow:</p><p>- Beginner<br/><br/>- Intermediate<br/><br/>- Expert<br/><br/>- <b>Custom" +
            " : </b>This options gives the user to customize the level of difficulty on their own.</p>";

    // Required empty public Constructor
    public Project() { }

    public static Project newInstance(int projectNumber)
    {
        Project project = new Project();
        Bundle arg = new Bundle();

        arg.putInt(ARG_PAGE, projectNumber);
        project.setArguments(arg);

        return project;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState)
    {
        View projectView = inflater.inflate(R.layout.project_item, parent, false);

        TextView projectTitle = (TextView) projectView.findViewById(R.id.project_title);
        EditText projectDescribe = (EditText)projectView.findViewById(R.id.project_description);
        EditText projectRole = (EditText)projectView.findViewById(R.id.project_role);

        projectTitle.setText("Minesweeper Pro");
        projectDescribe.setText(Html.fromHtml(this.description));

        return projectView;
    }
}
