package org.example.android.flickrbrowser;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Ayoub
 */
public class FlickrImageViewHolder extends RecyclerView.ViewHolder {
    protected CircleImageView thumbnail;
    protected TextView title;
    protected TextView info;

    public FlickrImageViewHolder(View view) {
        super(view);
        this.thumbnail = (CircleImageView) view.findViewById(R.id.thumbnail);
        this.title = (TextView) view.findViewById(R.id.title);
        this.info = (TextView) view.findViewById(R.id.info);

    }
}
