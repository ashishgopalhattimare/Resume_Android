package com.android.ashish.resume.project;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.android.ashish.resume.R;

public class Project extends Fragment
{
    private static final String ARG_PAGE = "arg_page";

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
        View projectRootView = inflater.inflate(R.layout.project_item, parent, false);

        return projectRootView;
    }
}
