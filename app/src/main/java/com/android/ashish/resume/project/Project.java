package com.android.ashish.resume.project;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Project extends Fragment
{
    private static final String ARG_PAGE = "arg_page";

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
        // Frame that you are returning
        Bundle arg = getArguments();

        TextView textView = new TextView(getActivity());
        textView.setText("Project " + (arg.getInt(ARG_PAGE) + 1));
        textView.setGravity(Gravity.CENTER);

        return textView;
    }
}
