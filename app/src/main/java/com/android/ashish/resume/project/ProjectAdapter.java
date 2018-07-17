package com.android.ashish.resume.project;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.android.ashish.resume.ProjectActivity;

public class ProjectAdapter extends FragmentStatePagerAdapter
{
    private Context context;
    private final int pageCount = 10;

    public ProjectAdapter(ProjectActivity projectActivity, FragmentManager supportFragmentManager)
    {
        super(supportFragmentManager);
        context = projectActivity;
    }

    @Override
    public Fragment getItem(int position)
    {
        Project project = Project.newInstance(position);
        return project;
    }

    @Override
    public int getCount() {
        return pageCount;
    }

    @Override
    public CharSequence getPageTitle(int position)
    {
        return "P   " + position;
    }
}
