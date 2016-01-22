package com.appodroid.mohitkhaitan.kiitfest.Adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.appodroid.mohitkhaitan.kiitfest.Data.EventDataMain;
import com.appodroid.mohitkhaitan.kiitfest.Data.EventDataShort;
import com.appodroid.mohitkhaitan.kiitfest.Data.ImageData;
import com.appodroid.mohitkhaitan.kiitfest.R;
import com.bumptech.glide.Glide;

import java.util.List;

/**
 * Created by MOHIT KHAITAN on 21-01-2016.
 */
public class EventRecyclerViewAdapter extends RecyclerView.Adapter<EventRecyclerViewAdapter.ImageViewHolder> {

    List<ImageData> imgData;
    List<EventDataMain> evntDataMain;
    List<EventDataShort> evntDataShort;
    private Context context;

   public EventRecyclerViewAdapter(List<ImageData> imgData, List<EventDataMain> evntDataMain, List<EventDataShort> evntDataShort, Context context){
        this.imgData = imgData;
        this.evntDataMain = evntDataMain;
        this.evntDataShort = evntDataShort;
       this.context = context;
    }

    @Override
    public EventRecyclerViewAdapter.ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_card_view, parent, false);
        ImageViewHolder ivh = new ImageViewHolder(v);
        return ivh;
    }

    @Override
    public void onBindViewHolder(EventRecyclerViewAdapter.ImageViewHolder holder, int position) {

        Glide.with(context).load(imgData.get(position).pics).into(holder.eventImageView);
        holder.mainEventText.setText(evntDataMain.get(position).mainEventName);
        holder.shortDescpText.setText(evntDataShort.get(position).shortEventName);

    }

    @Override
    public int getItemCount() {
        return imgData.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView){
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class ImageViewHolder extends RecyclerView.ViewHolder {
        CardView eventCardView;
        ImageView eventImageView;
        TextView mainEventText, shortDescpText;

        ImageViewHolder(View itemView){
            super(itemView);

            eventCardView = (CardView)itemView.findViewById(R.id.card_view);
            eventImageView = (ImageView)itemView.findViewById(R.id.main_event_image);
            mainEventText = (TextView)itemView.findViewById(R.id.event_name);
            shortDescpText = (TextView)itemView.findViewById(R.id.event_short_detail);

        }
    }
}
