package com.android.ashish.resume.technical;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.android.ashish.resume.R;

import java.util.ArrayList;
import java.util.HashMap;

public class SkillAdapter extends BaseAdapter
{
    private Context context;
    private int id_icon[];
    private int id_skillProgress[];

    public SkillAdapter(Context context, int id_icon[], int id_skillProgress[])
    {
        this.context = context;
        this.id_icon = id_icon;
        this.id_skillProgress = id_skillProgress;
    }

    @Override
    public int getCount() {
        return id_icon.length;
    }

    @Override
    public Object getItem(int position) {
        return id_icon[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View gridItemView = convertView;
        if(gridItemView == null) {
            gridItemView = LayoutInflater.from(this.context).inflate(R.layout.skill_item, parent, false);
        }

        ImageView skillImage = (ImageView)gridItemView.findViewById(R.id.skill_image);
        ProgressBar skillProgress = (ProgressBar)gridItemView.findViewById(R.id.skill_progress);

        skillImage.setImageResource(id_icon[position]);
        skillProgress.setProgress(id_skillProgress[position]);

        return gridItemView;
    }
}
