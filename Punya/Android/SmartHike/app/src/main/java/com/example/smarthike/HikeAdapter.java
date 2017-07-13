package com.example.smarthike;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;

public class HikeAdapter extends ArrayAdapter<Hike>{

    Context mContext;
    int mLayoutResourceId;

    public HikeAdapter(Context context, int layoutResourceId) {
        super(context, layoutResourceId);

        mContext = context;
        mLayoutResourceId = layoutResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;

        final Hike currentItem = getItem(position);

        if (row == null) {
            LayoutInflater inflater = ((Activity) mContext).getLayoutInflater();
            row = inflater.inflate(mLayoutResourceId, parent, false);
        }

        row.setTag(currentItem);
        final EditText hikeName = (EditText) row.findViewById(R.id.lbl_hikeName);
        hikeName.setText(currentItem.getText());

        final EditText hikeDescription = (EditText) row.findViewById(R.id.txt_hikeDescription);
        hikeDescription.setText(currentItem.getHikeDescription());

        final ImageView hikeImage = (ImageView) row.findViewById(R.id.img_hikeImage);
        hikeImage.setImageResource(R.drawable.background);

        return row;
    }
}
